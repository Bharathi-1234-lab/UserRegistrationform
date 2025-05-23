package pack1;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
@WebListener
public class ContextListeners implements ServletContextListener,ServletContextAttributeListener
{
	@Override
public void contextInitialized(ServletContextEvent sce ) 
{
	System.out.println("ServletContext object intialized");
	ServletContext context=sce.getServletContext();
	String ServletName=context.getServerInfo();
	System.out.println("our application is deployed in to"+ServletName);
}
@Override
public void contextDestroyed(ServletContextEvent sce) 
{
	System.out.println("ServletContext object destroyed");
}
@Override
public void attributeAdded(ServletContextAttributeEvent scae) 
{
	System.out.println("Attribute added to the ServletContext object");
	String aname=scae.getName();
	System.out.println("Attribute Name :"+aname);
}
@Override
public void attributeRemoved(ServletContextAttributeEvent sce) 
{
	System.out.println("Attribute removed from ServletContext object");
}
}
