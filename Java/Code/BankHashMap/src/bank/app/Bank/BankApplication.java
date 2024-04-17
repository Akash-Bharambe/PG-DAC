package bank.app.Bank;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import bank.app.utils.Utils;

public class BankApplication implements Comparable<BankApplication> {
	private int accountNo;
	private String fName;
	private String lName;
	private AccountType accType;
	private double balance;
	private LocalDate dob;
	private List<String> transactions;

	public BankApplication(int accountNo, String fName, String lName, AccountType accType, double balance,
			LocalDate dob) {
		super();
		this.accountNo = accountNo;
		this.fName = fName;
		this.lName = lName;
		this.accType = accType;
		this.balance = balance;
		this.dob = dob;
		this.transactions = new ArrayList<String>();
		
		this.transactions.add(Utils.getTimeStamp()+" : "+ balance +" Rs Credited");
	}

	public BankApplication(int accountNo) {
		super();
		this.accountNo = accountNo;
	}

	public AccountType getAccType() {
		return accType;
	}

	public int getAccountNo() {
		return accountNo;
	}

	public List<String> getTransactions() {
		return transactions;
	}

	public void addTransactions(String transaction) {
		this.transactions.add(transaction);
	}

	public double getBalance() {
		return balance;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "[accountNo=" + accountNo + ", Name=" + fName + " " + lName + ", accType=" + accType + ", balance="
				+ balance + ", dob=" + dob + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof BankApplication) {
			BankApplication application = (BankApplication) obj;
			return this.accountNo == application.accountNo;
		}
		return false;
	}

	@Override
	public int compareTo(BankApplication o) {
		return this.accountNo - o.accountNo;
	}

}
