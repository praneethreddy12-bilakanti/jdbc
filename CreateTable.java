package jdbc1;
import java.sql.*;
public class CreateTable 
{
	public static void main(String[] args) 
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
			Statement stmt = con.createStatement();
		System.out.println("statement object is created");
		stmt.executeUpdate("create table employee1(eno number,ename varchar2(15),esal number(10,2),eaddr varchar2(20))");
System.out.println("table created");
stmt.close();
con.close();




		}
		catch (SQLException se)
		{
					System.out.println("database proble"+se);

		}
		catch(ClassNotFoundException cne)
		{
					System.out.println("class not found"+cne);

		System.out.println("Hello World!");
	}
}
}
