<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	if((Boolean)session.getAttribute("isValid")) {%>
		<h2>Email: ${sessionScope.email} </h2><br/>
		<h2>Password: ${sessionScope.pass}</h2><br/>
		<h2><a href="logout.jsp">Logout</a></h2>
	<%}else { %>
		<h2>Invalid Credentials <a href="login.jsp"> retry</a></h2>
	<%}%>
</body>
</html>