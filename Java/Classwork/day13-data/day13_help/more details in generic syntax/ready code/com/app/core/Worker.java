package com.app.core;

public class Worker extends Emp {

	public Worker(double basic) {
		super(basic);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double computeSalary() {
		// TODO Auto-generated method stub
		return getBasic() + 500;
	}
}
