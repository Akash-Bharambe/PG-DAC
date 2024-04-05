package program;

import java.util.Scanner;

import com.shape.*;

public class ShapeTest {

	private static Scanner sc = new Scanner(System.in);
	private Shape shape;
	static ShapeType menulist() {
		System.out.println("0. EXIT");
		System.out.println("1. RECTANGLE");
		System.out.println("2. CIRCLE");
		System.out.print("Enter Choice: ");
		return ShapeType.values()[sc.nextInt()];
	}
	
	public void setShape(Shape shape) {
		this.shape = shape;
	}
	public void printRecord() {
		System.out.println("Area: "+ shape.getArea());
	}
	
	public void acceptRecord() {
		if (this.shape != null) {
			if (this.shape instanceof Rectangle) {
				Rectangle rect = (Rectangle) this.shape;
				System.out.print("Enter Length: ");
				rect.setLength(sc.nextDouble());
				System.out.print("Enter Breadth: ");
				rect.setBreadth(sc.nextDouble());
			}
			else if(this.shape instanceof Circle) {
				Circle circle = (Circle) this.shape;
				System.out.print("Enter Radius: ");
				circle.setRadius(sc.nextDouble());
			}
			shape.calculateArea();
		}
	}
}
