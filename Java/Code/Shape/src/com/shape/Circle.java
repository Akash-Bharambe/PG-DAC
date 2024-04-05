package com.shape;

public class Circle extends Shape {

	private double radius;

	@Override
	public void calculateArea() {
		this.setArea(Math.PI * Math.pow(radius, 2));
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

}
