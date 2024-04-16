package com.app.core;

public class TempWorker extends Worker {

	public TempWorker(double basic) {
		super(basic);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double computeSalary() {
		// TODO Auto-generated method stub
		return getBasic()+ 600;
	}

}
