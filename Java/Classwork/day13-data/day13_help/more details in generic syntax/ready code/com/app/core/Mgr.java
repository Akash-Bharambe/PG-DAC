package com.app.core;

public  class Mgr extends Emp {
	
	public Mgr(double basic) {
		super(basic);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double computeSalary() {
		// TODO Auto-generated method stub
		return getBasic()+ 1000;
	}
}
