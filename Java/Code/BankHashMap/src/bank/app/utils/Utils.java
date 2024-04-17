package bank.app.utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import bank.app.Bank.AccountType;
import bank.app.Bank.BankApplication;
import bank.app.Bank.ValidationRules;
import bank.app.exception.BankException;

public class Utils {
	private static Scanner scanner = new Scanner(System.in);

	public static String getTimeStamp() {
		return DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss").format(LocalDateTime.now());
	}
	
	public static void filterType(Map<Integer, BankApplication> accounts) {
		System.out.println("Enter Account Type: ");
		AccountType accountType = ValidationRules.validateAccountTypes(scanner.next());
		for (BankApplication b : accounts.values()) {
			if (b.getAccType() == accountType) {
				System.out.println(b);
			}
		}
	}

	public static void openBankAccount(Map<Integer, BankApplication> accounts) throws Exception {
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
		accounts.put(accountNo, ValidationRules.validateAccount(accountNo, fName, lName, type, balance, dob));
		System.out.println("Account Created...\n");
	}

	public static int findAccount(Map<Integer, BankApplication> accounts) throws BankException {
		int accountNo;
		System.out.print("\nEnter account Number: ");
		accountNo = scanner.nextInt();
		BankApplication a = accounts.get(accountNo);

		if (a == null) {
			throw new BankException("Account Not Found...");
		}
		return accountNo;
	}

	public static void showAllAccounts(Map<Integer, BankApplication> accounts) {
		for (BankApplication acc : accounts.values()) {
			System.out.println(acc);
		}
	}

	public static void displaySummary(Map<Integer, BankApplication> accounts) throws BankException {
		System.out.println(accounts.get(findAccount(accounts)));
	}

	public static void depositFunds(Map<Integer, BankApplication> accounts) throws BankException {
		BankApplication acc = accounts.get(findAccount(accounts));
		System.out.println("\nEnter Amount to Deposit");
		double amt = scanner.nextDouble();
		acc.setBalance(amt + acc.getBalance());
		acc.addTransactions(getTimeStamp() + " : " + amt + " Rs Credited to account " + acc.getAccountNo()
				+ ", Updated Balance is " + acc.getBalance() + "Rs");
	}

	public static void withdrawFunds(Map<Integer, BankApplication> accounts) throws BankException {
		BankApplication acc = accounts.get(findAccount(accounts));

		System.out.println("\nEnter Amount to Withdraw");
		Double amt = scanner.nextDouble();
		if (amt < acc.getBalance()) {
			acc.setBalance(acc.getBalance() - amt);
			acc.addTransactions(getTimeStamp() + " : " + amt + " Rs Debited from account " + acc.getAccountNo()
					+ ", Updated Balance is " + acc.getBalance() + "Rs");
		} else {
			acc.addTransactions(
					getTimeStamp() + " : Tranasaction Unsucessfull " + amt + " Rs not Debited from account "
							+ acc.getAccountNo() + ", Available Balance is " + acc.getBalance() + "Rs");
			throw new BankException("Insufficient Funds");
		}
	}

	public static void transferFunds(Map<Integer, BankApplication> accounts) throws BankException {

		System.out.println("Source account details...");
		BankApplication src = accounts.get(findAccount(accounts));
		System.out.println("Destination account details...");
		BankApplication dest = accounts.get(findAccount(accounts));

		System.out.print("Amount to Transfer: ");
		double fund = scanner.nextDouble();
		if (fund < src.getBalance()) {
			src.setBalance(src.getBalance() - fund);
			src.addTransactions(getTimeStamp() + " : " + fund + " Rs Debited from account " + src.getAccountNo()
					+ ", Updated Balance is " + src.getBalance() + "Rs");
		} else {
			src.addTransactions(
					getTimeStamp() + " : Tranasaction Unsucessfull " + fund + " Rs not Debited from account "
							+ src.getAccountNo() + ", Available Balance is " + src.getBalance() + "Rs");
			throw new BankException("Insufficient Funds");
		}
		dest.setBalance(fund + dest.getBalance());
		dest.addTransactions(getTimeStamp() + " : " + fund + " Rs Credited to account " + dest.getAccountNo()
				+ " from account " + src.getAccountNo() + ", Updated Balance is " + dest.getBalance() + "Rs");
	}

	public static void closeAccount(Map<Integer, BankApplication> accounts) throws BankException {
		accounts.remove(findAccount(accounts));
		System.out.println("Account Closed...");
	}

	public static void sortAccountNumber(Map<Integer, BankApplication> accounts) {
		Map<Integer, BankApplication> accTreeMap = new TreeMap<>(accounts);
		showAllAccounts(accTreeMap);
	}

	public static void sortAccountBalance(Map<Integer, BankApplication> accounts) {
		List<BankApplication> list = new ArrayList<>(accounts.values());
		Collections.sort(list, new Comparator<BankApplication>(){

			@Override
			public int compare(BankApplication o1, BankApplication o2) {
				return (int) (o1.getBalance() - o2.getBalance());
			}
		});
		showAllAccounts(accounts);
	}

	public static void sortDateBalance(Map<Integer, BankApplication> accounts) {
		List<BankApplication> list = new ArrayList<>(accounts.values());
		Collections.sort(list, new Comparator<BankApplication>() {

			@Override
			public int compare(BankApplication o1, BankApplication o2) {
				if (o1.getDob().compareTo(o2.getDob()) == 0) {
					return (int) (o1.getBalance() - o2.getBalance());
				}
				return o1.getDob().compareTo(o2.getDob());
			}
			
		});
		showAllAccounts(accounts);
	}
	
	

	public static void showTransactions(Map<Integer, BankApplication> accounts) throws BankException {

		List<String> transactions = accounts.get(findAccount(accounts)).getTransactions();

		for (String string : transactions) {
			System.out.println(string);
		}
	}
}
