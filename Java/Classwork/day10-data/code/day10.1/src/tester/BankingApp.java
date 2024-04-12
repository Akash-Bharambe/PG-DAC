package tester;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

import com.app.banking.AccountType;
import com.app.banking.BankAccount;
import static utils.BankingValidations.*;

public class BankingApp {

	public static void main(String[] args) {// init phase => set up of app
		try (Scanner sc = new Scanner(System.in)) {
			// create empty AL to store bank acct details
			ArrayList<BankAccount> accountList = new ArrayList<>();
			// size = 0 , init capa=10
			boolean exit = false;
			// clnt servicing phase
			while (!exit) {
				System.out.println("Options - 1.Create A/C \n" + "2. Display all accts \n"
						+ "3. Check if account exists\n" + "0. Exit");
				System.out.println("Choose ");
				try {
					switch (sc.nextInt()) {
					case 1:
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

					case 3:
						System.out.println("Enter a/c no , to check");						
						BankAccount a=new BankAccount(sc.nextInt());
						System.out.println(accountList.contains(a));
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
