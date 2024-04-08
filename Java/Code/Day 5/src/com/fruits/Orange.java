package com.fruits;

public class Orange extends Fruits {
	public Orange(double weight) {
		super(weight);
		setColor("Orange");
		setName("Orange");
		
		}
	@Override
	public String taste() {
		return "Sour";
	}
	public void juice() {
		System.out.println("Name of Fruit: "+ getName()+" Color: "+getColor()+" :: Extracting Juice");
	}
}
