package edu.lu.uni.serval.js.exp.safe

import java.io.File
import java.util.concurrent.{ConcurrentLinkedQueue, Future}

import edu.lu.uni.serval.exp.store.AeroSpikeBroker
import edu.lu.uni.serval.idempotent.comm.ResultSender
import kr.ac.kaist.jsaf.shell.BugDetectorProxy
import kr.ac.kaist.jsaf.utils.file.FileScanner
import kr.ac.kaist.jsaf.shell.BugDetectorProxy._

import scala.collection.mutable
import scala.collection.mutable.ListBuffer

/**
  * Created by darkrsw on 2016/October/24.
  */
object AlarmCollectorByProject
{
  val nCores = Runtime.getRuntime.availableProcessors()
  Console.println("# Cores: " + nCores)

  val pool = java.util.concurrent.Executors.newFixedThreadPool(nCores-1)

  def collect(pname: String, repoDir: File, commitHash: String /*, outFile: File, logFile: File*/) =
  {

    // collecting all js files.
    val jss = FileScanner.collectJSFiles(repoDir.getCanonicalPath)
    val htmls = FileScanner.collectHTMLFiles(repoDir.getCanonicalPath)

    // Queueing file paths.
    //val workQueue = new ConcurrentLinkedQueue[String]()

    //jss.foreach(workQueue.add(_))
    //htmls.foreach(workQueue.add(_))

    def inLoop(x: File, mode: (String, String, String, String) => (Int, String) ) =
    {
      val filepath = x.getCanonicalPath.replace(repoDir.getCanonicalPath, "")
      if( ! AeroSpikeBroker.checkAlreadyProcessed("%s:%s:%s".format(pname, commitHash, filepath)) )
      {
        // not yet processed
        println("\n\n" + getTimeString() + "processing: " + filepath)

        val startTime = System.currentTimeMillis()

        val (success, msg) =
          try {

            // TODO: This should be parallelized.
            val (code, err) = mode(pname, commitHash, x.getCanonicalPath, filepath)

            if (code == 0) {

              (true, "success")
            } else {
              (false, errmsg(code))
            }

          } catch {
            case e: Throwable => {
              e.printStackTrace(); (false, e.getMessage)
            }
          }

        val duration = System.currentTimeMillis() - startTime

        println(getTimeString() + filepath + " --- time taken: " + duration)


        if (!success)
        // FileUtils.write(logFile, filepath + ":FAILED=>" + msg + "\n", "UTF-8", true)
        //(project: String, filepath: String, commit: String, result: String, errmsg: String)
          ResultSender.sendLog(pname, filepath, commitHash, "FAILED", msg)
        else
        //FileUtils.write(logFile, filepath + ":SUCCESS=>" + duration + "\n", "UTF-8", true)
          ResultSender.sendLog(pname, filepath, commitHash, "SUCCESS", duration.toString)

        AeroSpikeBroker.setAlreadyProcessed("%s:%s:%s".format(pname, commitHash, filepath))

      } else {
        // already processed; skip
        Console.println("\n\n" + getTimeString() + "skip " + filepath)
      }

    }

    val futures = ListBuffer[Future[_]]()

    jss.foreach( x => futures += (pool.submit(
          new Runnable {
            def run: Unit ={
              inLoop(x, BugDetectorProxy.detectJSBugsOnJVM)
            }
          }
        )
      )
    )

    htmls.foreach( x => futures +=  (pool.submit(
          new Runnable {
            def run: Unit = {
              inLoop(x, BugDetectorProxy.detectWebAppBugsOnJVM)
            }
          }
        )
      )
    )

    futures.foreach(_.get())
    Console.println("Commit[%s]...all collected.".format(commitHash))
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
//
//    {
//      val (code, list) = BugDetectorProxy.detectJSBugsOnJVM(
//        "/Users/darkrsw/git/safe/tmp/repo-pack-13/steedos$steedos-sites/static/libs/semantic.js", "static/libs/semantic.js")
//      println(code)
//      println(list)
//    }
//
//    {
//      val (code, list) = BugDetectorProxy.detectWebAppBugsOnJVM(
//        "/Users/darkrsw/git/safe/tmp/repo-pack-13/steedos$steedos-sites/content/us/search.html", "./content/us/search.html")
//      println(code)
//      println(list)
//    }
  }
}
