package bank.app.tester;

import static bank.app.utils.Utils.closeAccount;
import static bank.app.utils.Utils.depositFunds;
import static bank.app.utils.Utils.displaySummary;
import static bank.app.utils.Utils.filterType;
import static bank.app.utils.Utils.openBankAccount;
import static bank.app.utils.Utils.showAllAccounts;
import static bank.app.utils.Utils.showTransactions;
import static bank.app.utils.Utils.sortAccountBalance;
import static bank.app.utils.Utils.sortAccountNumber;
import static bank.app.utils.Utils.sortDateBalance;
import static bank.app.utils.Utils.transferFunds;
import static bank.app.utils.Utils.withdrawFunds;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import bank.app.Bank.AccountType;
import bank.app.Bank.BankApplication;

public class Tester {
	private static Scanner scanner = new Scanner(System.in);

	public static int menuList() {
		System.out.println("\n");
		System.out.println("0. EXIT");
		System.out.println("1. put Account");
		System.out.println("2. Show All Accounts");
		System.out.println("3. Display account summary");
		System.out.println("4. Deposit funds");
		System.out.println("5. Withdraw funds.");
		System.out.println("6. Funds Transfer");
		System.out.println("7. Close Account");
		System.out.println("8. Show Transactions");
		System.out.println("9. Sort accounts as per ASCENDING order of ACCOUNT NUMBER");
		System.out.println("10. Sort accounts as per ASCENDING order of ACCOUNT BALANCE");
		System.out.println("11. Sort accounts as per ASCENDING order of DOB and DESCENDING order of ACCOUNT BALANCE");
		System.out.println("12. Filter By Account Type");
		System.out.print("Enter Choice: ");
		return scanner.nextInt();
	}

	private static void populateBank(Map<Integer, BankApplication> accounts) {
		accounts.put(201, new BankApplication(201, "Akash", "Bharambe", AccountType.FD, 10000.50D,
				LocalDate.parse("2002-06-26")));
		accounts.put(202,
				new BankApplication(202, "John", "Doe", AccountType.SAVINGS, 15000.75D, LocalDate.parse("2000-03-15")));
		accounts.put(203, new BankApplication(203, "Jane", "Smith", AccountType.CURRENT, 20000.0D,
				LocalDate.parse("2002-06-26")));
		accounts.put(204, new BankApplication(204, "Michael", "Johnson", AccountType.FD, 50000.25D,
				LocalDate.parse("2002-06-26")));
		accounts.put(205, new BankApplication(205, "Emily", "Williams", AccountType.SAVINGS, 25000.50D,
				LocalDate.parse("1999-09-05")));
		accounts.put(206, new BankApplication(206, "David", "Brown", AccountType.CURRENT, 30000.0D,
				LocalDate.parse("2001-12-30")));
		accounts.put(207,
				new BankApplication(207, "Sarah", "Jones", AccountType.FD, 100000.0D, LocalDate.parse("2003-05-25")));
		accounts.put(208, new BankApplication(208, "Matthew", "Martinez", AccountType.SAVINGS, 35000.75D,
				LocalDate.parse("2004-08-12")));
		accounts.put(209, new BankApplication(209, "Jessica", "Taylor", AccountType.CURRENT, 40000.0D,
				LocalDate.parse("1997-04-18")));
		accounts.put(210,
				new BankApplication(210, "Daniel", "Garcia", AccountType.FD, 75000.25D, LocalDate.parse("2006-10-07")));
		accounts.put(211, new BankApplication(211, "Olivia", "Hernandez", AccountType.SAVINGS, 45000.50D,
				LocalDate.parse("2002-01-01")));
	}

	public static void main(String[] args) {
		Map<Integer, BankApplication> accounts = new HashMap<Integer, BankApplication>();
		populateBank(accounts);
		int ch;
		while ((ch = menuList()) != 0) {
			try {
				switch (ch) {
				case 1:
					openBankAccount(accounts);
					break;
				case 2:
					showAllAccounts(accounts);
					break;
				case 3:
					displaySummary(accounts);
					break;
				case 4:
					depositFunds(accounts);
					break;
				case 5:
					withdrawFunds(accounts);
					break;
				case 6:
					transferFunds(accounts);
					break;
				case 7:
					closeAccount(accounts);
					break;
				case 8:
					showTransactions(accounts);
					break;
				case 9:
					sortAccountNumber(accounts);
					break;
				case 10:
					sortAccountBalance(accounts);
					break;
				case 11:
					sortDateBalance(accounts);
					break;
				case 12:
					filterType(accounts);
					break;
				default:
					System.out.println("Please enter a valid Input...!!!");
					break;
				}
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}

}
