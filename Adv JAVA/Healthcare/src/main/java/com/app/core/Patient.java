package com.app.core;

import java.time.LocalDateTime;

public class Patient {
	private static int idCnt;
	private int id;
	private String name;
	private LocalDateTime appointment;
	private int doctorID;

	static {
		idCnt = 0;
	}

	public Patient(String name, LocalDateTime appointment, int doctorID) {
		idCnt++;
		this.id = idCnt;
		this.name = name;
		this.appointment = appointment;
		this.doctorID = doctorID;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDateTime getAppointment() {
		return appointment;
	}

	public void setAppointment(LocalDateTime appointment) {
		this.appointment = appointment;
	}

	public int getDoctorID() {
		return doctorID;
	}

	public void setDoctorID(int doctorID) {
		this.doctorID = doctorID;
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + ", name=" + name + ", appointment=" + appointment + ", doctorID=" + doctorID + "]";
	}

}
