package kr.ac.kaist.jsaf.shell

import java.io.{BufferedWriter, File, FileWriter, IOException}

import kr.ac.kaist.jsaf.{ProjectProperties, Shell, ShellParameters}
import kr.ac.kaist.jsaf.analysis.typing.{AddressManager, Config, InitHeap, Typing, TypingInterface}
import kr.ac.kaist.jsaf.compiler.Predefined
import kr.ac.kaist.jsaf.nodes.{IRRoot, Program}
import kr.ac.kaist.jsaf.compiler.Parser
import kr.ac.kaist.jsaf.scala_src.nodes.{SProgram, STopLevel}
import kr.ac.kaist.jsaf.exceptions.UserError
import kr.ac.kaist.jsaf.scala_src.useful.Lists._
import edu.rice.cs.plt.tuple.{Option => JOption}
import kr.ac.kaist.jsaf.useful.{MemoryMeasurer, Pair, Useful}
import kr.ac.kaist.jsaf.analysis.cfg.CFGBuilder
import kr.ac.kaist.jsaf.nodes_util.{DOMStatistics, JSFromHTML, NodeRelation, NodeUtil}
import kr.ac.kaist.jsaf.analysis.typing.models.DOMBuilder
import kr.ac.kaist.jsaf.bug_detector.{BugDetector, BugEntry2, StrictModeChecker}

import scala.collection.JavaConversions

/**
  * Created by darkrsw on 2016/October/22.
  */
object BugDetectorProxy
{
  def detectJSBugs(inFile: File): Unit = {
    val quiet = true
    val tokens = Array[String]("bug-detector", "-dev", inFile.getCanonicalPath)
    Shell.params = new ShellParameters()
    val errorMessage = Shell.params.Set(tokens)
    val pred = new Predefined(Shell.params)

    Config.setQuietMode

    var locclone = Shell.params.opt_LocClone

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

    bugList.foreach( x => println(stringfy(x)) )
  }

  def detectWebAppBugs(inFile: File): Unit = {
    val quiet = true
    val tokens = Array[String]("webapp-bug-detector", "-dev", inFile.getCanonicalPath)
    Shell.params = new ShellParameters()
    val errorMessage = Shell.params.Set(tokens)
    val pred = new Predefined(Shell.params)

    Config.setQuietMode
    var locclone = Shell.params.opt_LocClone

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

    if (Shell.params.FileNames.length > 1) throw new UserError("Only one HTML file supported at a time.")
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

    // Node relation set
    NodeRelation.set(program2, ir, cfg, quiet)

    // Execute Bug Detector
    System.out.println("\n* Bug Detector *")
    val detector = new BugDetector(program2, cfg, typingInterface, quiet, irErrors.second)
    if(!(Shell.params.command == ShellParameters.CMD_WEBAPP_BUG_DETECTOR))
      StrictModeChecker.checkAdvanced(program2, cfg, detector.varManager, detector.stateManager)

    val bugStorage = detector.detectBug2
    val bugList = bugStorage.getBugList()

    bugList.foreach( x => println(stringfy(x)) )
  }

  def main(args: Array[String]): Unit =
  {
    // TODO: this is just for test
    //detectJSBugs(new File("benchmarks/kraken_v1.1/stanford-crypto-aes.js"))
    detectWebAppBugs(new File("tmp/webapp/public/index.html"))
  }

  def stringfy(in: BugEntry2): String =
  {
    val startLoc = "%d:%d".format(in._4.getLine, in._4.getOffset)
    val endLoc = "%d:%d".format(in._5.getLine, in._5.getOffset)
    val filePath = in._3

    val vector = "%d,%s,%s,%s,%d,%s".format(in._2, filePath, startLoc, endLoc, in._6, in._7)

    return vector
  }
}
