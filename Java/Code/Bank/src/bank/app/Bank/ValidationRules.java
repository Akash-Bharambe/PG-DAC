package bank.app.Bank;

import java.time.LocalDate;

import bank.app.exception.BankException;


public class ValidationRules {

	public static BankApplication validateAccount(int accountNo, String fName, String lName, String accType,
			double balance, String dob) throws Exception {

		AccountType acc = validateAccountTypes(accType);
		validateOpeningBalance(acc, balance);
		LocalDate dobDate = validateDOB(dob);

		return new BankApplication(accountNo, fName, lName, acc, balance, dobDate);
	}

	public static LocalDate validateDOB(String dob) throws Exception {
		LocalDate date = LocalDate.parse(dob);
		if (date.plusYears(18).getYear() < LocalDate.now().getYear()) {
			return date;
		}
		throw new BankException("Account Holder must be above 18 years of age to open an account");
	}

	public static void validateOpeningBalance(AccountType type, double balance) throws BankException {
		if (type.getMinBalance() > balance) {
			throw new BankException("For opening an " + type.name()
					+ " account you must add minimum opening balance of " + type.getMinBalance() + " Rs");
		}
	}

	public static AccountType validateAccountTypes(String acc) throws IllegalArgumentException {
		return AccountType.valueOf(acc.toUpperCase());
	}
}
