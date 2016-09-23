package com.hp.scala
import com.hp.scala.util.SparkObject
import org.apache.spark
import org.apache.spark.sql.SQLContext
import org.apache.spark.{SparkConf, SparkContext}

/**
 * Created by chzhenzh on 9/20/2016.
 */
object Asso {
  def main(args : Array[String]) {
    println("BEGIN")
    //val sc=SparkObject.getSparkContext
    //val sqlC=SparkObject.getSqlContext
    val conf = new SparkConf().setAppName("Simple Application")
    val sc = new SparkContext(conf)
    val sqlcontext=new SQLContext(sc)
    //import spark.implicits._
    val path="hdfs://16.250.53.231:9000//DROID/SO_prod.txt/*"
    val assoDF=sqlcontext.load("com.databricks.spark.csv", Map("path" -> path,"header"->"false"))
    assoDF.printSchema()
    println("END")
  }

}
