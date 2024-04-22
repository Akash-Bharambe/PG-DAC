package threads5;

public class MyClass implements Runnable {
	
	// MUST implement inherited BLANK run() method
	/*
	 *Implementing  form of the method -- CAN NOT add any NEW Checked excs
	 */
	@Override
	public void run() /* throws InterruptedException */ {
		System.out.println(Thread.currentThread().getName() + " strted");
		try {
			// B.L -- for loop
			for (int i = 0; i < 10; i++) {
				System.out.println(Thread.currentThread().getName() + " exec counter " + i);
				if(Thread.currentThread().getName().equals("two"))
				{
					System.out.println("Enter data");
					int data=System.in.read();
					System.out.println("You entered "+data);
				}
				Thread.sleep(500);
			}
		} catch (Exception e) {
			System.out.println(Thread.currentThread().getName() + " got exc " + e);
		}
		System.out.println(Thread.currentThread().getName() + " over");
	}
}
