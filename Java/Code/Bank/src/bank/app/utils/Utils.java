package bank.app.utils;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import bank.app.Bank.BankApplication;
import bank.app.Bank.ValidationRules;
import bank.app.exception.BankException;
import bank.app.sort.BankAscBalanceComparator;
import bank.app.sort.BankAscDateDescBalanceComparator;

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

	public static int findAccount(List<BankApplication> accounts) throws BankException {
		int accountNo;
		System.out.print("\nEnter account Number: ");
		accountNo = scanner.nextInt();
		BankApplication a = new BankApplication(accountNo);

		int index = accounts.indexOf(a);

		if (index == -1) {
			throw new BankException("Account Not Found...");
		}
		return index;
	}

	public static void showAllAccounts(List<BankApplication> accounts) {
		for (BankApplication acc : accounts) {
			System.out.println(acc);
		}
	}

	public static void displaySummary(List<BankApplication> accounts) throws BankException {
		System.out.println(accounts.get(findAccount(accounts)));
	}

	public static void depositFunds(List<BankApplication> accounts) throws BankException {
		BankApplication acc = accounts.get(findAccount(accounts));
		System.out.println("\nEnter Amount to Deposit");
		acc.setBalance(scanner.nextDouble() + acc.getBalance());
	}

	public static void withdrawFunds(List<BankApplication> accounts) throws BankException {
		BankApplication acc = accounts.get(findAccount(accounts));

		System.out.println("\nEnter Amount to Withdraw");
		Double amt = scanner.nextDouble();
		if (amt < acc.getBalance()) {
			acc.setBalance(acc.getBalance() - amt);
		} else {
			throw new BankException("Insufficient Funds");
		}
	}

	public static void transferFunds(List<BankApplication> accounts) throws BankException {
		
		System.out.println("Source account details...");
		BankApplication src = accounts.get(findAccount(accounts));
		System.out.println("Destination account details...");
		BankApplication dest = accounts.get(findAccount(accounts));
				
		System.out.print("Amount to Transfer: ");
		double fund=scanner.nextDouble();
		if (fund < src.getBalance()) {
			src.setBalance(src.getBalance() - fund);
		} else {
			throw new BankException("Insufficient Funds");
		}
		dest.setBalance(fund + dest.getBalance());
	}

	public static void closeAccount(List<BankApplication> accounts) throws BankException {
		BankApplication acc = accounts.get(findAccount(accounts));
		accounts.remove(acc);
		System.out.println("Account Closed...");
	}

	public static void sortAccountNumber(List<BankApplication> accounts) {
		Collections.sort(accounts,null);
		showAllAccounts(accounts);
	}

	public static void sortAccountBalance(List<BankApplication> accounts) {
		Collections.sort(accounts, new BankAscBalanceComparator());
		showAllAccounts(accounts);
	}

	public static void sortDateBalance(List<BankApplication> accounts) {
		Collections.sort(accounts,new BankAscDateDescBalanceComparator());
		showAllAccounts(accounts);
	}
}
