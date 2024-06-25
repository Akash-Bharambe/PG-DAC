package day5.multiply;

public class Multiply {

	public static int multiply(int num1, int num2) {

		if (num1 == 0 || num2 == 0)
			return 0;

		int i = mult(Math.abs(num1), Math.abs(num2));

		int sign1 = (num1 < 0) ? -1 : 1;
		int sign2 = (num2 < 0) ? -1 : 1;

		return ((sign1 == -1 || sign2 == -1) && sign1 != sign2) ? 1 - i - 1 : i;
	}

	public static int mult(int num1, int num2) {
		if (num1 < num2) {
			int temp = num1;
			num1 = num2;
			num2 = temp;
		}

		if (num2 == 1)
			return num1;
		return num1 + mult(num1, num2 - 1);
	}

	public static void main(String[] args) {
		System.out.println(multiply(-10, -11));

	}

}
