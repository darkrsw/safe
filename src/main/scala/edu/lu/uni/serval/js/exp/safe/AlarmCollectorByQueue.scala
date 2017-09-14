package edu.lu.uni.serval.js.exp.safe


import java.io.File

import com.google.gson.{Gson, JsonParser}
import edu.lu.uni.serval.exp.store.RedisBroker._
import edu.lu.uni.serval.idempotent.comm.ResultSender
import edu.lu.uni.serval.scm.git.{GitCommands, GitProxy}
import kr.ac.kaist.jsaf.shell.BugDetectorProxy

import scala.sys.process.Process

/**
  * Created by darkrsw on 2016/December/12.
  */
object AlarmCollectorByQueue
{
  var CONF_PATH = ""
  var WORK_DIR = ""
  val gson = new Gson()
  val parser = new JsonParser()

  def main(args: Array[String]): Unit =
  {
    if(args.size != 3)
    {
      println("Incorrect # of arguments.")
      Runtime.getRuntime.exit(1)
    }

    BugDetectorProxy.classPathString = args(0)

    WORK_DIR = args(2)
    new File(WORK_DIR).mkdirs()

    if( ! AlarmCollectorByPack.init(args(1)) )
      return


    var continue = true

    while(continue)
    {
      val msg = ResultSender.getOneTask()
      if( msg != null )
      {
        if (!decode(msg)) {
          continue = false
          println("Poison pill received...Shutting down...")
        }
      } else // if the queue is empty
      {
        // wait for seconds
        println("Queue empty. Enqueue poison pills to kill.")
        Thread.sleep(2000)
      }
    }

    ResultSender.close()
  }

  def decode(json: String): Boolean =
  {
    try {
      val el = parser.parse(json)
      val root = el.getAsJsonObject()
      val msgType = root.get("type").getAsString

      if( msgType == "poison" )
      {
        println("Poison pill.")
        return false

      } else if( msgType == "task" ) {
        val packName = root.get("pack.name").getAsString
        val repoName = root.get("repo.name").getAsString
        val zipUrl = root.get("zip.url").getAsString

        process(packName, repoName, zipUrl)

      } else {
        println("Unknown type message..." + msgType)
        return false
      }

    } catch {
      case e: Throwable => { Console.err.println("Error in alarm recoding", e); return false }
    }
  }

  def process(packName: String, projectName: String, zipUrl: String): Boolean =
  {
    //val projectName = x.getName

    val workDir = new File(WORK_DIR)

    // ### Check if this project is already processed.
    if( ! checkAlreadyProcessed("jsstudy:project:%s".format(projectName)) )
    {
      // not processed yet
      Console.println("# Processing " + projectName)
      try {

        // download 7z file.
        val copyCmd = "aws s3 cp %s .".format(zipUrl)
        //val copyCmd = "cp ../tmp/repo-pack-13/%s.7z .".format(projectName) // TODO only for test
        val copyExitCode = Process(copyCmd, workDir).!

        if( copyExitCode != 0 )
          throw new Exception("aws cp command failed.")

        // unzip 7z file
        val unzipCmd = "7za x %s -o.".format(projectName+".7z")
        val zipExitCode = Process(unzipCmd, workDir).!

        if( zipExitCode != 0 )
          throw new Exception("unzip failed.")

        val repoDir = new File(workDir, projectName)

        val proxy = new GitProxy()
        val x = repoDir
        proxy.setURI(repoDir.getCanonicalPath + "/.git")
        if (!proxy.connect())
          throw new Exception("git repo connection failed.")

        val commits = proxy.getLogAll()


        for (c <- commits) {
          // ### Check if this <project, commit> is already processed.
          if (! checkAlreadyProcessed("jsstudy:commit:%s:%s".format(projectName, c.getName))) {

            // not processed yet
            println("\n\nprocessing " + c.getName + " in " + projectName)
            try {
              val retCode = GitCommands.reset(x.getCanonicalPath, c.getName, true)
              if (retCode == 0) {

                // Put a task for <prj, commit>
                AlarmCollectorByProject.collect(projectName, x, c.getName /*, outFile, logFile */)
              }
              //FileUtils.write(commitlog, c.getName + ":SUCCESS=>\n", "UTF-8", true)
              ResultSender.sendCommitLog(projectName, c.getName, "SUCCESS", "")

            } catch {
              case e: Throwable =>
                //FileUtils.write(commitlog, c.getName + ":FAILED=>" + e.getMessage + "\n", "UTF-8", true)
              {
                e.printStackTrace()
                ResultSender.sendCommitLog(projectName, c.getName, "FAILED", e.getMessage)
              }
            } finally {

              // ### Set this <project, commit> already processed.
              setAlreadyProcessed("jsstudy:commit:%s:%s".format(projectName, c.getName))
            }
          } else {

            // skip
            println("\n\nskip " + c.getName + " in " + projectName)
          }

        }


        ResultSender.sendProjectLog(projectName, "SUCCESS", "")

      } catch {
        case e: Throwable =>
        {
          e.printStackTrace()
          ResultSender.sendProjectLog(projectName, "FAILED", e.getMessage)
        }
      } finally {

        // clean work dir
        val rmCmd1 = "rm -rf %s".format(projectName)
        val rmCmd2 = "rm -rf %s.7z".format(projectName)
        println("Clean up: %s %s".format(rmCmd1, rmCmd2))
        Process(rmCmd1, workDir).!
        Process(rmCmd2, workDir).!

        // ### Set this project already processed.
        setAlreadyProcessed("jsstudy:project:%s".format(projectName))
      }
    } else {
      // already processed; skip
      Console.println("# skip " + projectName)
    }

    return true
  }
}
