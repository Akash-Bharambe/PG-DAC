package utils;
//a separate class to hold validation rules

import java.time.LocalDate;
import java.util.Map;

import com.app.banking.AccountType;
import com.app.banking.BankAccount;

import custom_exceptions.BankingException;

public class BankingValidations {
	// add a public static method to validate required i/ps
	public static BankAccount validateInputs(int acctNo, String firstName, String lastName, String acType, String dob,
			double balance,Map<Integer, BankAccount> map) throws IllegalArgumentException, BankingException {
		validateAcctNo(acctNo, map);
		AccountType type = validateAcType(acType);
		validateBalance(type, balance);
		// => valid i/ps
		return new BankAccount(acctNo, firstName, lastName, type, LocalDate.parse(dob), balance);

	}

//add a method to validate acct type
	public static AccountType validateAcType(String acType) throws IllegalArgumentException {
		return AccountType.valueOf(acType.toUpperCase());
	}

	// add a method validate opening bal against min bal
	public static void validateBalance(AccountType type, double openingBal) throws BankingException {
		if (openingBal < type.getMinBalance())
			throw new BankingException("Insufficient opening balance !!!!!");

	}

	// add a method (validation rule) to validate acct no (chk for dups)
	// throws custom exc - acct no is found , ret type : void
	public static void validateAcctNo(int acctNo, 
			Map<Integer, BankAccount> map) throws BankingException{
		if (map.containsKey(acctNo))
			throw new BankingException("Dup A/C no !!!!!!!!!!!!");
	}

}
