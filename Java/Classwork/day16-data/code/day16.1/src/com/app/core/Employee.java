package com.app.core;

public class Employee {
	private int id;
	private String name;
	private String designation;
	private String company;
	private double salary;
	public Employee(int id, String name, String designation, String company, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.company = company;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getDesignation() {
		return designation;
	}
	public String getCompany() {
		return company;
	}
	public double getSalary() {
		return salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", designation=" + designation + ", company=" + company
				+ ", salary=" + salary + "]";
	}
	

}
