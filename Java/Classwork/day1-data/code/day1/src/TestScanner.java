import java.util.Scanner;
class TestScanner {
	public static void main(String[] args)
	{
		 //create Scanner class instance to wrap std i/p stream
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter 2 doubles");
		 double d1=sc.nextDouble();
		 double d2=sc.nextDouble();
		 System.out.println("Div "+(d1/d2));		 
		 sc.close();
	}
}