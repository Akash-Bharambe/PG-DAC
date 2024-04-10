package exception_handling;

public class Test2 {

	public static void main(String[] args) {
		System.out.println("Before sleep");
		try {
			// dly 5sec
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			System.out.println("in IE....");
		}
		System.out.println("After sleep");

	}

}
