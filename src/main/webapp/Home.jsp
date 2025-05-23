<%@page import="pack1.UserBean" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body><center>
<% 
                UserBean bean=(UserBean)application.getAttribute("U serBean");
                out.println("<h1>welcome ms."+bean.getuFirstName()+"<br><br>");
%>
                <a href="View">View Profile</a><br><br>
                <a href="Logout">Logout</a><br><br>
</center>
</body>
</html>  