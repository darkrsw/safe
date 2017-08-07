import de.johoop.ant4sbt.Ant4Sbt._

organization := "kr.ac.kaist.jsaf"
name := "JSAF"
version := "1.0"

scalaVersion := "2.9.3"

resolvers += Resolver.mavenLocal
publishTo := Some(Resolver.mavenLocal)
//publishTo := Some(Resolver.file("file",  new File(Path.userHome.absolutePath+"/.m2/repository")))

libraryDependencies += "junit" % "junit" % "4.11" % "test"
libraryDependencies += "commons-io" % "commons-io" % "2.5"
libraryDependencies += "com.google.guava" % "guava" % "19.0"
libraryDependencies += "org.eclipse.jgit" % "org.eclipse.jgit" % "4.5.0.201609210915-r"
libraryDependencies += "com.rabbitmq" % "amqp-client" % "4.0.0"
libraryDependencies += "com.google.code.gson" % "gson" % "2.8.0"
libraryDependencies += "redis.clients" % "jedis" % "2.9.0"
libraryDependencies += "edu.lu.ul.serval" % "messaging-and-idempotency" % "1.0"

packAutoSettings

parallelExecution in Test := false

antSettings
