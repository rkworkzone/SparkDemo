name := "xyz"

version := "1.0"

scalaVersion := "2.11.0"

libraryDependencies += "org.apache.spark" % "spark-core_2.11" % "1.6.0" 
libraryDependencies += "mysql" % "mysql-connector-java" % "5.1.27"
// https://mvnrepository.com/artifact/org.apache.spark/spark-sql_2.11
libraryDependencies += "org.apache.spark" % "spark-sql_2.11" % "1.6.0"


mainClass in assembly := Some("practice.init.Run")
// % "provided"