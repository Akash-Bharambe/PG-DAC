import java.util.Scanner;

public class DoubleChecker{

public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter 2 Double Values: ");
	if(sc.hasNextDouble()){
		double d1 = sc.nextDouble();
		if(sc.hasNextDouble()){
			double d2 = sc.nextDouble();
			System.out.println("Average: "+ (d1 + d2)/2);
		}
	}
	else
		System.out.println("Please Enter DOuble Value!!! Terminating Program!!!");
	sc.close();
}
}