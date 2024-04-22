package app.customer;

import java.io.Serializable;
import java.time.LocalDate;

public class Customer implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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

	public String getEmail() {
		return email;
	}

	public LocalDate getDob() {
		return dob;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public PlanType getPlan() {
		return plan;
	}

	public double getRegistrationAmmount() {
		return registrationAmmount;
	}

	public void setRegistrationAmmount(double registrationAmmount) {
		this.registrationAmmount = registrationAmmount;
	}

	@Override
	public String toString() {
		String nameString = fName + " " + lName;
		return String.format("Cutomer ID=%-3s Name=%-15s email=%-21s Ammount= %-10.2f dob= %-10s plan= %-8s", cutomerID,
				nameString, email, registrationAmmount, dob, plan);
	}

}
