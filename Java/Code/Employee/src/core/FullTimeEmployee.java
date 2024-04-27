package core;

public class FullTimeEmployee extends Employee {

	private double salary;

	public FullTimeEmployee(String name, String dateOfJoining, String phoneNumber, String aadhaarNumber,
			double salary) {
		super(name, dateOfJoining, phoneNumber, aadhaarNumber);
		this.salary = salary;
	}

	public FullTimeEmployee(Employee other, double salary) {
		super(other);
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "FullTimeEmployee " + super.toString() + " salary=" + salary + "]";
	}

	@Override
	public boolean equals(Object obj) {
		FullTimeEmployee emp = null;
		if (obj instanceof FullTimeEmployee) {
			emp = (FullTimeEmployee) obj;
		}
		return this.getAadhaarNumber().equals(emp.getAadhaarNumber());
	}
	
}
