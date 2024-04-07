package com.core.shapes;

public class Rectangle extends BoundedShape {
	private double length;
	private double breadth;

	public Rectangle(int x, int y, double length, double breadth) {
		super(x, y);
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public String toString() {
		return "Rectangle " + super.toString() + " len" + length + " breadth " + breadth;
	}
	@Override
	public double computeArea() {
		return length*breadth;
	}

}
