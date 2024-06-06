package com.app.core;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class Doctor {
	private static int idCnt;
	private int id;
	private String name;
	private Map<LocalDateTime, Patient> appointments;

	static {
		idCnt = 0;
	}
	
	public Doctor(String name) {
		idCnt++;
		this.id = idCnt;
		this.name = name;
		this.appointments = new HashMap<LocalDateTime, Patient>();
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

	public Map<LocalDateTime, Patient> getAppointments() {
		return appointments;
	}

	public void setAppointments(Map<LocalDateTime, Patient> appointments) {
		this.appointments = appointments;
	}

	@Override
	public String toString() {
		return "Doctor [id=" + id + ", name=" + name + ", appointments=" + appointments + "]";
	}

}
