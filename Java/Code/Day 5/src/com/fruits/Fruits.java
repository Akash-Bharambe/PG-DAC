package com.fruits;

public abstract class Fruits {
	private double weight;
	private String name,color;
	private boolean fresh;
	
	/**
	 * @param weight
	 * @param name
	 * @param color
	 */
	public Fruits(double weight) {
		this.weight = weight;
		name = " ";
		color = " ";
		fresh=true;
	}
	public boolean getFresh() {
		return fresh;
	}
	public void setFresh(boolean fresh) {
		this.fresh = fresh;
	}
	public double getWeight() {
		return weight;
	}
	public String getName() {
		return name;
	}
	public String getColor() {
		return color;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
@Override
	public String toString() {
		return "Fruits in Basket weight=" + weight + ", name=" + name + ", color=" + color+ " taste=" +" ";
	}
public abstract String taste();
}
