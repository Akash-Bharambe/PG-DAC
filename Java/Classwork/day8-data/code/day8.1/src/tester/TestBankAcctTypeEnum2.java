package tester;

import java.util.Scanner;
import enums.AccountType;
import static enums.AccountType.*;

public class TestBankAcctTypeEnum2 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Supported a/c types -");
			for (AccountType a : values())
				System.out.println(a);//toString : AcctType
			System.out.println("Choose a/c type");
			AccountType acType = valueOf(sc.next().toUpperCase());
			//=> parsing successful
			System.out.println("You chose : "+acType);
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("main over....");

	}

}
