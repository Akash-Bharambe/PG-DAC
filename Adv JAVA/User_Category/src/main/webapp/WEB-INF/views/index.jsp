<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%-- import JSTL core tag lib --%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Index</title>
</head>
<body>
	<h1>Hello World</h1>
	<h1>Hello World</h1>
	<h1>
		<c:url var="abc" value="/categories/list" />
		<a href="${abc}">List all Categories</a>
	</h1>
	<h1>
		<c:url var="xyz" value="/user/login" />
		<a href="${xyz}">User Login</a>
	</h1>

</body>
</html>