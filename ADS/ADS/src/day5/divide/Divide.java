package day5.divide;

public class Divide {

	public static int divide(int num1, int num2) {

		if (num1 == 1 || num2 == 1)
			return num1 == 1 ? num2 : num1;

		int quotient = 0;
		if (num1 > num2) {
			quotient = quotient(num1, num2);
		}			
		
		return quotient;
	}

	public static int quotient(int num1, int num2) {
		int quotient = 1;
		if (num1 < num2) {
			return 0;
		}
		
		return quotient + quotient(num1 - num2, num2);
	}

	public static int remainder(int num1, int num2) {
		if (num1 < num2) {
			return num1;
		}
		return remainder(num1 - num2, num2);
	}

	public static void main(String[] args) {
		System.out.println("Quotient: "+divide(10, 3)+" Remainder: "+ remainder(10, 3));

	}

}
