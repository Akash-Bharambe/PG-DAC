package threads1;

public class MyClass extends Thread {
	public MyClass(String name)
	{
		super(name);
	}
	// MUST override inherited BLANK run() method
	/*
	 * Overriding form of the method -- CAN NOT add any NEW Checked excs
	 */
	@Override
	public void run() /* throws InterruptedException */ {
		System.out.println(getName() + " strted");
		try {
			// B.L -- for loop
			for (int i = 0; i < 20; i++) {
				System.out.println(getName() + " exec counter " + i);
				Thread.sleep(500);
			}
		} catch (Exception e) {
			System.out.println(getName() + " got exc " + e);
		}
		System.out.println(getName() + " over");
	}
}
