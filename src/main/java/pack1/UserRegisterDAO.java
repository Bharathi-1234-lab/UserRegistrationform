package pack1;
import java.sql.Connection;
import java.sql.PreparedStatement;
public class UserRegisterDAO
{
public int insertUserData(UserBean bean) 
{
	int rowCount=0;
	try 
	{
		Connection con=DBConnect.getCon();
		PreparedStatement pstmt=con.prepareStatement("insert into registration values(?,?,?,?,?,?,)");
		
		pstmt.setString(1, bean.getuName());
		pstmt.setString(2, bean.getuPassword());
		pstmt.setString(3, bean.getuFirstName());
		pstmt.setString(4, bean.getuLastName());
		pstmt.setString(5, bean.getuMailId());
		pstmt.setString(6, bean.getuPhone());
		rowCount=pstmt.executeUpdate();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	
}
	return rowCount;
}
}
