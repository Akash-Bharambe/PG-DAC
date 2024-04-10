package exception_handling;

//To test un checked exc.
public class Test1 {

	public static void main(String[] args) {
		try {
			System.out.println("parsed int : " + Integer.parseInt("1234"));
			String[] names = { "abc", "xyz" };
			System.out.println(names[0]);
			int a = 100;
			int b = 10;
			System.out.println("res " + (a / b));
			String s=null;
			System.out.println(s.charAt(0));
			System.out.println("end of try...");
		} catch (NumberFormatException e) {
			System.out.println("1");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("2");
		} catch (ArithmeticException | NullPointerException e) {
			System.out.println("3");
		} catch (Exception e) {
			System.out.println("in catch-all");
		}
		System.out.println("main cntd....");

	}

}
