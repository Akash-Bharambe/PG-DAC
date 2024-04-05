package com.cdac.events;

public class Faculty extends Person {
	private int expInYears;
	private String sme;

	public Faculty(String firstName, String lastName, int expInYears, String sme) {
		super(firstName, lastName);
		System.out.println("in faculty ctor");
		this.expInYears = expInYears;
		this.sme = sme;
	}
	//override getDetails , inherited from Person
	public String getDetails() {
		return "Faculty " + super.getDetails() + " exp " + expInYears + " expert in" + sme;
	}

}
