package app.tester;

import java.util.ArrayList;
import java.util.Scanner;

import app.Bank.BankApplication;
import app.utils.Utils;

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
		System.out.print("Enter Choice: ");
		return scanner.nextInt();
	}

	public static void main(String[] args) {
		ArrayList<BankApplication> accounts = new ArrayList<BankApplication>();

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
