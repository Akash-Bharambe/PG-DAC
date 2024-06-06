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
	String patientName = request.getParameter("patient_name");
	LocalDate appointmentDate = LocalDate.parse(request.getParameter("appointment_date"));
	LocalTime timeSlot = LocalTime.parse(request.getParameter("time-slot"));
	int doctorID = Integer.parseInt(request.getParameter("doctor"));

	List<Doctor> doctors = (List<Doctor>) application.getAttribute("doctors");
	Doctor doctor = ((Doctor) doctors.stream().filter(d -> d.getId() == doctorID).findFirst().orElseThrow());

	List<Patient> patients = (List<Patient>) application.getAttribute("patients");
	Patient patient = new Patient(patientName, LocalDateTime.of(appointmentDate, timeSlot), doctorID);
	patients.add(patient);

	(doctor.getAppointments()).put(LocalDateTime.of(appointmentDate, timeSlot), patient);

	response.sendRedirect("logout.jsp");
	%>
</body>
</html>