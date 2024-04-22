package runnable_tasks;

import com.app.banking.JointAccount;

public class BalanceCheckerTask implements Runnable {
	// state
	private JointAccount jointAcct;

	public BalanceCheckerTask(JointAccount acct) {
		this.jointAcct = acct;
		System.out.println("ctor invoked by " + Thread.currentThread().getName());
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " strted");
		try {
			while (true) {
				double curntBalance = jointAcct.checkBalance();
				if (curntBalance == 10000) {
					System.out.println("curnt bal "+curntBalance);
					Thread.sleep(73);
				} else {
					System.out.println("ERROR!!!!!!!!!!!!!!!");
					System.exit(-1);
				}
			}
		} catch (Exception e) {
			System.out.println("err in thrd " + Thread.currentThread().getName() + "  err " + e);
		}
		System.out.println(Thread.currentThread().getName() + " over");

	}

}
