package com.app.core;

import java.time.LocalDate;

public class Voter {
	private String first_name;
	private String last_name;
	private String email;
	private String password;
	private LocalDate dob;
	private boolean status;
	private String role;
	
	public Voter(String first_name, String last_name, String email, String password, LocalDate dob,
			boolean status, String role) {
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.password = password;
		this.dob = dob;
		this.status = status;
		this.role = role;
	}

	public boolean isStatus() {
		return status;
	}

	public String getFirst_name() {
		return first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public LocalDate getDob() {
		return dob;
	}

	public String getRole() {
		return role;
	}
	
	
	
	
	
}
