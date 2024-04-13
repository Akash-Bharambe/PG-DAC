package custom_ordering;

import java.util.Comparator;

import com.app.banking.BankAccount;

public class BankAccountAscBalComparator 
implements Comparator<BankAccount> {
	@Override
	public int compare(BankAccount a1, BankAccount a2) {
		System.out.println("in compare - bal");
		if(a1.getBalance()<a2.getBalance())
			return -1;
		if(a1.getBalance()==a2.getBalance())
			return 0;
		return 1;
		
	}
}
