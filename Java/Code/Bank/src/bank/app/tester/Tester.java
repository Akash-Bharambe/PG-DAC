package bank.app.tester;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import bank.app.Bank.AccountType;
import bank.app.Bank.BankApplication;
import static bank.app.utils.Utils.*;

public class Tester {
	private static Scanner scanner = new Scanner(System.in);

	public static int menuList() {
		System.out.println("\n");
		System.out.println("0. EXIT");
		System.out.println("1. Add Account");
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
		System.out.print("Enter Choice: ");
		return scanner.nextInt();
	}

	private static void populateBank(List<BankApplication> accounts) {
		accounts.add(new BankApplication(201, "Akash", "Bharambe", AccountType.FD, 10000.50D,
				LocalDate.parse("2002-06-26")));
		accounts.add(
				new BankApplication(202, "John", "Doe", AccountType.SAVINGS, 15000.75D, LocalDate.parse("2000-03-15")));
		accounts.add(new BankApplication(203, "Jane", "Smith", AccountType.CURRENT, 20000.0D,
				LocalDate.parse("2002-06-26")));
		accounts.add(new BankApplication(204, "Michael", "Johnson", AccountType.FD, 50000.25D,
				LocalDate.parse("2002-06-26")));
		accounts.add(new BankApplication(205, "Emily", "Williams", AccountType.SAVINGS, 25000.50D,
				LocalDate.parse("1999-09-05")));
		accounts.add(new BankApplication(206, "David", "Brown", AccountType.CURRENT, 30000.0D,
				LocalDate.parse("2001-12-30")));
		accounts.add(
				new BankApplication(207, "Sarah", "Jones", AccountType.FD, 100000.0D, LocalDate.parse("2003-05-25")));
		accounts.add(new BankApplication(208, "Matthew", "Martinez", AccountType.SAVINGS, 35000.75D,
				LocalDate.parse("2004-08-12")));
		accounts.add(new BankApplication(209, "Jessica", "Taylor", AccountType.CURRENT, 40000.0D,
				LocalDate.parse("1997-04-18")));
		accounts.add(
				new BankApplication(210, "Daniel", "Garcia", AccountType.FD, 75000.25D, LocalDate.parse("2006-10-07")));
		accounts.add(new BankApplication(211, "Olivia", "Hernandez", AccountType.SAVINGS, 45000.50D,
				LocalDate.parse("2002-01-01")));
	}

	public static void main(String[] args) {
		List<BankApplication> accounts = new ArrayList<BankApplication>();
		populateBank(accounts);
		int ch;
		while ((ch = menuList()) != 0) {
			try {
				switch (ch) {
				case 1:
					accounts.add(openBankAccount());
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
