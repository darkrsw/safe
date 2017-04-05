package edu.lu.uni.serval.js.exp.safe

import java.io.{File, FileReader}
import java.util.Properties

import edu.lu.uni.serval.idempotent.comm.{IdempotentRedisOps, ResultSender}
import edu.lu.uni.serval.scm.git.{GitCommands, GitProxy}
import kr.ac.kaist.jsaf.shell.BugDetectorProxy


/**
  * Created by darkrsw on 2016/November/02.
  */
object AlarmCollectorByPack
{
  var CONF_PATH = ""

  def main(args: Array[String]): Unit =
  {
    if(args.size != 3)
    {
      println("Incorrect # of arguments.")
      Runtime.getRuntime.exit(1)
    }

    process(args)

    ResultSender.close()
  }

  def init(path: String): Boolean =
  {
    try {
      val prop = new Properties()
      prop.load(new FileReader(new File(path)))

      CONF_PATH = path

      val redisHost = prop.getProperty("redis.host")
      //val redisUser = prop.getProperty("redis.user")
      val redisPasswd = prop.getProperty("redis.passwd")

      if(redisHost == null || redisPasswd == null) {
        Console.println("Wrong redis conf.")
        return false
      }


      IdempotentRedisOps.init(redisHost, redisPasswd)

      ResultSender.host = prop.getProperty("rabbitmq.host")

      ResultSender.ALARM_QUEUE_NAME = prop.getProperty("alarm.queue")
      ResultSender.LOG_QUEUE_NAME = prop.getProperty("log.queue")
      ResultSender.PLOG_QUEUE_NAME = prop.getProperty("project.log.queue")
      ResultSender.CLOG_QUEUE_NAME = prop.getProperty("commit.log.queue")

      ResultSender.TASK_QUEUE_NAME = prop.getProperty("js.task.queue")

      ResultSender.RABBITMQ_USER = prop.getProperty("rabbitmq.user")
      ResultSender.RABBITMQ_PASSWD = prop.getProperty("rabbitmq.passwd")


      if( ResultSender.host == null || ResultSender.ALARM_QUEUE_NAME == null ||
        ResultSender.LOG_QUEUE_NAME == null || ResultSender.PLOG_QUEUE_NAME == null ||
        ResultSender.CLOG_QUEUE_NAME == null || ResultSender.TASK_QUEUE_NAME == null ||
        ResultSender.RABBITMQ_USER == null || ResultSender.RABBITMQ_PASSWD == null )
      {
        Console.println("Wrong rabbitmq conf.")
        return false
      }


      ResultSender.init()



      return true

    } catch {
      case e: Throwable => {e.printStackTrace(); return false}
    }
  }

  def process(args: Array[String]): Unit =
  {
    val packRoot = new File(args(0))
    //val outRoot = new File(args(1) + "/alarms")
    //val logRoot = new File(args(1) + "/logs")

    if( ! init(args(1)) )
      return

    BugDetectorProxy.classPathString = args(2)

    if( ! packRoot.isDirectory) { println("pack directory does not exist: " + packRoot.getCanonicalPath); return;}
    //if( ! outRoot.isDirectory) return
    //if( ! logRoot.isDirectory) return

    //val packlogFile = new File(logRoot, "pack.log")

    val repos = packRoot.listFiles().filter(_.isDirectory)

    repos.foreach( x =>
      {
        val projectName = x.getName

        // ### Check if this project is already processed.
        if( ! IdempotentRedisOps.checkAlreadyProcessed("%s".format(projectName)) )
        {
          // not processed yet
          Console.println("# Processing " + projectName)
          try {

            val proxy = new GitProxy()
            proxy.setURI(x.getCanonicalPath + "/.git")
            if (!proxy.connect())
              throw new Exception("git repo connection failed.")

            val commits = proxy.getLogAll()

            for (c <- commits) {
              // ### Check if this <project, commit> is already processed.
              if (!IdempotentRedisOps.checkAlreadyProcessed("%s:%s".format(projectName, c.getName))) {

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
                  IdempotentRedisOps.setAlreadyProcessed("%s:%s".format(projectName, c.getName))
                }
              } else {

                // skip
                println("\n\nskip " + c.getName + " in " + projectName)
              }

            }

            //FileUtils.write(packlogFile, projectName + ":SUCCESS\n", "UTF-8", true)
            ResultSender.sendProjectLog(projectName, "SUCCESS", "")

          } catch {
            case e: Throwable => //FileUtils.write(packlogFile, projectName + ":FAILED=>" + e.getMessage + "\n", "UTF-8", true)
            {
              e.printStackTrace()
              ResultSender.sendProjectLog(projectName, "FAILED", e.getMessage)
            }
          } finally {

            // ### Set this project already processed.
            IdempotentRedisOps.setAlreadyProcessed("%s".format(projectName))
          }
        } else {
          // already processed; skip
          Console.println("# skip " + projectName)
        }

      }
    )
  }

}
