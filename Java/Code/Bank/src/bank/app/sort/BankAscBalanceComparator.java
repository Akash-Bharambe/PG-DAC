package bank.app.sort;

import java.util.Comparator;

import bank.app.Bank.BankApplication;

public class BankAscBalanceComparator implements Comparator<BankApplication>{

	@Override
	public int compare(BankApplication o1, BankApplication o2) {
		return (int) (o1.getBalance() - o1.getBalance());
	}

}
