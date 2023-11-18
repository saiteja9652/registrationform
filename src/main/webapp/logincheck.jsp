<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>login</title>
			<link rel="stylesheet" href="Regproces.css">	

</head>
<body>
<h1>Login Status</h1>
<c:if test="${status==true }">
  <h2>Login Successfull <%=request.getParameter("username") %></h2> <br><br>
  <button onclick="window.location.href='login.html'">Login</button><br><br>
    <button onclick="window.location.href='Regproces.html'">Register</button>
  
  
</c:if>
<c:if test="${status==false }">
 <h2> Login Failed <%=request.getParameter("username") %></h2><br><br>
  <jsp:include page="login.html"/>
</c:if>

</body>
</html>