package com.hp.scala.util
import java.net.URI
import java.io.{BufferedReader, Reader, InputStreamReader, FileReader}
import org.apache.hadoop.fs.{Path, FileSystem}
import org.apache.hadoop.conf.Configuration
/**
 * Created by chzhenzh on 9/19/2016.
 */
object HDFS {
  def readFile(str:String):Reader = {
    val fs = FileSystem.get(new URI("hdfs://c4t15593.itcs.hp.com:8020"), new Configuration())
    //val fs = FileSystem.get(new URI("hdfs://192.168.181.200:9000"), new Configuration())
    val path = new Path(str)
    new BufferedReader(new InputStreamReader(fs.open(path)))
  }

}
