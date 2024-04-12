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
		idCount = 0;
	}
	
	
	
}
