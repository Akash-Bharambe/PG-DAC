package bank.app.Bank;

import java.time.LocalDate;

public class BankApplication implements Comparable<BankApplication> {
	private int accountNo;
	private String fName;
	private String lName;
	private AccountType accType;
	private double balance;
	private LocalDate dob;

	public BankApplication(int accountNo, String fName, String lName, AccountType accType, double balance,
			LocalDate dob) {
		super();
		this.accountNo = accountNo;
		this.fName = fName;
		this.lName = lName;
		this.accType = accType;
		this.balance = balance;
		this.dob = dob;
	}

	public BankApplication(int accountNo) {
		super();
		this.accountNo = accountNo;
	}

	@Override
	public String toString() {
		return "BankApplication [accountNo=" + accountNo + ", fName=" + fName + ", lName=" + lName + ", accType="
				+ accType + ", balance=" + balance + ", dob=" + dob + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof BankApplication) {
			BankApplication application = (BankApplication) obj;
			return this.accountNo == application.accountNo;
		}
		return false;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public int compareTo(BankApplication o) {
		return this.accountNo - o.accountNo;
	}
}
