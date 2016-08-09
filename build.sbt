import de.johoop.ant4sbt.Ant4Sbt._

organization := "kr.ac.kaist.jsaf"
name := "JSAF"
version := "1.0"

scalaVersion := "2.9.2"

publishTo := Some(Resolver.mavenLocal)
//publishTo := Some(Resolver.file("file",  new File(Path.userHome.absolutePath+"/.m2/repository")))

libraryDependencies += "junit" % "junit" % "4.11" % "test"

parallelExecution in Test := false

antSettings
