import java.util.Scanner;
class TestForLoop {
	public static void main(String[] args)
	{
		 //create Scanner class instance to wrap std i/p stream
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter range");
				int begin=sc.nextInt();
				int end=sc.nextInt();
				System.out.println("Odd nums in the range");
				for(int i=begin;i<=end;i++) {
					if(i % 2 != 0)
						System.out.print(i+" ");
				}
						
		 sc.close();
	}
}