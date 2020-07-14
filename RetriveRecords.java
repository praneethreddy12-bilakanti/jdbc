package jdbc1;


import java.sql.*;
public class RetriveRecords
{
public static void main(String args[]) throws Exception
{
	try
	{
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
	Statement stmt = con.createStatement();
	System.out.println("statement object is created");
ResultSet res = stmt.executeQuery("select * from employee1");
while(res.next())
{
System.out.println(res.getInt(1)+"\t" + res.getString(2) + "\t" + res.getDouble(3)+"\t"+res.getString(4));
}
res.close();
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
/* different ways
System.out.println(res.getInt(“eno”)+”\t” + res.getString(“ename”) + “\t” + res.getDouble(“esal”)+”\t”+res.getString(“eaddr”));
System.out.println(res.getString(“eno”)+”\t” + res.getString(“ename”) + “\t” + res.getString(“esal”)+”\t”+res.getString(“eaddr”));
System.out.println(res.getString(1)+”\t” + res.getString(2) + “\t” + res.getString(3)+”\t”+res.getString(4));
*/