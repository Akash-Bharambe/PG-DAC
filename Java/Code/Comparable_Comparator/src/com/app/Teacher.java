package com.app;

import java.time.LocalDate;

public class Teacher extends Person {
	private double salary;
	private int empid;
	private LocalDate hireDate;

	public Teacher(String name, int age, double salary, int empid, LocalDate hireDate) {
		super(name, age);
		this.salary = salary;
		this.empid = empid;
		this.hireDate = hireDate;
	}

	public double getSalary() {
		return salary;
	}

	public int getEmpid() {
		return empid;
	}

	public LocalDate getHireDate() {
		return hireDate;
	}

	@Override
	public String toString() {
		return "Teacher " + super.toString() + "\tempid: " + empid + "\thireDate: " + hireDate + "\tsalary: " + salary
				+ "]";
	}

}
