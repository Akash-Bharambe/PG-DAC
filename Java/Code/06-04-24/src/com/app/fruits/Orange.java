package com.app.fruits;

public class Orange extends Fruits{
	public Orange(double weight) {
		super("Orange", weight, "Orange");
	}
	
	public String taste() {
		return "Sour";
	}
	
	public String juice() {
		return "Creating Juice of " + getColor() + " " + getName();
	}
}
