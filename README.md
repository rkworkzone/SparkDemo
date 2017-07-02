# SparkDemo

Setup Sbt for Eclipse:

required softwares(latest): 

Please uninstall all the following softwares before you start.
1) java version "1.8.0_131"  (64 bit)-- http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html
2) scala 2.12.2  --- http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html
3) sbt 0.13.15  ---  http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html
4) Eclipse 4.6.1  --- http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html

Please install the above order. 

SETUP A SBT PROJECT. 
Create a workspace for your project(ABC):

create floder structure as below.
NOTE: <> specifies directory.

<ADC> 
      <project>
		plugins.sbt
      <src>
	    <main>
	           <java>
                   <scala>
                   <resource>
            <test>
	           <java>
                   <scala>
                   <resource>
      <target>
      build.sbt

========================================================  Copy the below content into build.sbt file.  ===============================

name := "xyz"

version := "1.0"

scalaVersion := "2.11.0"

libraryDependencies += "org.apache.spark" % "spark-core_2.11" % "1.6.0" 
libraryDependencies += "mysql" % "mysql-connector-java" % "5.1.27"
// https://mvnrepository.com/artifact/org.apache.spark/spark-sql_2.11
libraryDependencies += "org.apache.spark" % "spark-sql_2.11" % "1.6.0"


mainClass in assembly := Some("practice.init.Run")
// % "provided"


========================================================  Copy the below content into plugins.sbt file.  ===============================    

addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "5.1.0")

addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.14.5")

========================================================  sbt compile, run, package  =============================== 
open cmd and navigate to project(ABC) direcory.
To make the directory as a eclipse project.

cmd> sbt

> eclipse
> reload
> compile
> run
> package
> assembly         NOTE: (FAT JAR. )

=========================================  git link ==============================================================

https://github.com/rkworkzone/SparkDemo





  
