package tester;

import java.time.LocalDate;

import com.app.banking.AccountType;
import com.app.banking.BankAccount;

public class TestEquals {

	public static void main(String[] args) {
		/*
		 * int acctNo, String firstName, String lastName, 
			AccountType acType, LocalDate dob,
			double balance
		 */
		Object a1=new BankAccount(101, "a1", "b1", 
				AccountType.SAVING,
				LocalDate.parse("1990-01-10"), 10000);
		Object a2=new BankAccount(102, "a1", "b1", 
				AccountType.SAVING,
				LocalDate.parse("1990-01-10"), 10000);
		System.out.println(a1.equals(a2));//t
		Object ref="hello";
		System.out.println(a1.equals(ref));//f
		System.out.println("Supported a/c types ");
		for(AccountType a: AccountType.values())
			System.out.println(a);
	
		

	}

}
