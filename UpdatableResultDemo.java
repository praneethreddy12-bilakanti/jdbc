package jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
public class UpdatableResultDemo
{
public static void main(String[] args)
{
	try
	{
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
ResultSet rs = st.executeQuery("select * from employee1");
rs.moveToInsertRow();
while(true)
{
System.out.println("enter employee number");
Scanner scanner = new Scanner(System.in);
int eno = scanner.nextInt();
System.out.println("enter employee name");
scanner.nextLine();
String ename = scanner.nextLine();
System.out.println("enter employee salary");
float esal = scanner.nextFloat();
System.out.println("enter employee address");
scanner.nextLine();
String eaddr = scanner.nextLine();
rs.updateInt(1,eno);
rs.updateString(2,ename);
rs.updateFloat(3,esal);
rs.updateString(4,eaddr);
rs.insertRow();
System.out.println("record successfully inserted");
System.out.println("one more record[y/n]");
String option = scanner.next();
if(option.equals("n"))
break;

}
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

	}}
