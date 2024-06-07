<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@page import="com.app.pojos.User"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%!Map<String, User> users = new HashMap<>();

	public void jspInit() {
		users.put("akash", new User(1, "Akash", "akash", "asd"));
		users.put("chinmay", new User(2, "Chinmay", "chinmay", "asd"));
		users.put("vinayak", new User(3, "Vinayak", "vinayak", "asd"));
	}%>
<body>
	<%
	String email = request.getParameter("username");
	String pass = request.getParameter("password");

	User user = users.get(email);
	session.setAttribute("email", email);
	session.setAttribute("pass", pass);
	session.setAttribute("isValid", (user != null && user.getPass().equals(pass)));
	%>
	<jsp:forward page="details.jsp" />
</body>
</html>