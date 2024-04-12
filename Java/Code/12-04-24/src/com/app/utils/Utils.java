package com.app.utils;

import java.util.ArrayList;
import java.util.Scanner;

import com.app.Bank.BankApplication;
import com.app.Bank.ValidationRules;

public class Utils {
	private static Scanner scanner = new Scanner(System.in);

	public static BankApplication openBankAccount() throws Exception {
		System.out.print("Enter account Number: ");
		int accountNo = scanner.nextInt();
		System.out.print("Enter account holder Full Name: ");
		String fName = scanner.next();
		String lName = scanner.next();
		System.out.print("Enter Which account to open: ");
		String type = scanner.next();
		System.out.print("Enter balance to be added to account: ");
		double balance = scanner.nextDouble();
		System.out.print("Enter Date of Birth(yyyy-mm-dd): ");
		String dob = scanner.next();
		BankApplication a = ValidationRules.validateAccount(accountNo, fName, lName, type, balance, dob);
		System.out.println("Account Created...\n");
		return a;

	}

	public static void showAllAccounts(ArrayList<BankApplication> accounts) {
		for (BankApplication acc : accounts) {
			System.out.println(acc);
		}
	}

	public static void displaySummary(ArrayList<BankApplication> accounts) {
		int accountNo;
		System.out.print("\nEnter account Number: ");
		accountNo = scanner.nextInt();

		for (BankApplication acc : accounts) {
			if (acc.equals(new BankApplication(accountNo))) {
				System.out.println(acc);
			}
		}
	}

	public static void depositFunds(ArrayList<BankApplication> accounts) {
		int accountNo;
		System.out.print("\nEnter account Number: ");
		accountNo = scanner.nextInt();
		for (BankApplication acc : accounts) {
			if (acc.equals(new BankApplication(accountNo))) {
				System.out.println("\nEnter Amount to Deposit");
				acc.setBalance(scanner.nextDouble() + acc.getBalance());
			}

		}
	}

	public static void withdrawFunds(ArrayList<BankApplication> accounts) {
		int accountNo;
		System.out.print("\nEnter account Number: ");
		accountNo = scanner.nextInt();
		for (BankApplication acc : accounts) {
			if (acc.equals(new BankApplication(accountNo))) {
				System.out.println("\nEnter Amount to Withdraw");
				acc.setBalance(acc.getBalance() - scanner.nextDouble());
			}

		}
	}
}