package operators;

public class Tester {
	public static void main(String[] args) {
		int a = 60;
		int b = -60;
		
		System.out.println("60  = " + Integer.toBinaryString(a));
		System.out.println("-60 = " + Integer.toBinaryString(b));

		// signed shift
		int c = a >> 1;
		System.out.println("60 >> 1  = " + Integer.toBinaryString(c));

		// unsigned shift
		c = a >>> 1;
		System.out.println("60 >>> 1 = " + Integer.toBinaryString(c));

		c = b >> 30;
		System.out.println("-60 >> 1  = " + Integer.toBinaryString(c));

		c = b >>> 30;
		System.out.println("-60 >>> 1 = " + Integer.toBinaryString(c));
	}
}