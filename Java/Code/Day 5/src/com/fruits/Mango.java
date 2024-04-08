package com.fruits;

public class Mango extends Fruits {

	public Mango(double weight) {
		super(weight);
		setColor("Yellow");
		setName("Mango");
		
		}
	@Override
	public String taste() {
		return "Sweet";
	}
	public void pulp() {
		System.out.println("Name of Fruit: "+ getName()+" Color: "+getColor()+" :: Creating Pulp");

	}
}
