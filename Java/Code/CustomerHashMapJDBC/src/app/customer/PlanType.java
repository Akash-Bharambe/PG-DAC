package app.customer;

public enum PlanType {
	SILVER(1000),
	GOLD(2000),
	DIAMOND(5000),
	PLATINUM(10000);

	private double charges;
	
	private PlanType(double charges) {
		this.charges = charges;
	}
	
	@Override
	public String toString() {
		return name() + " "+ charges;
	}

	public double getCharges() {
		return charges;
	}
	
}
