package com.shape;

public class Rectangle extends Shape {

	private double length;
	private double breadth;

	@Override
	public void calculateArea() {
		this.setArea(this.length * this.breadth);
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getBreadth() {
		return breadth;
	}

	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}

}
