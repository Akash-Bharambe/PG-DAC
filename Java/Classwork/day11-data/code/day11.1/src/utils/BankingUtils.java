package utils;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.app.banking.AccountType;
import com.app.banking.BankAccount;

import custom_exceptions.BankingException;
import static java.time.LocalDate.parse;
import static com.app.banking.AccountType.*;

public class BankingUtils {
//add a public static method to accept a/c no n ret acct details
	// or throw exc
	public static BankAccount findByAccountNo(int acctNo, 
			List<BankAccount> acctList) throws BankingException {
		BankAccount acct = new BankAccount(acctNo);
		int index = acctList.indexOf(acct);
		if (index == -1)
			throw new BankingException("Invalid a/c no !!!!!");
		return acctList.get(index);
	}

	// add public static method to return a list populated with bank accounts
	public static List<BankAccount> populateList() {
		List<BankAccount> accts = new ArrayList<>();//up casting
		accts.add(new BankAccount(101, "a1", "b1", 
				SAVING, 
				parse("1999-01-21"), 20000));
		accts.add(new BankAccount(10, "a2", "b2", 
				CURRENT, 
				parse("1990-01-21"), 6000));
		accts.add(new BankAccount(34, "a3", "b3", 
				SAVING, 
				parse("1990-04-20"), 12000));
		accts.add(new BankAccount(20, "a4", "b4", 
				FD, 
				parse("1992-10-21"), 500000));
		accts.add(new BankAccount(50, "a5", "b5", 
				SAVING, 
				parse("1995-11-21"), 19000));
		return accts;
	}
}
