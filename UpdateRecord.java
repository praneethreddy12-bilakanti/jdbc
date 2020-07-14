package jdbc;

import java.util.*;
import java.sql.*;
public class UpdateRecord
{
public static void main(String[] args)throws Exception
{
try
{
	
Class.forName("oracle.jdbc.driver.OrcleDriver");
Connection con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
Statement stmt = con.createStatement();
Scanner snr= new Scanner(System.in);
System.out.println("enter employee number");
int empno=snr.nextInt();
int updateCount = stmt.executeUpdate("update employee2 set esal =esal+5000 where eno=101" + empno);
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
catch(Exception e)
{
System.out.println(e);
}
}
}
