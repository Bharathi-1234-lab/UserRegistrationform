package pack1;
import java.sql.Connection;
import java.sql.DriverManager;
public class DBConnect 
{
private static Connection con=null;

static 
{
	try 
	{
	Class.forName(DBInfo.driver);
	con=DriverManager.getConnection(DBInfo.DBurl,DBInfo.DBuname,DBInfo.DBupwd);
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
public static Connection getCon()
{
	return con;
}
}
