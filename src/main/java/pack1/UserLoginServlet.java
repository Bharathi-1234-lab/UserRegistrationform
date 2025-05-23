package pack1;

import java.io.IOException;
import javax.naming.Context;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/login")
public class UserLoginServlet  extends HttpServlet
{
@Override	
protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
{
	UserLoginDAO uLoginDAO_obj=new UserLoginDAO();
	UserBean bean=uLoginDAO_obj.checkLogin(req.getParameter("uname"),req.getParameter("upwd"));
	if(bean==null) 
	{
	req.setAttribute("msg","Invalid credintials");	
	req.getRequestDispatcher("Register.jsp").forward(req, res);
	}
	else 
	{
		ServletContext context=req.getServletContext();
		context.setAttribute("UserBean",bean);
		Cookie ck=new Cookie("cS",bean.getuFirstName());
		res.addCookie(ck);
		req.getRequestDispatcher("Home.jsp").forward(req,res);
	}
}
}
