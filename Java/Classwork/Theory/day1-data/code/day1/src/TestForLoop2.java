import java.util.Scanner;
class TestForLoop2 {
	public static void main(String[] args)
	{
		 //create Scanner class instance to wrap std i/p stream
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter range");
				int begin=sc.nextInt();
				int end=sc.nextInt();
				System.out.println("Odd nums in the range");
				for(int i=begin;i<=end;i++) {
					if(isOdd(i))
						System.out.print(i+" ");
				}
						
		 sc.close();
	}
	//add a static method to check if no is odd
	//number=i
	private static boolean isOdd(int number)
	{
		 if(number % 2 != 0)
			 return true;
		 return false;
	}
}