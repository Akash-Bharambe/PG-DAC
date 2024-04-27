package core;

import java.time.LocalDate;
import java.util.Random;

public class Employee {
	private int empID;
	private String name;
	private LocalDate dateOfJoining;
	private String phoneNumber;
	private String aadhaarNumber;
	private static Random random;

	static {
		random = new Random();
	}

	public Employee(String name, String dateOfJoining, String phoneNumber, String aadhaarNumber) {
		this.empID = random.nextInt(9000) + 1000;
		this.name = name;
		this.dateOfJoining = LocalDate.parse(dateOfJoining);
		this.phoneNumber = phoneNumber;
		this.aadhaarNumber = aadhaarNumber;
	}
	
	

	public int getEmpID() {
		return empID;
	}


	@Override
	public boolean equals(Object obj) {
		Employee emp = null;
		if (obj instanceof Employee) {
			emp = (Employee) obj;
		}
		return this.aadhaarNumber.equals(emp.aadhaarNumber);
	}



	public LocalDate getDateOfJoining() {
		return dateOfJoining;
	}



	public Employee(Employee other) {
		this.empID = other.empID;
		this.name = other.name;
		this.dateOfJoining = other.dateOfJoining;
		this.phoneNumber = other.phoneNumber;
		this.aadhaarNumber = other.aadhaarNumber;
	}



	@Override
	public String toString() {
		return "[empID=" + empID + ", name=" + name + ", dateOfJoining=" + dateOfJoining + ", phoneNumber="
				+ phoneNumber + ", aadhaarNumber=" + aadhaarNumber;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public String getAadhaarNumber() {
		return aadhaarNumber;
	}

	

}
