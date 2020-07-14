package jdbc1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class InsertingValues
{
public static void main(String args[])
{
try
{
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
Statement stmt = con.createStatement();
stmt.executeUpdate("insert into employee1 values(101,'ram',9899.56,'dsnr')");
stmt.executeUpdate("insert into employee1 values(102,'raj',9999.99,'hyderabad')");
stmt.executeUpdate("insert into employee1 values(103,'sam',7777.77,'chennai')");
System.out.println("Records inserted");
stmt.close();
con.close();
}
catch(SQLException se)
{
System.out.println(se);
}
catch(ClassNotFoundException e)
{
System.out.println(e);
}
catch(Exception e)
{
System.out.println(e);
}
}//main
}//class
