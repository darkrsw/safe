package edu.lu.uni.serval.js.exp.safe

import java.io.File

import kr.ac.kaist.jsaf.shell.BugDetectorProxy
import kr.ac.kaist.jsaf.utils.file.FileScanner
import org.apache.commons.io.FileUtils

import kr.ac.kaist.jsaf.shell.BugDetectorProxy._

/**
  * Created by darkrsw on 2016/October/24.
  */
object AlarmCollectorByProject
{
  def collect(pname: String, repoDir: File, outFile: File, logFile: File) =
  {
    // collecting all js files.
    val jss = FileScanner.collectJSFiles(repoDir.getCanonicalPath)
    val htmls = FileScanner.collectHTMLFiles(repoDir.getCanonicalPath)

    /*val htmls = if(webappList != None)
    {
      val lines = Source.fromFile(webappList.get).getLines().toList
      lines.map( x => { new File(repoDir, x) } )
    } else { List[File]() }*/

    def inLoop(x: File, mode: (String, String) => (Int, String) ) =
    {
      val filepath = x.getCanonicalPath.replace(repoDir.getCanonicalPath, "")
      println("\n\n" + getTimeString() + "processing: " + filepath)

      val startTime = System.currentTimeMillis()

      val (success, msg) =
        try {
          val (code, list) = mode(x.getCanonicalPath, filepath)

          //if( ! isTimeout ) {
          if( code == 0) {
            //val vectors = alarms.map(x => vectorize(x, filepath))


            FileUtils.write(outFile, list, "UTF-8", true)
            (true, "success")
          } else {
            (false, errmsg(code))
          }

        } catch {
          case e: Throwable => { e.printStackTrace(); (false, e.getMessage) }
        }

      val duration = System.currentTimeMillis() - startTime

      println(getTimeString() + filepath + " --- time taken: " + duration)

      if(!success)
        FileUtils.write(logFile, filepath + ":FAILED=>" + msg + "\n", "UTF-8", true)
      else
        FileUtils.write(logFile, filepath + ":SUCCESS=>" + duration + "\n", "UTF-8", true)
    }

    jss.foreach( x => inLoop(x, BugDetectorProxy.detectJSBugsOnJVM) )
    htmls.foreach( x => inLoop(x, BugDetectorProxy.detectWebAppBugsOnJVM) )
  }

  def errmsg(code: Int): String =
  {
    code match {
      case 33 => "Invalid # of arguments."
      case 2 => "File not found."
      case 3 => "Runtime exception."
      case 4 => "Execution timeout."
      case _ => "Unknown error: " + code
    }
  }

  def main(args: Array[String]): Unit =
  {
    // TODO this is only for testing.
    /*val repoDir = new File("tmp/repo-pack-13/steedos$steedos-sites")
    val webappList = Some(new File("tmp/classification/repo-pack-13/steedos$steedos-sites.list"))
    val outFile = new File("tmp/samples.alarms")
    val logFile = new File("tmp/samples.log")

    collect("steedos$steedos-sites", repoDir, outFile, logFile)

    println("finished: " + "steedos$steedos-sites")
    Runtime.getRuntime.exit(0)*/
    BugDetectorProxy.classPathString = "./target/scala-2.9.2/classes:./target/pack/lib/*"

    {
      val (code, list) = BugDetectorProxy.detectJSBugsOnJVM(
        "/Users/darkrsw/git/safe/tmp/repo-pack-13/steedos$steedos-sites/static/libs/semantic.js", "static/libs/semantic.js")
      println(code)
      println(list)
    }

    {
      val (code, list) = BugDetectorProxy.detectWebAppBugsOnJVM(
        "/Users/darkrsw/git/safe/tmp/repo-pack-13/steedos$steedos-sites/content/us/search.html", "./content/us/search.html")
      println(code)
      println(list)
    }
  }
}
