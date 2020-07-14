package jdbc1;
import java.sql.*;
public class BatchUpdatesDemo
{
public static void main(String args[]) throws Exception
{
Connection con=null;
Statement st=null;
ResultSet rs=null;
try
{
Class.forName("oracle.jdbc.driver.OracleDriver");
con = DriverManager.getConnection( "jdbc:oracle:thin:@localhost:1521:xe","system","system");
con.setAutoCommit(false);
st=con.createStatement();
st.addBatch("insert into employee1 values(111,'ram',5550.89,'hyderabad')");
st.addBatch("insert into employee1 values(112,'sam',666.89,'secbad')");
st.addBatch("delete from employee1 where eno=102");
System.out.println("completed");
st.executeBatch();
con.commit();
}
catch(Exception e)
{
con.rollback();
}}}
