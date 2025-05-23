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
UserBean bean=(UserBean)application.getAttribute("userbean");
String fname=(String)request.getAttribute("fname");
out.println("<h1> This ssession belongs to"+fname+"</h1><br><br>");
%>
<form action="update" method="post">
FirstName <input type="text" name=u_fname value="<%= bean.getuFirstName() %>"/><br><br>
LastName <input type="text" name=u_lname value="<%=  bean.getuLastName() %>"/><br><br>
MailId <input type="text" name=u_mailId value="<%=bean.getuMailId() %>"/><br><br>
Phone Number <input type="text" name=u_pnumber value="<%=bean.getuPhone() %>"/><br><br>
<input type="submit" value="Update Data"/>
</form>
</center>
</body>
</html>