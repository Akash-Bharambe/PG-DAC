<%@page import="org.apache.tomcat.util.net.ApplicationBufferHandler"%>
<%@page import="com.mysql.cj.Session"%>
<%@page import="java.time.LocalTime"%>
<%@page import="java.time.LocalDateTime"%>
<%@page import="java.util.Map"%>
<%@page import="com.app.core.Doctor"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Appointment Form</title>
<style>
body {
	font-family: Arial, sans-serif;
	background-color: #f4f4f4;
	margin: 0;
	padding: 0;
	display: flex;
	justify-content: center;
	align-items: center;
	height: 100vh;
}

.appointment-form {
	background-color: #fff;
	padding: 20px;
	border-radius: 8px;
	box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
	width: 300px;
}

.appointment-form h2 {
	margin-top: 0;
	color: #333;
}

.form-group {
	margin-bottom: 15px;
}

.form-group label {
	display: block;
	margin-bottom: 5px;
	color: #555;
}

.form-group input, .form-group select {
	width: 100%;
	padding: 8px;
	box-sizing: border-box;
	border: 1px solid #ccc;
	border-radius: 4px;
}

.form-group input[type="date"] {
	padding: 6px;
}

.submit-button {
	background-color: #28a745;
	color: #fff;
	border: none;
	padding: 10px;
	border-radius: 4px;
	cursor: pointer;
	width: 100%;
}

.submit-button:hover {
	background-color: #218838;
}
a:active{
color: white;
}
a:focus{
color:white;
}
a:visited{
color:white;
}
</style>

<%!List<Doctor> doctors = new ArrayList<>();

	public void jspInit() {
		doctors.add(new Doctor("Dr. Nilesh Mahajan"));
		doctors.add(new Doctor("Dr. Jayant Dhande"));
		doctors.add(new Doctor("Dr. Tushar Gajare"));
	
	}%>

</head>
<body>
	<div class="appointment-form">
		<h2>Book an Appointment</h2>
		<form action="add_appointment.jsp" method="post">
			<div class="form-group">
				<label for="patient-name">Patient Name</label> <input type="text"
					id="patient-name" name="patient_name" required>
			</div>
			<div class="form-group">
				<label for="appointment-date-time">Appointment Date</label> <input
					type="date" id="appointment-date" name="appointment_date"
					required>
			</div>
			<div class="form-group">
				<label for="time">Select Time Slot</label><select id="time"
					name="time-slot" required>
					<option value="">Select Time Slot</option>
					<%
					LocalTime start = LocalTime.of(9, 30);
					while (start.getHour() != (13)) {
					%>
					<option value="<%=start%>"><%=start%></option>
					<%
					start = start.plusMinutes(30);
					}
					%>
					<%
					LocalTime start1 = LocalTime.of(18, 0);
					while (start1.getHour() != (21)) {
					%>
					<option value="<%=start1%>"><%=start1%></option>
					<%
					start1 = start1.plusMinutes(30);
					}
					%>
				</select>
			</div>
			<div class="form-group">
				<label for="doctor">Doctor</label> <select id="doctor" name="doctor"
					required>
					<option value="">Select Doctor</option>
					<%
					for (Doctor d : doctors) {
					%>
					<option value="<%=d.getId()%>"><%=d.getName()%></option>
					<%
					}
					application.setAttribute("doctors", doctors);
					application.setAttribute("patients", new ArrayList<>());
					%>
				</select>
			</div>
			<button type="submit" class="submit-button">Submit</button>
		</form>
	</div>
</body>
</html>
