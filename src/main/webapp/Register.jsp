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
out.println("<h2>"+data+"</h2>");
%>
</center>
<jsp.include page="index.html"/>
</body>
</html>