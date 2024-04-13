package tester;

import static utils.BankingUtils.findByAccountNo;
import static utils.BankingUtils.populateList;
import static utils.BankingValidations.validateInputs;

import java.util.List;
import java.util.Scanner;

import com.app.banking.BankAccount;

import custom_ordering.BankAccountAscBalComparator;

import java.util.Collections;

public class BankingApp {

	public static void main(String[] args) {// init phase => set up of app
		try (Scanner sc = new Scanner(System.in)) {
			// create empty AL to store bank acct details
			List<BankAccount> accountList = populateList();

			// accountList.add(12345);
			// size = 0 , init capa=10
			boolean exit = false;
			// clnt servicing phase
			while (!exit) {
				System.out.println("Options - 1.Create A/C \n" + "2. Display all accts \n" + "3. Fetch A/C Summary\n"
						+ "4. Deposit\n" + "5. Withdraw\n" + "6. Money Transfer\n" + "7. Close A/C \n"
						+ "8. Sort the accounts as per asc order of account nos\n"
						+ "9. Sort the accounts as per asc order of balance\n"
						+ "10. Sort the accounts as per asc DoB n desc bal\n" + "0. Exit");
				System.out.println("Choose ");
				try {
					switch (sc.nextInt()) {
					case 1: // create a/c
						System.out.println("Enter acct details -  acctNo,  firstName,  "
								+ "lastName,  acType,  dob(yr-mon-day)  balance");
						BankAccount account = validateInputs(sc.nextInt(), sc.next(), sc.next(), sc.next(), sc.next(),
								sc.nextDouble());
						// => valid i/ps
						accountList.add(account);
						System.out.println("bank a/c created ....");
						break;
					case 2:
						System.out.println("All accounts -");
						for (BankAccount a : accountList)
							System.out.println(a);
						break;

					case 3:// fetch a/c summary
						System.out.println("Enter a/c no , to fetch a/c summary"); // 99
						System.out.println(findByAccountNo(sc.nextInt(), accountList));
						break;
					case 4: // deposit
						System.out.println("Enter a/c no n amount");
						BankAccount a1 = findByAccountNo(sc.nextInt(), accountList);
						a1.deposit(sc.nextDouble());
						System.out.println("money deposited");
						break;
					case 5: // withdraw
						System.out.println("Enter a/c no n withdrawl amount");
						a1 = findByAccountNo(sc.nextInt(), accountList);
						a1.withdraw(sc.nextDouble());
						System.out.println("money withdrawn");
						break;

					case 6: // transfer
						System.out.println("Enter src n dest a/c no n withdrawl amount");
						BankAccount src = findByAccountNo(sc.nextInt(), accountList);
						BankAccount dest = findByAccountNo(sc.nextInt(), accountList);
						src.transferFunds(dest, sc.nextDouble());
						System.out.println("money withdrawn");
						break;

					case 7:
						System.out.println("Enter a/c no to close the a/c");
						src = findByAccountNo(sc.nextInt(), accountList);
						accountList.remove(src);
						System.out.println("a/c closed");
						break;
					case 8:
						System.out.println("Display the accts sorted as per asc acct nos");
						Collections.sort(accountList);
						for (BankAccount a : accountList)
							System.out.println(a);
						break;
					case 9:
						System.out.println("Display the accts sorted as per asc balance");
						Collections.sort(accountList,
								new BankAccountAscBalComparator());
						for (BankAccount a : accountList)
							System.out.println(a);
						break;

					case 0:
						exit = true;
						break;
					}
				} catch (Exception e) {
					System.out.println(e);
					System.out.println("Pls retry ...");
				}
			}

		}

	}

}
