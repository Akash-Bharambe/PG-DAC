//Accept 2 numbers from user & operation to perform
//1. Add 2.Subtract 3. Multiply 4.Divide 5.Exit
//Display the result of the operation. 
//Java app must continue to run till user chooses exit option.

import java.util.Scanner;

public class Arith{

private static int menulist(Scanner sc){
	
	System.out.println("1. Add");
	System.out.println("2. Subtract");
	System.out.println("3. Multiply");
	System.out.println("4. Divide");
	System.out.println("0. Exit");
	System.out.print("Enter Choice: ");
	return sc.nextInt();
}

public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int ch;
	while( (ch = menulist(sc)) != 0){
	System.out.print("Enter first number: ");
	double a = sc.nextDouble();
	System.out.print("Enter second number: ");
	double b = sc.nextDouble();
	
		switch(ch){
			case 1:
				System.out.println("Sum: "+(a+b));
				break;
			case 2:
				System.out.println("Sub: "+(a-b));
				break;
			case 3:
				System.out.println("Mult: "+(a*b));
				break;
			case 4:
				System.out.println("Div: "+(a/b));
				break;
			case 0:
				System.exit(0);
		}
		
	}
	sc.close();
}
}