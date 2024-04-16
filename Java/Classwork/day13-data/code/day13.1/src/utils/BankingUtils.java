package utils;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.app.banking.AccountType;
import com.app.banking.BankAccount;

import custom_exceptions.BankingException;
import static java.time.LocalDate.parse;
import static com.app.banking.AccountType.*;

public class BankingUtils {
//add a public static method to accept a/c no n ret acct details
	// or throw exc
	public static BankAccount findByAccountNo(int acctNo,
			Map<Integer, BankAccount> map) throws BankingException {
//		BankAccount acct = new BankAccount(acctNo);
//		int index = acctList.indexOf(acct);
//		if (index == -1)
//			throw new BankingException("Invalid a/c no !!!!!");
//		return acctList.get(index);
		BankAccount account = map.get(acctNo);
		if(account == null)
			throw new BankingException("Invalid a/c no !!!!!");
		return account;
		
	}

	// add public static method to return a map populated with bank accounts
	// What will be type of the map ? HashMap<acctNo : Integer,
	// acct details : BankAccount>
	public static Map<Integer, BankAccount> populateMap() {
		Map<Integer, BankAccount> acctMap = new HashMap<>();
		acctMap.put(101, 
				new BankAccount(101, "a1", "b1", SAVING, parse("1999-01-21"), 20000));
		acctMap.put(10,new BankAccount(10, "a2", "b2", CURRENT, parse("1990-01-21"), 6000));
		acctMap.put(34,new BankAccount(34, "a3", "b3", SAVING, parse("1990-04-20"), 12000));
		acctMap.put(20,new BankAccount(20, "a4", "b4", FD, parse("1992-10-21"), 500000));
		acctMap.put(50,new BankAccount(50, "a5", "b5", SAVING, parse("1995-11-21"), 19000));
		acctMap.put(10,new BankAccount(10, "a22", "b22", CURRENT, parse("1993-01-21"), 6500));
		System.out.println("size "+acctMap.size());
		System.out.println("Map "+acctMap);
		return acctMap;
	}
}
