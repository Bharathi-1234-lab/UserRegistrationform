<%@page import="pack1.UserBean" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<%
String fname=(String)request.getAttribute("fname");
UserBean bean=(UserBean)application.getAttribute("Userbean");
out.println("<h1> welcome to thid session belongs to"+fname+"<br><br>");
out.println("<u>profile Details</u><br><br>");
String Pwd=bean.getuPassword();
String s=Pwd.substring(0,1)+"****"+Pwd.substring(Pwd.length()-1);

out.println(bean.getuName()+" "+bean.getuPassword()+" "+bean.getuFirstName()+" "+bean.getuLastName()+" "+bean.getuMailId()+" "+bean.getuPhone()+"<br><br>");
%>
<a href="edit">Edit Profile</a><br><br>
<a href="Logout">Logout</a><br><br>
</center>
</body>
</html>