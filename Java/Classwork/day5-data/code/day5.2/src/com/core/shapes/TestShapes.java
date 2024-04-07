package com.core.shapes;

public class TestShapes {

	public static void main(String[] args) {
		// create circle1(20,30,12.5), rect1() , 
		//circle2(60,30,10.5), rect2(24,42,8.5,3.5) 
		//create abive rquirement in single java statement 
		//Hint : dynamic initialization 20,40,10,3.5of array
		//This approach : for testing purpose ONLY
		BoundedShape[] shapes = /* new BoundedShape[] */
			{new Circle(20,30,12.5),
				new Rectangle(20,40,10,3.5),
				new Circle(60,30,10.5),
				new Rectangle(24,42,8.5,3.5)				
		};		
		//Display state info n it's area from single for-each loop
		for(BoundedShape s : shapes)//s=shapes[0]
		{
			System.out.println(s);
			System.out.println("Area "+s.computeArea());
		}

	}

}
