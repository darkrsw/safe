package edu.lu.uni.serval.js.exp.safe

import java.io.File

import kr.ac.kaist.jsaf.bug_detector._
import kr.ac.kaist.jsaf.shell.{AnalyzeMain, BugDetectorProxy}
import kr.ac.kaist.jsaf.utils.file.FileScanner

import scala.collection.JavaConverters._
import org.apache.commons.io.FileUtils

import scala.io.Source

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

    def inLoop(x: File, mode: File => BugList2) =
    {
      val filepath = x.getCanonicalPath.replace(repoDir.getCanonicalPath, "")
      println("\n\nprocessing: " + filepath)

      val startTime = System.currentTimeMillis()

      val (success, msg) =
        try {

          val alarms = mode(x)

          if( ! AnalyzeMain.isTimeout ) {
            val vectors = alarms.map(x => vectorize(x, filepath))

            FileUtils.writeLines(outFile, "UTF-8", vectors.asJavaCollection, true)
            (true, "success")
          } else {
            (false, "timeout")
          }

        } catch {
          case e: Throwable => { e.printStackTrace(); (false, e.getMessage) }
        }

      val duration = System.currentTimeMillis() - startTime

      BugDetectorProxy.init()

      if(!success)
        FileUtils.write(logFile, filepath + ":FAILED=>" + msg + "\n", "UTF-8", true)
      else
        FileUtils.write(logFile, filepath + ":SUCCESS=>" + duration + "\n", "UTF-8", true)
    }

    jss.foreach( x => inLoop(x, BugDetectorProxy.detectJSBugs) )
    htmls.foreach( x => inLoop(x, BugDetectorProxy.detectWebAppBugs) )
  }

  def vectorize(in: BugEntry2, path: String): String =
  {
    val startLoc = "%d:%d".format(in._4.getLine, in._4.getOffset)
    val endLoc = "%d:%d".format(in._5.getLine, in._5.getOffset)
    val vector = "%s,%s,%s,%s,%s,%s".format(quote(path), quote(in._2.toString),
      quote(startLoc), quote(endLoc), quote(in._6.toString), quote(in._7) )
    //val vector = path :: in._2.toString :: startLoc :: endLoc :: in._6.toString :: in._7 :: Nil

    return vector
  }

  def quote(in: String): String =
  {
    "\"%s\"".format(in.replaceAll("\\\"", "'").replaceAll("(\\r|\\n)+", ""))
  }

  def main(args: Array[String]): Unit =
  {
    // TODO this is only for testing.
    val repoDir = new File("tmp/repo-pack-13/steedos$steedos-sites")
    val webappList = Some(new File("tmp/classification/repo-pack-13/steedos$steedos-sites.list"))
    val outFile = new File("tmp/samples.alarms")
    val logFile = new File("tmp/samples.log")

    collect("steedos$steedos-sites", repoDir, outFile, logFile)

    println("finished: " + "steedos$steedos-sites")
    Runtime.getRuntime.exit(0)
  }
}
