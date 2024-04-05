package com.shape;

public abstract class Shape {
	private double area;

	public Shape() {
	}

	public abstract void calculateArea();

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

}
