package jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteDemo
{
public static void main(String[] args)throws Exception
{
	try
	{
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
	Statement stmt = con.createStatement();
	System.out.println("statement is created");
	
	int updateCount = stmt.executeUpdate("delete from employee1 where esal <=1500000 ");
	System.out.println("records deleted"+updateCount);
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

	}
	
}
