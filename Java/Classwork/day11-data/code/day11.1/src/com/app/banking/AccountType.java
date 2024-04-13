package com.app.banking;
//How to associate additional details to the enum ?
public enum AccountType {
	SAVING(10000), CURRENT(3000), FD(50000), LOAN(25000), 
	DMAT(15000);
	//state - instance var(=non static data member)
	private double minBalance;
	private AccountType(double minBalance) {
		//super(name, ordinal);
		this.minBalance=minBalance;
	}
	@Override
	public String toString() {
		return name()+":"+minBalance;
	}
	public double getMinBalance() {
		return minBalance;
	}
	public void setMinBalance(double minBalance) {
		this.minBalance = minBalance;
	}
	
	
	
}
