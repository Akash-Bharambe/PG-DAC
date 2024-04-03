package com.cdac.tester;
import com.cdac.core.Point2D;
import java.util.Scanner;
class Tester{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter x coordinates: ");
		double x = sc.nextDouble();
		System.out.println("Enter y coordinates: ");
		double y = sc.nextDouble();
		
		Point2D p = new Point2D(x,y);
		
		System.out.println("Enter x coordinates: ");
		double x1 = sc.nextDouble();
		System.out.println("Enter y coordinates: ");
		double y1 = sc.nextDouble();
		
		Point2D p1 = new Point2D(x1,y1);
		
		System.out.println(p.show());
		System.out.println(p1.show());
		
		if(p.isEqual(p1)) System.out.println("Equal");
		else System.out.println("Not Equal");
		
		System.out.println("Distance :"+ p.calculateDistance(p1));
	}
}