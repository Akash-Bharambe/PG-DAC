package app.Bank;

public enum AccountType {
	SAVINGS(1000),CURRENT(10000),FD(50000),DMAT(15000);

	private int minBalance;
	AccountType(int minBalance) {
		this.minBalance = minBalance;
	}
	
	public int getMinBalance() {
		return minBalance;
	}
	
	@Override
	public String toString() {
		return name() +" : "+ minBalance;
	}
	
}
