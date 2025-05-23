package pack1;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/update")
public class UpdateProfileServlet extends HttpServlet
{
protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
{
	Cookie arr[]=req.getCookies();
	String fname=null;
	if(arr.length==0) 
	{
		req.setAttribute("msg","Session expierd <br>");
		req.getRequestDispatcher("Register.jsp").forward(req,res);
	}
	else 
	{
	ServletContext context=req.getServletContext();
	UserBean bean=(UserBean)context.getAttribute("username");
	bean.setuFirstName(req.getParameter("u_fname"));
	bean.setuLastName(req.getParameter("u_lname"));
	bean.setuMailId(req.getParameter("u_mail"));
	bean.setuPhone(req.getParameter("u_pnumber"));
	
	int rowCount=new UpdateProfileDAO().UpdateData(bean);
	if(rowCount==0)
	{
		req.setAttribute("msg","Data is not ypdated");
		req.getRequestDispatcher("Register.jsp").forward(req,res);
	}
	
	else 
	{
		req.setAttribute("msg", "profile upated");
		for(Cookie c:arr)
			if("c5".equals(c.getName()))
				fname=c.getValue();
		req.setAttribute("fname",fname);
		req.getRequestDispatcher("UpdateProfile.jsp").forward(req,res);
	}
	}
			}
}
