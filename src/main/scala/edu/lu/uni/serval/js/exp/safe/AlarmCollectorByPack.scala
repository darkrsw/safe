package edu.lu.uni.serval.js.exp.safe

import java.io.File
import java.net.URLClassLoader

import edu.lu.uni.serval.scm.git.{GitCommands, GitProxy}
import kr.ac.kaist.jsaf.shell.BugDetectorProxy
import org.apache.commons.io.FileUtils

/**
  * Created by darkrsw on 2016/November/02.
  */
object AlarmCollectorByPack
{
  def main(args: Array[String]): Unit =
  {
    if(args.size != 3)
    {
      println("Incorrect # of arguments.")
      Runtime.getRuntime.exit(1)
    }

    process(args)
  }

  def process(args: Array[String]): Unit =
  {
    val packRoot = new File(args(0))
    val outRoot = new File(args(1) + "/alarms")
    val logRoot = new File(args(1) + "/logs")

    BugDetectorProxy.classPathString = args(2)

    if( ! packRoot.isDirectory) { println("pack directory does not exist: " + packRoot.getCanonicalPath); return;}
    //if( ! outRoot.isDirectory) return
    //if( ! logRoot.isDirectory) return

    val packlogFile = new File(outRoot, "pack.log")

    val repos = packRoot.listFiles().filter(_.isDirectory)

    repos.foreach( x =>
      {
        val projectName = x.getName

        try {

          val alarmDir = new File(outRoot, projectName)
          alarmDir.mkdirs()

          val logDir = new File(logRoot, projectName)
          logDir.mkdirs()

          val commitlog = new File(logDir, "commit-wise.log")

          val proxy = new GitProxy()
          proxy.setURI(x.getCanonicalPath+"/.git")
          if(!proxy.connect())
            throw new Exception("git repo connection failed.")

          val commits = proxy.getLogAll()

          for( c <- commits )
          {
            println("\n\nprocessing " + c.getName + " in " + projectName)
            try {
              val retCode = GitCommands.reset(x.getCanonicalPath, c.getName, true)
              if(retCode == 0)
              {
                val outFile = new File(alarmDir, c.getName + ".list")
                val logFile = new File(logDir, c.getName + ".log")

                AlarmCollectorByProject.collect(projectName, x, outFile, logFile)
              }

              FileUtils.write(commitlog, c.getName + ":SUCCESS=>\n", "UTF-8", true)
            } catch {
              case e: Throwable => FileUtils.write(commitlog, c.getName + ":FAILED=>" + e.getMessage + "\n", "UTF-8", true)
            }
          }

          FileUtils.write(packlogFile, projectName + ":SUCCESS\n", "UTF-8", true)
        } catch {
          case e: Throwable => FileUtils.write(packlogFile, projectName + ":FAILED=>" + e.getMessage + "\n", "UTF-8", true)
        }
      }
    )
  }

}
