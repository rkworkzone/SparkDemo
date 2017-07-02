name := "xyz"

version := "1.0"

scalaVersion := "2.11.0"

libraryDependencies += "org.apache.spark" % "spark-core_2.11" % "1.6.0"  % "provided"

mainClass in assembly := Some("practice.init.Run")