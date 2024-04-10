package exception_handling;

//To test un checked exc.
public class Test4 {

	public static void main(String[] args) {
		try {
			System.out.println("parsed int : " + Integer.parseInt("1234"));
			String[] names = { "abc", "xyz" };
			System.out.println(names[2]);
			int a = 100;
			int b = 10;
			System.out.println("res " + (a / b));
			String s=null;
			System.out.println(s.charAt(0));
			System.out.println("end of try...");
		}  catch (Exception e) {
			System.out.println("in catch-all");
		//	e.printStackTrace();//name of exc , err mesg , stack trace
		//	System.out.println(e.getMessage());
			System.out.println(e);//e.toString()
		}
		System.out.println("main cntd....");

	}

}
