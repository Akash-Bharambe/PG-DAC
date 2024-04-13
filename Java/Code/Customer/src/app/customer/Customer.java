package app.customer;

import java.time.LocalDate;

public class Customer {
	private static int idCount;
	private int cutomerID;
	private String fName;
	private String lName;
	private String email; 
	private double registrationAmmount;
	private LocalDate dob;
	private PlanType plan;
	
	
	static {
		idCount = 1;
	}


	public Customer(String fName, String lName, String email, double registrationAmmount, LocalDate dob,
			PlanType plan) {
		super();
		this.cutomerID = idCount;
		this.fName = fName;
		this.lName = lName;
		this.email = email;
		this.registrationAmmount = registrationAmmount;
		this.dob = dob;
		this.plan = plan;
		idCount++;
	}


	public Customer(int cutomerID) {
		super();
		this.cutomerID = cutomerID;
	}
	
	
	
	
}
