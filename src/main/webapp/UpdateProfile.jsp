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
String data=(String)request.getAttribute("msg");
String fname=(String)request.getAttribute("fname");

out.println("<h1>This session belongs to"+fname+"<br><br>");
out.println("</h1><br><br>");
%>
<a href="view">View Profile</a><br><br>
<a href="logout">Logout</a><br><br>
</center>
</body>
</html>