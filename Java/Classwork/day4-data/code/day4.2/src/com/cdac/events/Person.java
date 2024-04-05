package com.cdac.events;

public class Person /* extends Object */{
	private String firstName;
	private String lastName;

	public Person(String firstName, String lastName) {
		super();//invoking Object class's def ctor
		System.out.println("in person ctor");
		this.firstName = firstName;
		this.lastName = lastName;
	}

//	public Person() {
//		// TODO Auto-generated constructor stub
//	}
	// override toString method to get person's details
	public String toString() {
		return firstName + " " + lastName;
	}

	
	
}
