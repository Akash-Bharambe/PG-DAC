package com.core.shapes;

public abstract class BoundedShape /* extends Object */{
	private int x, y;

	public BoundedShape(int x, int y) {
	//	 super();
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return x + " " + y;
	}
	// since ANY bounded shape : can compute area , adding the common func here
	public abstract double computeArea();
//	{
//		return -1;
//	}
}
