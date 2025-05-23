package pack1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/view")
public class ViewProfileServlet extends HttpServlet
{
	@Override
protected void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
{
	Cookie arr[]=req.getCookies();
	String fname=null;
	if(arr.length==0) 
	{
		req.setAttribute("msg","Sesstion Expired");
		req.getRequestDispatcher("Register.jsp").forward(req, res);
	}
	else 
	{
		for(Cookie c :arr)
			if("c5".equals(c.getName()))
				fname=c.getValue();
		req.setAttribute("fname", fname);
		req.getRequestDispatcher("ViewProfile.jsp").forward(req,res);
	}
}
}
