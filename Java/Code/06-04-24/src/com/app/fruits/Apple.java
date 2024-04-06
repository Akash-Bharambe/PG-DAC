package com.app.fruits;

public class Apple extends Fruits{
	
	public Apple(double weight) {
		super("Red", weight, "Apple");
	}
	
	public String taste() {
		return "Sweet and Sour";
	}
	
	public String jam() {
		return "Creating Jam of " + getColor() + " " + getName();
	}
}
