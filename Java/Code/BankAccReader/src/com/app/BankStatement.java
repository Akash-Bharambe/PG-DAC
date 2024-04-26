package com.app;

import java.io.Serializable;
import java.time.LocalDate;

public class BankStatement implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2590045965372109745L;
	private LocalDate TransactionDate;
	private String Narration;
	private double WithdrawalAmount;
	private double DepositAmount;
	
	public BankStatement(LocalDate transactionDate, String narration, double withdrawalAmount, double depositAmount) {
		TransactionDate = transactionDate;
		Narration = narration;
		WithdrawalAmount = withdrawalAmount;
		DepositAmount = depositAmount;
	}

	public LocalDate getTransactionDate() {
		return TransactionDate;
	}

	public String getNarration() {
		return Narration;
	}

	public double getWithdrawalAmount() {
		return WithdrawalAmount;
	}

	public double getDepositAmount() {
		return DepositAmount;
	}

	@Override
	public String toString() {
		return "BankStatement [TransactionDate=" + TransactionDate + ", Narration=" + Narration + ", WithdrawalAmount="
				+ WithdrawalAmount + ", DepositAmount=" + DepositAmount + "]";
	}
}
