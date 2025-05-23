package pack1;
import java.sql.Connection;
import java.sql.PreparedStatement;
public class UpdateProfileDAO
{
public int UpdateData(UserBean bean)

{
	int rowCount=0;
	try 
	{
		Connection con=DBConnect.getCon();
		PreparedStatement pstmt=con.prepareStatement("update registration set FIRSTNAME=?,LASTNAME=?,MAILID=?,PHONE=?,where USERNAME=?");
		
		pstmt.setString(1,bean.getuFirstName());
		pstmt.setString(2,bean.getuLastName());
		pstmt.setString(3,bean.getuMailId());
		pstmt.setString(4,bean.getuPhone());
		pstmt.setString(5, bean.getuName());
		
		rowCount=pstmt.executeUpdate();
	}
	catch(Exception e) 
	{
		e.printStackTrace();
	}
	return rowCount;
	}
}
