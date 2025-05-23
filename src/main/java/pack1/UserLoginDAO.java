package pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserLoginDAO 
{
UserBean bean=null;
public UserBean checkLogin(String UserName,String Password) 
{
	try 
	{
		Connection con=DBConnect.getCon();
		PreparedStatement pstmt=con.prepareStatement("select*from registration where USERNAME=? and PASSWORD=?");
		pstmt.setString(1, UserName);
		pstmt.setString(2, Password);
		
		ResultSet rs=pstmt.executeQuery();
		if(rs.next()) 
		{
			bean=new UserBean();
			bean.setuName(rs.getString(1));
			bean.setuPassword(rs.getString(2));
			bean.setuFirstName(rs.getString(3));
			bean.setuLastName(rs.getString(4));
			bean.setuMailId(rs.getString(5));
			bean.setuPhone(rs.getString(6));
		}
		else 
		{
			throw new SQLException("problem at UserLoginDAO class");
		}
	}
	catch(Exception e) 
	{
		e.printStackTrace();
		
	}
	return bean;
}
}
