ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.12.17"

lazy val root = (project in file("."))
  .settings(
    name := "dd_spark_330",
    idePackagePrefix := Some("com.dd"),
    organization := "dd.learning.spark",
    autoScalaLibrary := false
  )

val sparkVersion = "3.3.0"
val sparkTestVersion = "3.2.10"

val sparkDependencies = Seq(
  "org.apache.spark" %% "spark-core" % sparkVersion,
  "org.apache.spark" %% "spark-sql" % sparkVersion,
  "com.databricks" %% "dbutils-api" % "0.0.5"
)

val testDependencies = Seq(
  "org.scalatest" %% "scalatest" % sparkTestVersion % Test
)

libraryDependencies ++= sparkDependencies ++ testDependencies

//libraryDependencies ++= Seq(
//  "org.apache.spark" %% "spark-core" % sparkVersion,
//  "org.apache.spark" %% "spark-sql" % sparkVersion,
//  "com.databricks" %% "dbutils-api" % "0.0.5"
//)