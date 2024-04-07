package com.cdac.events;

public class Student extends Person{
	//additional state
	//grad year,course,fees,marks
	private int gradYear;
	private String courseName;
	private double fees;
	private int marks;
	//how to init COMPLETE state of the student ?
	public Student(String fn,String ln,int gradYear,String name,
			double fees,int marks) {
		//invoke parametrized super class ctor
		super(fn,ln);
		System.out.println("in student ctor");
		this.gradYear=gradYear;
		this.courseName=name;
		this.fees=fees;
		this.marks=marks;		
	}
	//override toString , inherited from Person
	public String toString() {
		return "Student "+super.toString()+" graduated in "+gradYear
				+" course "+courseName+" fees "+fees+" Marks "+marks;
	}
	//add new sub class specific behavior
	public void study() {
		System.out.println(getFirstName()+" studying in course "+courseName);
	}

}
