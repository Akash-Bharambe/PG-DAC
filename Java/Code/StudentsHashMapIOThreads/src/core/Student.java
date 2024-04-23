package core;

import java.io.Serializable;
import java.time.LocalDate;

//Student class
public class Student implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -732809215596970107L;
	
	private int rollNo;
	private String name;
	private Subject subject;
	private LocalDate dateOfBirth;

	// Constructor
	public Student(int rollNo, String name, Subject subject, LocalDate dateOfBirth) {
		this.rollNo = rollNo;
		this.name = name;
		this.subject = subject;
		this.dateOfBirth = dateOfBirth;
	}

	// Getters and setters
	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	// toString method to print student details
	@Override
	public String toString() {
		return "Student{" + "rollNo=" + rollNo + ", name='" + name + '\'' + ", subject=" + subject + ", dateOfBirth="
				+ dateOfBirth + '}';
	}

}
