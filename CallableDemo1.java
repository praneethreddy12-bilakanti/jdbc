package jdbc1;

import java.sql.*;
public class CallableDemo1
{
public static void main(String args[])throws Exception
{
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
CallableStatement cst=con.prepareCall("{?=call myfunction(?)}");
// set input parameters
cst.setInt(2,5);
//2 represents 2nd question mark
//register output types
cst.registerOutParameter(1,Types.INTEGER);
cst.execute();
System.out.println("Value returned by function =" + cst.getInt(1));
}}
