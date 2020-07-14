package jdbc;

import java.sql.*;
public class DeleteRecord
{
public static void main(String[] args)throws Exception
{
	try
{
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
	Statement stmt = con.createStatement();
	int updateCount = stmt.executeUpdate("delete from employee2 where eno=101");
	System.out.println("records deleted—–"+updateCount);
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
/*
for deleting all the records
st.executeUpdate(“delete from employee”);
*/
