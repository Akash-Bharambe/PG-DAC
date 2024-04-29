package com.core;

import java.time.LocalDate;
import java.util.Objects;

public class Contact {
	private String phoneNumber;
	private String name;
	private LocalDate dateOfBirth;
	private String email;

	public Contact(String phoneNumber, String name, LocalDate dateOfBirth, String email) {
		super();
		this.phoneNumber = phoneNumber;
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.email = email;
	}

	public Contact(String phoneNumber, String name, LocalDate dateOfBirth) {
		this.phoneNumber = phoneNumber;
		this.name = name;
		this.dateOfBirth = dateOfBirth;
	}

	public Contact(String name, LocalDate dateOfBirth) {
		this.name = name;
		this.dateOfBirth = dateOfBirth;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Contact [phoneNumber=" + phoneNumber + ", name=" + name + ", dateOfBirth=" + dateOfBirth + ", email="
				+ email + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Contact) {
			Contact other = (Contact) obj;
			return other.name.equals(this.name);
		}
		return false;
	}
}
