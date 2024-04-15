package app.customer;

import java.time.LocalDate;

public class Customer {
	private static int idCount;
	private int cutomerID;
	private String fName;
	private String lName;
	private String email;
	private String pass;
	private double registrationAmmount;
	private LocalDate dob;
	private PlanType plan;

	static {
		idCount = 1;
	}

	public Customer(String fName, String lName, String email, String pass, double registrationAmmount, LocalDate dob,
			PlanType plan) {
		super();
		this.cutomerID = idCount;
		this.fName = fName;
		this.lName = lName;
		this.email = email;
		this.pass = pass;
		this.registrationAmmount = registrationAmmount;
		this.dob = dob;
		this.plan = plan;
		idCount++;
	}

	public Customer(String email) {
		super();
		this.email = email;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	@Override
	public String toString() {
		String nameString = fName + " " + lName;
		return String.format("Cutomer ID=%-3s Name=%-15s email=%-21s Ammount= %-10.2f dob= %-10s plan= %-8s", cutomerID,
				nameString, email, registrationAmmount, dob, plan);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Customer) {
			Customer other = (Customer) obj;
			return this.email.equals(other.email);
		}
		return false;
	}

}
