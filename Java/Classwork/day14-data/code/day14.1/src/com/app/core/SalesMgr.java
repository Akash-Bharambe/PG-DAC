package com.app.core;

public class SalesMgr extends Mgr {

	public SalesMgr(double basic) {
		super(basic);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double computeSalary() {
		// TODO Auto-generated method stub
		return getBasic()+ 2000;
	}

}
