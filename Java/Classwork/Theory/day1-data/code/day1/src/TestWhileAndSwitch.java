import java.util.Scanner;
//accept month from user n print the season
class TestWhileAndSwitch {
	public static void main(String[] args)
	{
		 //create Scanner class instance to wrap std i/p stream
		 Scanner sc=new Scanner(System.in);
		 boolean exit=false;
		 int data;
		  System.out.println(data);
		 while(!exit) {
			  System.out.println("Enter month no 1-12");
			  switch(sc.nextInt()) {
				   case 11 :
				   case 12 :
				   case 1 :
				   case 2 : System.out.println("Season : Winter");
				   break;
				   case 3 :
				   case 4 :
				   case 5 :
				   case 6 : System.out.println("Season : Summer ");
				   break;
				   case 7 :
				   case 8 :
				   case 9 :
				   case 10 : System.out.println("Season : Monsoon");
				   break;
				   default : 
				   System.out.println("Invalid Month !!!!, Terminating the app!!!!!");
				   exit=true;
				   break;
			  }
		 }
					//close scanner 	
		 sc.close();
	}
	
}