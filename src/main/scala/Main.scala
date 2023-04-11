package com.dd

import org.apache.spark.sql._
import org.apache.spark.sql.functions._

object Main {
  def main(args: Array[String]) {
    //println("Welcome To Spark world!")
    val spark = SparkSession.builder.master("local[*, 4]").appName("test").getOrCreate()
    //val ssc = new StreamingContext(spark.sparkContext, Seconds(10))
    val sc = spark.sparkContext
    sc.setLogLevel("ERROR")
    import spark.implicits._
    import spark.sql

    val df = spark.read.format("CSV").option("header", "true").load("./data/employees.csv") //Users/dd.sharma/dev/dd_saprk_330/data
    df.show()

    spark.stop()
  }
}