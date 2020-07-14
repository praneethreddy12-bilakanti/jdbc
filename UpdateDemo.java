package jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateDemo {
	
		public static void main(String[] args)
		{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
			Statement stmt = con.createStatement();
		System.out.println("statement is created");
		Scanner snr= new Scanner(System.in);
		System.out.println("enter employee number:");
		int empno=snr.nextInt();
		int updateCount = stmt.executeUpdate("update employee1 set esal =esal+5000 where eno=" + empno);
		System.out.println("records updated"+updateCount);
		stmt.close();
		con.close();
		snr.close();

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
