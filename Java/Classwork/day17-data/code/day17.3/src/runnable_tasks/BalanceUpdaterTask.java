package runnable_tasks;

import com.app.banking.JointAccount;

public class BalanceUpdaterTask implements Runnable {
	// state
	private JointAccount jointAcct;

	public BalanceUpdaterTask(JointAccount acct) {
		this.jointAcct = acct;
		System.out.println("ctor invoked by " + Thread.currentThread().getName());
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " strted");
		try {
			while (true) {
				jointAcct.updateBalance(5000);
				Thread.sleep(45);
			}
		} catch (Exception e) {
			System.out.println("err in thrd " + Thread.currentThread().getName() + "  err " + e);
		}
		System.out.println(Thread.currentThread().getName() + " over");

	}

}
