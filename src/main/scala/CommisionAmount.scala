import java.sql.DriverManager
import com.typesafe.config._

case class Employees_cmmsn(FN:String,LN:String,salary:Float,commission:Float){

  override def toString():String ={
   "first_name: " + FN +";"+ LN + ";"+ "Salary" + ";" + "commission :" + getCommissionAmt()
}
  def getCommissionAmt() :Any ={
    if(commission== null )
    { "Not Eligible"
    } else
      salary*commission
  }
}

object CommisionAmount {

  def main(args: Array[String]): Unit = {
    val props=ConfigFactory.load()
    val host = props.getConfig(args(0)).getString("host")
    val port = props.getConfig(args(0)).getString("port")
    val db = props.getConfig(args(0)).getString("db")
    val driver = "com.mysql.jdbc.Driver"
    val url = "jdbc:mysql://" + host + ":" + port + "/" + db
    val username = props.getConfig(args(0)).getString("user")
    val password = props.getConfig(args(0)).getString("pw")

    Class.forName(driver)
    val connection = DriverManager.getConnection(url, username, password)
    val statement = connection.createStatement()
    val resultSet = statement.executeQuery("SELECT first_name,last_name,salary,commission_pct FROM employees")
    while (resultSet.next()) {
      val e=Employees_cmmsn(
               resultSet.getString("first_name"),
               resultSet.getString("last_name"),
               resultSet.getFloat("salary"),
               resultSet.getFloat("commission_pct"))
      println(e)

    }
  }
}
