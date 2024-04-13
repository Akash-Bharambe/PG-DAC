package bank.app.sort;

import java.util.Comparator;

import bank.app.Bank.BankApplication;

public class BankAscDateDescBalanceComparator implements Comparator<BankApplication> {

	@Override
	public int compare(BankApplication o1, BankApplication o2) {

		if (o1.getDob().compareTo(o2.getDob()) == 0) {
			return (int) (o1.getBalance() - o2.getBalance());
		}
		return o1.getDob().compareTo(o2.getDob());
	}

}
