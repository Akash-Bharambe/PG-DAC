import java.util.Scanner;
class TestIfElse {
	public static void main(String[] args)
	{
		 //create Scanner class instance to wrap std i/p stream
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter 2 ints");
		int number1=sc.nextInt();
		int number2=sc.nextInt();
		if(number1<number2)
			System.out.println(number1+"<"+number2);
		else if (number1>number2)
			System.out.println(number1+">"+number2);
		else 
			System.out.println("nos are same !");		
		 sc.close();
	}
}