package exception_handling;

public class Test7 {

	public static void main(String[] args) {
		try {
			Test7 ref=new Test7();			
			ref.testMe("-12345");
			System.out.println("end of try in main");
		} catch (Exception e) {
			System.out.println("in main's catch-all");
			System.out.println(e);
		} finally {
			System.out.println("in main's finally");
		}
		System.out.println("main over....");

	}
	 void testMe(String s) throws InterruptedException{
		System.out.println("in testMe");
		try {
			System.out.println("Parsed int value " + Integer.parseInt(s));
			Thread.sleep(1000);
			boolean flag=true;
			if(flag)
				return;
			System.out.println("end of meth's try");
		} finally {
			System.out.println("in method's finally");
		}
		System.out.println("end of method");
		
	}

}
