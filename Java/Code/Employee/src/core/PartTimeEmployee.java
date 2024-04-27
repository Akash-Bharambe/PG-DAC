package core;

public class PartTimeEmployee extends Employee {

	private double fees;

	public PartTimeEmployee(String name, String dateOfJoining, String phoneNumber, String aadhaarNumber, double fees) {
		super(name, dateOfJoining, phoneNumber, aadhaarNumber);
		this.fees = fees;
	}

	public PartTimeEmployee(Employee other, double fees) {
		super(other);
		this.fees = fees;
	}

	@Override
	public String toString() {
		return "PartTimeEmployee " + super.toString() + " wage=" + fees + "]";
	}

	@Override
	public boolean equals(Object obj) {
		PartTimeEmployee emp = null;
		if (obj instanceof PartTimeEmployee) {
			emp = (PartTimeEmployee) obj;
		}
		return this.getAadhaarNumber().equals(emp.getAadhaarNumber());
	}
}
