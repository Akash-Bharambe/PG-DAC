package custom_ordering;

import java.util.Comparator;

import com.app.banking.BankAccount;

public class BankAccountDoBComparator implements Comparator<BankAccount> {

	@Override
	public int compare(BankAccount o1, BankAccount o2) {
		System.out.println("in compare : dob");
		return o1.getDob().compareTo(o2.getDob());
	}

}
