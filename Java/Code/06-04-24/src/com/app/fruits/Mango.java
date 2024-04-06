package com.app.fruits;

public class Mango extends Fruits{

	public Mango(double weight) {
		super("Yellow", weight, "Mango");
	}
	
	public String taste() {
		return "Sweet";
	}
	
	public String pulp() {
		return "Creating Pulp of " + getColor() + " " + getName();
	}
}
