package com.app.core;

public class PermanentWorker extends Worker {

	
	public PermanentWorker(double basic) {
		super(basic);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double computeSalary() {
		// TODO Auto-generated method stub
		return getBasic()+ 700;
	}

}
