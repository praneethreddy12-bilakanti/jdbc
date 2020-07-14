package jdc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Test {


public static void main(String[] args)

{
try
{
	Class.forName("oracle.jdbc.driver.OracleDriver");
	System.out.println("driver loaded");
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","praneeth","praneeth");
	System.out.println("connection is created");
	Statement stmt=con.createStatement();
	System.out.println("statement is created");
	stmt.executeUpdate("create table employee3(eno number,ename varchar2(15),esal number(10,2),eaddr varchar2(20))");
	System.out.println("table created");
	
	stmt.executeUpdate("insert into employee3 values(101,'ram',9899.56,'dsnr')");
	stmt.executeUpdate("insert into employee3 values(102,'raj',9999.99,'hyderabad')");
	stmt.executeUpdate("insert into employee3 values(103,'sam',7777.77,'chennai')");
	System.out.println("Records inserted");
	/*Scanner sn=new Scanner(System.in);
	System.out.println("enter employee number:");
	int empno=sn.nextInt();
	int updateempno=stmt.executeUpdate("update table employee3 set esal=esal+1000 where eno="+empno);
	System.out.println("results are updated"+updateempno);
	*/
	//System.out.println("statement object is created");
ResultSet res = stmt.executeQuery("select * from employee3");
while(res.next())
{
System.out.println(res.getInt(1)+"\t" + res.getString(2) + "\t" + res.getDouble(3)+"\t"+res.getString(4));
}
  
res.close();
	stmt.close();
	con.close();
	
}
catch(SQLException e)
{
	System.out.println(e);
}

catch(ClassNotFoundException ce)

{
	System.out.println(ce);
}

}
}
