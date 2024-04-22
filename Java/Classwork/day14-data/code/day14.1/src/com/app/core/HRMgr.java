package com.app.core;

public class HRMgr extends Mgr {

	public HRMgr(double basic) {
		super(basic);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double computeSalary() {
		// TODO Auto-generated method stub
		return getBasic()+3000;
	}

}
