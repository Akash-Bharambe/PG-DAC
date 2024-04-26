package tester;

import java.io.IOException;
import java.util.List;

import com.app.BankStatement;
import com.io.IOUtils;

public class Program {

	public static void main(String[] args){
		List<BankStatement> statements= null;
		try {
			statements = IOUtils.readStatements();
		} catch (IOException e) {
			e.printStackTrace();
		}
		double sumOfDeposits = statements.stream().mapToDouble(s-> s.getDepositAmount()).sum();
		double maxDeposit = statements.stream().mapToDouble(s-> s.getDepositAmount()).max().orElseThrow();
		double shoppingExpenses = statements.stream().filter(s->s.getNarration().equals("Shopping")).mapToDouble(s->s.getWithdrawalAmount()).sum();
		
		double maxWithdrawn = statements.stream().mapToDouble(s-> s.getWithdrawalAmount()).max().orElseThrow();
		
		System.out.println("Sum of all deposits: "+ sumOfDeposits);
		System.out.println("Max deposit amount: "+ maxDeposit);
		System.out.println("Shopping expenses: "+ shoppingExpenses);
		System.out.print("Date on which max amount withdrawn: ");
		statements.stream().filter(s-> s.getWithdrawalAmount() == maxWithdrawn).map(s-> s.getTransactionDate()).forEach(s-> System.out.println(s));
	}

}
