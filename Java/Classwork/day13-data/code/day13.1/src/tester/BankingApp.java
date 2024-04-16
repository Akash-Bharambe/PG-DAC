package tester;

import static utils.BankingUtils.findByAccountNo;
import static utils.BankingUtils.populateMap;
import static utils.BankingValidations.validateInputs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import com.app.banking.BankAccount;

import custom_exceptions.BankingException;
import custom_ordering.BankAccountDoBComparator;
import custom_ordering.BankAccountNoDescComparator;

public class BankingApp {

	public static void main(String[] args) {// init phase => set up of app
		try (Scanner sc = new Scanner(System.in)) {
			// get a populated map from BankingUtils
			Map<Integer, BankAccount> accountMap = populateMap();
			boolean exit = false;
			// clnt servicing phase
			while (!exit) {
				System.out.println("Options - 1.Create A/C \n" + "2. Display all accts \n" + "3. Fetch A/C Summary\n"
						+ "4. Deposit\n" + "5. Withdraw\n" + "6. Money Transfer\n" + "7. Close A/C \n"
						+ "8. Sort the accounts as per asc order of account nos\n"
						+ "9. Sort the accounts as per desc order of acct no\n" + "10. Sort the accounts as per DoB \n"
						+ "0. Exit");
				System.out.println("Choose ");
				try {
					switch (sc.nextInt()) {
					case 1: // create a/c
						System.out.println("Enter acct details -  acctNo,  firstName,  "
								+ "lastName,  acType,  dob(yr-mon-day)  balance");
						BankAccount account = validateInputs(sc.nextInt(), sc.next(), sc.next(), sc.next(), sc.next(),
								sc.nextDouble(), accountMap);
						// => valid i/ps
						accountMap.put(account.getAcctNo(), account);
						System.out.println("bank a/c created ....");
						break;
					case 2:
						System.out.println("All accounts -");
						for (BankAccount a : accountMap.values())
							System.out.println(a);
						break;

					case 3:// fetch a/c summary
						System.out.println("Enter a/c no , to fetch a/c summary"); // 99
						System.out.println(findByAccountNo(sc.nextInt(), accountMap));
						break;
					case 4: // deposit
						System.out.println("Enter a/c no n amount");
						BankAccount a1 = findByAccountNo(sc.nextInt(), accountMap);
						a1.deposit(sc.nextDouble());
						System.out.println("money deposited");
						break;
					case 5: // withdraw
						System.out.println("Enter a/c no n withdrawl amount");
						a1 = findByAccountNo(sc.nextInt(), accountMap);
						a1.withdraw(sc.nextDouble());
						System.out.println("money withdrawn");
						break;

					case 6: // transfer
						System.out.println("Enter src n dest a/c no n withdrawl amount");
						BankAccount src = findByAccountNo(sc.nextInt(), accountMap);
						BankAccount dest = findByAccountNo(sc.nextInt(), accountMap);
						src.transferFunds(dest, sc.nextDouble());
						System.out.println("money withdrawn");
						break;

					case 7:
						System.out.println("Enter a/c no to close the a/c");
						a1 = accountMap.remove(sc.nextInt());
						if (a1 == null)
							throw new BankingException("Invalid a/c no : A/c can't be closed!!!!!");
						System.out.println("a/c closed " + a1);
						break;
					case 8:
						System.out.println("Display the accts sorted as per asc acct nos");
						// sorting criteria --key based or value based ?
						// key based -- TreeMap , asc order - Natural Order , TreeMap() , TreeMap(map)
						Map<Integer, BankAccount> sortedMap = new TreeMap<>(accountMap);
						// JVM invokes --TimSort -- Integer's comapreTo
						for (BankAccount a : sortedMap.values())
							System.out.println(a);
						break;
					case 9:
						System.out.println("Display the accts sorted as per desc acct no");
						// TreeMap(Comparator<? super K> comp)
						sortedMap = new TreeMap<>(new BankAccountNoDescComparator());
						// populate map
						sortedMap.putAll(accountMap);
						// JVM invokes -TimSort --BankAccountNoDescComparator's compare
						for (BankAccount a : sortedMap.values())
							System.out.println(a);
						break;

					case 10:
						System.out.println("Display the accts sorted as per DoB of the account holder");
						// is the sorting criteria --key based or value based ? -- value based
						// can you use TreeMap - NO
						// soln --: convert the map --> Collection
						// Collection<BankAccount> accts=accountMap.values();
						// custom ordering or natural ordering -- custom ordering
						// Collections.sort(List<T> list, Comparator<T> comp)
						// Collections.sort((List<BankAccount>)accts, new BankAccountDoBComparator());
						// class cast exc
						ArrayList<BankAccount> acctList = 
								new ArrayList<>(accountMap.values());
						Collections.sort(acctList, new BankAccountDoBComparator());
						System.out.println("Bank accounts sorted as per DoB");
						for(BankAccount a : acctList)
							System.out.println(a);
						
						break;

					case 0:
						exit = true;
						break;
					}
				} catch (Exception e) {
					// read off all the pneding tokens from Scanner's buffer
					sc.nextLine();
					System.out.println(e);
					System.out.println("Pls retry ...");
				}
			}

		}

	}

}
