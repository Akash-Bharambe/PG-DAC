package com.cdac.core;

public class Point2D {
	private double x;
	private double y;

	public Point2D(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public String show() {
		return "x: " + x + " y: " + y + "\n";
	}

	public boolean isEqual(Point2D p) {
		return ((this.x == p.x) && (this.y == p.y));
	}

	public double calculateDistance(Point2D p) {
		return Math.sqrt((this.x - p.x) * (this.x - p.x) + (this.y - p.y) * (this.y - p.y));
	}
}