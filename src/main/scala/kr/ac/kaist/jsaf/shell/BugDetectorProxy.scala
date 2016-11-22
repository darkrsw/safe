package kr.ac.kaist.jsaf.shell

import java.io.{BufferedWriter, File, FileWriter}
import java.text.SimpleDateFormat
import java.util.Calendar

import edu.rice.cs.plt.tuple.{Option => JOption}
import kr.ac.kaist.jsaf.analysis.cfg.CFGBuilder
import kr.ac.kaist.jsaf.analysis.typing.models.DOMBuilder
import kr.ac.kaist.jsaf.analysis.typing.{AddressManager, Config, Helper, InitHeap, Typing, TypingInterface}
import kr.ac.kaist.jsaf.bug_detector.{BugDetector, BugEntry2, BugList2, StrictModeChecker}
import kr.ac.kaist.jsaf.compiler.{Parser, Predefined}
import kr.ac.kaist.jsaf.exceptions.UserError
import kr.ac.kaist.jsaf.nodes.{IRRoot, Program}
import kr.ac.kaist.jsaf.nodes_util.{DOMStatistics, JSFromHTML, NodeRelation, NodeUtil}
import kr.ac.kaist.jsaf.scala_src.nodes.{SProgram, STopLevel}
import kr.ac.kaist.jsaf.scala_src.useful.Lists._
import kr.ac.kaist.jsaf.useful.Pair
import kr.ac.kaist.jsaf.{ProjectProperties, Shell, ShellParameters}

import scala.collection.JavaConversions
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent._
import scala.concurrent.duration._
import scala.sys.process._

/**
  * Created by darkrsw on 2016/October/22.
  */
object BugDetectorProxy
{
  // default timeout
  var timeout = 60 * 3

  // class path (should be set by other classes)
  var classPathString: String = ""

  def detectBugsOnJVM(opt: String, filePath: String, relPath: String): (Int, String) =
  {
    val cmd = "java -cp " + classPathString +  " -Xmx4g " +
      "kr.ac.kaist.jsaf.shell.BugDetectorProxy " + opt + " " + filePath + " " + relPath

    val stdout = new StringBuilder
    //val stderr = new StringBuilder

    val recorder = ProcessLogger(
      (o: String) => if( o.startsWith("OUTPUT:") ) stdout.append(o.replaceFirst("OUTPUT:","")+"\n"),
      (e: String) => Console.err.println(e)
    )

    val proc = cmd.run(recorder)

    val f = Future(blocking(proc.exitValue()))
    val exitCode = try {
      Await.result(f, timeout+1 second)
    } catch {
      case e: TimeoutException =>
        Console.err.println(getTimeString() + "Timeout from JVM...")
        //killProcess(proc) // to send SIGKILL
        proc.destroy()
        4 // exitCode = 4
    }

    (exitCode, stdout.toString())
  }

  def detectJSBugsOnJVM(filePath: String, relPath: String): (Int, String) = detectBugsOnJVM("jss", filePath, relPath)

  def detectWebAppBugsOnJVM(filePath: String, relPath: String): (Int, String) = detectBugsOnJVM("webapp", filePath, relPath)


  ///////////////////////////////////////////////////////////////////////////////////////////////

  def detectJSBugs(inFile: File): BugList2 = {
    val quiet = true
    val option1 = Array[String]("bug-detector", "-dev")
    val timeout_opt = if (timeout > 0) {
      Array[String]("-timeout", timeout.toString)
    } else {
      Array[String]()
    }
    val tokens = option1 ++ timeout_opt ++ Array[String](inFile.getCanonicalPath)

    Shell.params = new ShellParameters()
    val errorMessage = Shell.params.Set(tokens)
    val pred = new Predefined(Shell.params)

    Config.setQuietMode

    val locclone = Shell.params.opt_LocClone

    AddressManager.reset()


    val fileName: String = Shell.params.FileNames(0)
    val fileNames = JavaConversions.seqAsJavaList(Shell.params.FileNames)
    Config.setFileName(fileName)

    if (Shell.params.opt_loop) Config.setLoopMode
    if (Shell.params.opt_Verbose1) Config.setVerbose(1)
    if (Shell.params.opt_Verbose2) Config.setVerbose(2)
    if (Shell.params.opt_Verbose3) Config.setVerbose(3)

    if (Shell.params.opt_Compare) Config.setCompareMode

    // Context-sensitivity for main analysis
    var context: Int = -1
    context = Config.contextSensitivityMode

    // Temporary parameter setting for html and bug-detector
    if (Shell.params.command == ShellParameters.CMD_BUG_DETECTOR) {
      context = Config.Context_OneCallsiteAndObject
    }

    context = Config.Context_OneCallsiteAndObject

    Config.setContextSensitivityMode(context)

    Config.setDefaultUnrollingCount(Shell.params.opt_unrollingCount)
    Config.setDefaultForinUnrollingCount(Shell.params.opt_forinunrollingCount)

    // Initialize AbsString cache
    kr.ac.kaist.jsaf.analysis.typing.domain.AbsString.initCache

    // Read a JavaScript file and translate to IR
    var program: Program = null

    program = Parser.fileToAST(fileNames)

    // concatenate modeled ASTs
    val SEP = File.separator
    val base = ProjectProperties.BASEDIR + SEP
    val modeledFiles: List[String] =
      ((List[String](base + "bin/models/builtin/__builtin__.js")) ++
        (if (Config.domMode) List(base + "bin/models/dom/__dom__.js") else List[String]())).filter(f => {
        val file = new File(f)
        file.exists()
      })

    // input files for webapp bugdetector
    val inputFiles: List[String] = List()

    Config.setModeledFiles(Config.getModeledFiles ++ modeledFiles ++ inputFiles)
    val modeledASTs: Program = Parser.fileToAST(toJavaList(modeledFiles ++ inputFiles))
    program = (modeledASTs, program) match {
      case (SProgram(info0, STopLevel(fds0, vds0, body0)), SProgram(info1, STopLevel(fds1, vds1, body1))) =>
        SProgram(info1, STopLevel(fds0 ++ fds1, vds0 ++ vds1, body0 ++ body1))
    }

    val irErrors = Shell.ASTtoIR(fileName, program, JOption.none[String], JOption.none[kr.ac.kaist.jsaf.nodes_util.Coverage])
    val irOpt: JOption[IRRoot] = irErrors.first
    val program2: Program = irErrors.third // Disambiguated and hoisted and with written

    val ir: IRRoot = irOpt.unwrap

    val builder = new CFGBuilder(ir)
    val cfg = builder.build

    val errors = builder.getErrors
    if (!(errors.isEmpty)) {
      Shell.reportErrors(NodeUtil.getFileName(ir), Shell.flattenErrors(errors), JOption.none[Pair[FileWriter, BufferedWriter]])
    }

    // Initialize bulit-in models
    val previousBasicBlocks: Int = cfg.getNodes.size

    val init = new InitHeap(cfg)
    init.initialize

    val presentBasicBlocks = cfg.getNodes.size

    // Set the initial state with DOM objects
    var jshtml: JSFromHTML = null
    if (Config.domMode && jshtml != null) new DOMBuilder(cfg, init, jshtml.getDocument).initialize(quiet)

    // Create Typing
    var typingInterface: TypingInterface = null
    if (Shell.params.command == ShellParameters.CMD_ANALYZE ||
      Shell.params.command == ShellParameters.CMD_HTML ||
      Shell.params.command == ShellParameters.CMD_BUG_DETECTOR ||
      Shell.params.command == ShellParameters.CMD_WEBAPP_BUG_DETECTOR) typingInterface = new Typing(cfg, quiet, locclone)

    Config.setTypingInterface(typingInterface)

    // Check global variables in initial heap against list of predefined variables.
    init.checkPredefined

    // Analyze
    if (Shell.params.command == ShellParameters.CMD_ANALYZE ||
      Shell.params.command == ShellParameters.CMD_PREANALYZE ||
      Shell.params.command == ShellParameters.CMD_HTML ||
      Shell.params.command == ShellParameters.CMD_HTML_PRE ||
      Shell.params.command == ShellParameters.CMD_BUG_DETECTOR ||
      Shell.params.command == ShellParameters.CMD_WEBAPP_BUG_DETECTOR) {
      typingInterface.analyze(init)
    }

    // Turn off '-max-loc-count' option
    Shell.params.opt_MaxLocCount = 0

    // Bug Detector
    NodeRelation.set(program2, ir, cfg, quiet)

    // Execute Bug Detector
    System.out.println("\n* Bug Detector *")
    val detector = new BugDetector(program2, cfg, typingInterface, quiet, irErrors.second)
    if(!(Shell.params.command == ShellParameters.CMD_WEBAPP_BUG_DETECTOR))
      StrictModeChecker.checkAdvanced(program2, cfg, detector.varManager, detector.stateManager)

    val bugStorage = detector.detectBug2
    val bugList = bugStorage.getBugList()

    //bugList.foreach( x => println(stringfy(x)) )
    println("Total #bugs: " + bugList.size)

    return bugList
  }

  def init() =
  {
    // init
    AddressManager.init()
    Helper.init()
    AnalyzeMain.isTimeout = false
  }

  def detectWebAppBugs(inFile: File): BugList2 = {
    val quiet = true

    val option1 = Array[String]("webapp-bug-detector", "-dev")
    val timeout_opt = if (timeout > 0) {
      Array[String]("-timeout", timeout.toString)
    } else {
      Array[String]()
    }
    val tokens = option1 ++ timeout_opt ++ Array[String](inFile.getCanonicalPath)

    //val tokens = Array[String]("webapp-bug-detector", "-dev", "-timeout", , inFile.getCanonicalPath)
    Shell.params = new ShellParameters()
    val errorMessage = Shell.params.Set(tokens)
    val pred = new Predefined(Shell.params)

    Config.setQuietMode
    var locclone = Shell.params.opt_LocClone


    // Init Global settings and Singleton Object.
    AddressManager.reset()

    val fileName: String = Shell.params.FileNames(0)
    val fileNames = JavaConversions.seqAsJavaList(Shell.params.FileNames)
    Config.setFileName(fileName)

    if(Shell.params.opt_loop) Config.setLoopMode
    if (Shell.params.opt_Verbose1) Config.setVerbose(1)
    if (Shell.params.opt_Verbose2) Config.setVerbose(2)
    if (Shell.params.opt_Verbose3) Config.setVerbose(3)

    if (Shell.params.opt_Compare) Config.setCompareMode

    // Context-sensitivity for main analysis
    var context: Int = -1
    context = Config.contextSensitivityMode

    Config.setContextSensitivityMode(context)

    Config.setDefaultUnrollingCount(Shell.params.opt_unrollingCount)
    Config.setDefaultForinUnrollingCount(Shell.params.opt_forinunrollingCount)

    //if (Shell.params.FileNames.length > 1) throw new UserError("Only one HTML file supported at a time.")
    val low = fileName.toLowerCase
    if (!(low.endsWith(".html") || low.endsWith(".xhtml") || low.endsWith(".htm"))) throw new UserError("Not an HTML file.")
    // DOM mode
    Config.setDomMode
    if(Shell.params.opt_jQuery) Config.setJQueryMode
    if(Shell.params.opt_Domprop) Config.setDOMPropMode
    if(Shell.params.opt_disEvent) Config.setDisableEventMode
    if(Shell.params.opt_loop) Config.setLoopMode

    Config.setDefaultForinUnrollingCount(1)
    // loop sensitivity
    Config.setLoopSensitiveMode(true)
    // call context depth : 10
    Config.setContextSensitivityMode(Config.Context_Loop)
    Config.setContextSensitivityDepth(10)
    // location cloning
    Shell.params.opt_LocClone = true
    locclone = true
    // dom property like 'innerHTML' update mode
    Shell.params.opt_Domprop
    Config.setDOMPropMode
    // use set domain with 32 size
    Shell.params.opt_MaxStrSetSize = 32
    if(Shell.params.opt_disEvent) {
      Config.setDisableEventMode
    }

    // DOM mode
    Config.setDomMode

    // Initialize AbsString cache
    kr.ac.kaist.jsaf.analysis.typing.domain.AbsString.initCache

    // Read a JavaScript file and translate to IR
    var program: Program = null

    var jshtml: JSFromHTML = null

    // DOMAPI statistics
    if(Shell.params.opt_Domstat){
      DOMStatistics.setInputFile(Shell.params.opt_Domstat_in)
      DOMStatistics.setOutputFile(Shell.params.opt_Domstat_out)

    }
    jshtml = new JSFromHTML(fileName)
    // Parse JavaScript code in the target html file
    program = jshtml.parseScripts

    // concatenate modeled ASTs
    val SEP = File.separator
    val base = ProjectProperties.BASEDIR + SEP
    val modeledFiles: List[String] =
      ((List[String](base + "bin/models/builtin/__builtin__.js")) ++
        (if(Config.domMode) List(base + "bin/models/dom/__dom__.js") else List[String]())).filter(f => {
        val file = new File(f)
        file.exists()
      })

    // input files for webapp bugdetector
    val inputFiles: List[String] =
    if(Shell.params.command == ShellParameters.CMD_WEBAPP_BUG_DETECTOR) {
      (List[String](base + "bin/inputs/__input__.js")).filter(f => {
        val file =new File(f);
        file.exists();
      })
    }
    else List()

    Config.setModeledFiles(Config.getModeledFiles ++ modeledFiles ++ inputFiles)
    val modeledASTs: Program = Parser.fileToAST(toJavaList(modeledFiles++inputFiles))
    program = (modeledASTs, program) match {
      case (SProgram(info0, STopLevel(fds0, vds0, body0)), SProgram(info1, STopLevel(fds1, vds1, body1))) =>
        SProgram(info1, STopLevel(fds0 ++ fds1, vds0 ++ vds1, body0 ++ body1))
    }

    val irErrors = Shell.ASTtoIR(fileName, program, JOption.none[String], JOption.none[kr.ac.kaist.jsaf.nodes_util.Coverage])
    val irOpt: JOption[IRRoot] = irErrors.first
    val program2: Program = irErrors.third // Disambiguated and hoisted and with written

    // Check the translation result
    val ir: IRRoot = irOpt.unwrap

    // Build CFG
    val builder = new CFGBuilder(ir)
    val cfg = builder.build

    val errors = builder.getErrors
    if (!(errors.isEmpty)) {
      Shell.reportErrors(NodeUtil.getFileName(ir), Shell.flattenErrors(errors), JOption.none[Pair[FileWriter, BufferedWriter]])
    }

    // Initialize bulit-in models
    val previousBasicBlocks: Int = cfg.getNodes.size

    val init = new InitHeap(cfg)
    init.initialize

    val presentBasicBlocks = cfg.getNodes.size

    // Set the initial state with DOM objects
    if (Config.domMode && jshtml != null) new DOMBuilder(cfg, init, jshtml.getDocument).initialize(quiet)


    // Create Typing
    var typingInterface: TypingInterface = null
    typingInterface = new Typing(cfg, quiet, locclone)

    Config.setTypingInterface(typingInterface)


    // Check global variables in initial heap against list of predefined variables.
    init.checkPredefined

    // Analyze
    if (Shell.params.command == ShellParameters.CMD_ANALYZE ||
      Shell.params.command == ShellParameters.CMD_PREANALYZE ||
      Shell.params.command == ShellParameters.CMD_HTML ||
      Shell.params.command == ShellParameters.CMD_HTML_PRE ||
      Shell.params.command == ShellParameters.CMD_BUG_DETECTOR ||
      Shell.params.command == ShellParameters.CMD_WEBAPP_BUG_DETECTOR) {
      typingInterface.analyze(init)
    }

    // Turn off '-max-loc-count' option
    Shell.params.opt_MaxLocCount = 0

    // Node relation set
    NodeRelation.set(program2, ir, cfg, quiet)

    // Execute Bug Detector
    System.out.println("\n* Bug Detector *")
    val detector = new BugDetector(program2, cfg, typingInterface, quiet, irErrors.second)
    //if(!(Shell.params.command == ShellParameters.CMD_WEBAPP_BUG_DETECTOR))
    //  StrictModeChecker.checkAdvanced(program2, cfg, detector.varManager, detector.stateManager)

    val bugStorage = detector.detectBug2
    val bugList = bugStorage.getBugList()

    //bugList.foreach( x => println(stringfy(x)) )
    println("Total #bugs: " + bugList.size)

    return bugList
  }


  private def stringfy(in: BugEntry2): String =
  {
    // this is temporary. don't use.
    val startLoc = "%d:%d".format(in._4.getLine, in._4.getOffset)
    val endLoc = "%d:%d".format(in._5.getLine, in._5.getOffset)
    val filePath = in._3

    // [
    val vector = "%d,%s,%s,%s,%d,%s".format(in._2, filePath, startLoc, endLoc, in._6, in._7)

    return vector
  }

  private def vectorize(in: BugEntry2, path: String): String =
  {
    val startLoc = "%d:%d".format(in._4.getLine, in._4.getOffset)
    val endLoc = "%d:%d".format(in._5.getLine, in._5.getOffset)
    val vector = "%s,%s,%s,%s,%s,%s".format(quote(path), quote(in._2.toString),
      quote(startLoc), quote(endLoc), quote(in._6.toString), quote(in._7) )
    //val vector = path :: in._2.toString :: startLoc :: endLoc :: in._6.toString :: in._7 :: Nil

    return vector
  }

  private def quote(in: String): String =
  {
    "\"%s\"".format(in.replaceAll("\\\"", "'").replaceAll("(\\r|\\n)+", ""))
  }

  def main(args: Array[String]): Unit =
  {
    if(args.length != 3)
    {
      Console.err.println("Invalid # of arguments.")
      Runtime.getRuntime.exit(33)
    }

    val mode = args(0)
    val path = args(1)
    val relPath = args(2)

    val targetFile = new File(path)

    if( ! targetFile.exists() || ! targetFile.isFile )
    {
      Console.err.println(path + " does not exist.")
      Runtime.getRuntime.exit(2)
    }

    try {
      val buglist = mode match {
        case "jss" => detectJSBugs(targetFile)
        case "webapp" => detectWebAppBugs(targetFile)
      }

      if( ! AnalyzeMain.isTimeout )
      {
        for( a <- buglist )
        {
          val csv = vectorize(a, relPath)
          Console.println("OUTPUT:"+csv)
        }
      }
      else {
        Console.err.println(path + ": timeout (" + timeout + ")")
        Runtime.getRuntime.exit(4) // timeout
      }

    } catch {
      case e: Throwable => { Console.println("ERROR: " + e.getMessage); e.printStackTrace(); Runtime.getRuntime.exit(3); }
    }

    Runtime.getRuntime.exit(0)
  }

  def getPID(proc: Process): Int =
  {
    val cl = proc.getClass
    val field = cl.getDeclaredField("pid")
    field.setAccessible(true)
    val pidObject = field.get(proc)
    return pidObject.asInstanceOf[Int]
  }

  def killProcess(proc: Process): Int =
  {
    val pid = getPID(proc)
    return Runtime.getRuntime.exec("kill -9 " + pid).waitFor()
  }

  def getTimeString(): String =
  {
    val now = Calendar.getInstance().getTime()
    val minuteFormat = new SimpleDateFormat("[hh:mm:ss]:")
    minuteFormat.format(now)
  }
}
