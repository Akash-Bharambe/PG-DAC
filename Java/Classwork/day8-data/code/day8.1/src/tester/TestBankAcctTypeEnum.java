package tester;

import java.util.Scanner;

import enums.AccountType;

public class TestBankAcctTypeEnum {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Supported a/c types -");
			for (AccountType a : AccountType.values())
				System.out.println(a);
			System.out.println("Choose a/c type");
			AccountType acType = AccountType.valueOf(sc.next().toUpperCase());
			//=> parsing successful
			System.out.println("You chose : "+acType);
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("main over....");

	}

}
