<%@page import="java.time.LocalDateTime"%>
<%@page import="com.app.core.Patient"%>
<%@page import="java.time.LocalTime"%>
<%@page import="java.time.LocalDate"%>
<%@page import="com.app.core.Doctor"%>
<%@page import="java.util.List"%>
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
List<Doctor> doctors = (List<Doctor>) application.getAttribute("doctors");
List<Patient> patients = (List<Patient>)application.getAttribute("patients");
%> <table>
<thead>
<tr>
<th>Patient Name</th>
<th>Doctor Name</th>
<th>Appointment Date</th>
<th>Appointment Time</th>
</tr>
</thead>
<tbody>
 <%
doctors.forEach(d->{
	d.getAppointments().forEach()
	%> <tr><td><% %></td></tr>
<% });
%>
</tbody>
</table>
</body>
</html>