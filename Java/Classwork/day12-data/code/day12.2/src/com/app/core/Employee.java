package com.app.core;

public class Employee {
	private String id;
	private String name;
	private double salary;
	public Employee(String id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	@Override
	public boolean equals(Object o)
	{
		System.out.println("in emp's equals");
		if(o instanceof Employee)
		{
			Employee e=(Employee) o;
			return this.id.equals(e.id);
		}
		return false;
	}
	@Override
	public int hashCode() {
		System.out.println("in emp's hashCode");
	return id.hashCode();
//		return 10;
	}

}
