package com.app;

import java.time.LocalDate;

public class Student extends Person {
	int rollno;
	LocalDate birthDate;

	public Student(String name, int age, int rollno, LocalDate birthDate) {
		super(name, age);
		this.rollno = rollno;
		this.birthDate = birthDate;
	}

	public int getRollno() {
		return rollno;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	@Override
	public String toString() {
		return "Student " + super.toString() + "\trolln: " + rollno + "\tbirthDate: " + birthDate + "]";
	}

}
