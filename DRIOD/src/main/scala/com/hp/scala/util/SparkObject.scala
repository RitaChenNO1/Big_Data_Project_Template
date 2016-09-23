package com.hp.scala.util

import org.apache.spark.sql.{DataFrame, SQLContext}
import org.apache.spark.{SparkConf, SparkContext}

/**
 * Created by chzhenzh on 9/19/2016.
 */
object SparkObject {

  def getSparkContext = {
    val conf = new SparkConf()
    new SparkContext(conf)
  }
//org.apache.spark.sql.
  def getSqlContext={
    new SQLContext(getSparkContext)
  }
//"hdfs://aa01:9000/gm/stg_sas_gry_mkt_all.txt"
  //'|'
  def dataframe(path:String ):DataFrame={
    getSqlContext.load("com.databricks.spark.csv", Map("path" -> path,"header"->"false"))
  //sqlContext.csvFile(filePath=file, delimiter=delimiter)
  }

}
