package arrays;

import java.util.Scanner;

/*
 * Objective - Accept no of data samples(of type double) from User(using scanner)
Create suitable array & display it using for-loop , to confirm default values.

Accept data from User(scanner) & store it in the array.
Display array data using  for loop.
 */

public class TestPrimitiveArray {

	public static void main(String[] args) {
		// create scanner instance
		Scanner sc = new Scanner(System.in);
		System.out.println("class loaded for scanner "+sc.getClass());//java.util.Scanner
		System.out.println("Enter array length");
		double[] myArray = new double[sc.nextInt()];
		//print name of the class for this array
		System.out.println("class loaded for the array "+myArray.getClass());// [D
		// print array contents : def values
		System.out.println("Def array contents : ");
		for (int i = 0; i < myArray.length; i++)
			System.out.print(myArray[i] + " ");
		// accept array data
		for (int i = 0; i < myArray.length; i++) {
			System.out.println("Enter array data");
			myArray[i] = sc.nextDouble();
		}
		// print array contents : def values
		System.out.println("Initialized array contents : ");
		for (int i = 0; i < myArray.length; i++)
			System.out.print(myArray[i] + " ");
		System.out.println();
		//display array content using for-each loop
		//10 20 30 40
		for(double d1 : myArray)//d1=myArray[0] .....d1=myArray[myArray.length-1]
		{
			d1 *=2;//copy is doubled !
		}
		System.out.println("array contents via for-each");
		for(double d : myArray)
		 System.out.print(d+" ");
		
		sc.close();
	}

}
