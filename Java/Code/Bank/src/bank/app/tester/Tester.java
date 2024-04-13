package bank.app.tester;

import java.util.ArrayList;
import java.util.Scanner;

import bank.app.Bank.BankApplication;
import bank.app.utils.Utils;

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
		System.out.println("8. Sort accounts as per ASCENDING order of ACCOUNT NUMBER");
		System.out.println("9. Sort accounts as per ASCENDING order of ACCOUNT BALANCE");
		System.out.println("10. Sort accounts as per ASCENDING order of DOB and DESCENDING order of ACCOUNT BALANCE");
		System.out.print("Enter Choice: ");
		return scanner.nextInt();
	}
	
	private static void populateBank(ArrayList<BankApplication> accounts) {
		
	}

	public static void main(String[] args) {
		ArrayList<BankApplication> accounts = new ArrayList<BankApplication>();
		populateBank(accounts);
		int ch;
		while ((ch = menuList()) != 0) {
			try {
				switch (ch) {
				case 1:
					BankApplication a = Utils.openBankAccount();
					accounts.add(a);
					break;
				case 2:
					Utils.showAllAccounts(accounts);
					break;
				case 3:
					Utils.displaySummary(accounts);
					break;
				case 4:
					Utils.depositFunds(accounts);
					break;
				case 5:
					Utils.withdrawFunds(accounts);
					break;
				case 6:
					Utils.transferFunds(accounts);
					break;
				case 7:
					Utils.closeAccount(accounts);
					break;
				case 8:
					Utils.sortAccountNumber(accounts);
					break;
				case 9:
					Utils.sortAccountBalance(accounts);
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
