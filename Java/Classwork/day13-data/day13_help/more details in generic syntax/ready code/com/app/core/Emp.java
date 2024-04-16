package com.app.core;

public abstract class Emp {
	private double basic;

	public Emp(double basic) {
		super();
		this.basic = basic;
	}
	

	public double getBasic() {
		return basic;
	}


	public abstract double computeSalary();
}
