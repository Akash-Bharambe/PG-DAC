package com.fruits;

public class Apple extends Fruits {
	public Apple(double weight) {
		super(weight);
		setColor("Red");
		setName("Apple");
		
		}
	@Override
	public String taste() {
		return "Sweet and Sour";
	}
	public void jam() {
		System.out.println("Name of Fruit: "+ getName()+" Color: "+getColor()+":: Making Jam!");

	}
}
