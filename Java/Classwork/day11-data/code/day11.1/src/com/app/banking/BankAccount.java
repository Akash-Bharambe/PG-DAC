package com.app.banking;

import java.time.LocalDate;

import custom_exceptions.BankingException;
import static utils.BankingValidations.validateBalance;

/*
 * BankAccount - account no , customer name(first name last name), 
 * account type , customer dob , a/c creation date , balance
1.1 state
1.2 parameterized ctor to init state
1.3 toString
1.4 override equals to replace -ref equality by UID equality based upon PK
simple PK - acct number

 */
public class BankAccount implements Comparable<BankAccount>{
	private int acctNo;
	private String firstName;
	private String lastName;
	private AccountType acType;
	private LocalDate dob;
	private LocalDate creationDate;
	private double balance;

	// ctor : to init complete state of the acct
	public BankAccount(int acctNo, String firstName, String lastName, 
			AccountType acType, LocalDate dob,
			double balance) {
		super();
		this.acctNo = acctNo;
		this.firstName = firstName;
		this.lastName = lastName;
		this.acType = acType;
		this.dob = dob;
		this.creationDate = LocalDate.now();
		this.balance = balance;
	}
	//add overoaded ctor to wrap PK
	public BankAccount(int acctNo) {
		super();
		this.acctNo = acctNo;
	}

	// override toString to ret a/c details
	@Override
	public String toString() {
		return "BankAccount [acctNo=" + acctNo + ", firstName=" + firstName + ", lastName=" + lastName + ", acType="
				+ acType + ", dob=" + dob + ", creationDate=" + creationDate + ", balance=" + balance + "]";
	}

	
	// override equals method to replace ref equality
	// by UID(acct no) equality
	@Override
	public boolean equals(Object o) {
		
		System.out.println("in acct's equals");
		if (o instanceof BankAccount) {
			BankAccount a = (BankAccount) o;
			return this.acctNo == a.acctNo;
		}
		return false;
		
	}
	@Override
	public int compareTo(BankAccount anotherAccount)
	{
		System.out.println("in compareTo ");
		if(this.acctNo<anotherAccount.acctNo)
			return -1;
		if(this.acctNo==anotherAccount.acctNo)
			return 0;
		return 1;					
	}
	//add B.L methods -deposit
	public void deposit(double amount)
	{
		this.balance += amount;
	}
	//withdraw
	public void withdraw(double amount) throws BankingException
	{
//		if((balance-amount) < acType.getMinBalance())
//			throw new BankingException("insufficient bal !!!!");
		validateBalance(acType, balance-amount);
		this.balance -= amount;
	}
	//funds transfer
	public void transferFunds(BankAccount dest,
			double transferAmount) throws BankingException
	{
		this.withdraw(transferAmount);
		//=> withdraw : success
		dest.deposit(transferAmount);
	}
	//getters
	public LocalDate getDob() {
		return dob;
	}
	public double getBalance() {
		return balance;
	}
	

	
}
