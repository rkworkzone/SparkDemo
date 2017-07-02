
package practice.init

import org.apache.spark.{ SparkConf, SparkContext }
object Run {
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setAppName("Nmae").setMaster("local")
    val sc = new SparkContext(conf)
    println("========================")
    println(sc.master) 
    println("========================")
    sc.stop()
  }
}