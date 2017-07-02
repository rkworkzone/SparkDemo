package practice.init
import java.sql.Connection
import java.sql.DriverManager
import org.apache.spark._
import java.util.Properties
import org.apache.spark.SparkContext
import org.apache.spark.sql._
object MySql {
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setAppName("Nmae").setMaster("local")
    val sc = new SparkContext(conf)
    val sqlContext = new SQLContext(sc)
    
    
    val jdbcUsername = "root"
    val jdbcPassword = "hadoop@123"
    
    
    val jdbcHostname = "192.168.13.11"
    val jdbcPort = 3306
    
    val jdbcDatabase = "retail_db"
    
    val connectionProperties = new Properties()
    connectionProperties.put("user", "root")
    connectionProperties.put("password", "hadoop@123")
    println("=======================================")
    println(jdbcHostname)
    println("=======================================")
    Class.forName("com.mysql.jdbc.Driver")
    //val jdbcUrl = s"jdbc:mysql://${jdbcHostname}:${jdbcPort}/${jdbcDatabase}?user=${jdbcUsername}&password=${jdbcPassword}"

    val jdbc_url = s"jdbc:mysql://192.168.13.11:${jdbcPort}/${jdbcDatabase}"
    println("=======================================")
    println(jdbc_url)
    println("=======================================")
    val categories_table = sqlContext.read.jdbc(jdbc_url, "categories", connectionProperties)
    
    categories_table.show()
    /*  val dataframe_mysql = sqlContext.read.format("jdbc").option("url", "jdbc:mysql://192.168.13.11/retail_db").option("driver", "com.mysql.jdbc.Driver").option("dbtable", "categories").option("user", "root").option("password", "hadoop@123").load()
    dataframe_mysql.show()*/
  }
}