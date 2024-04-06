package com.app.fruits;

public abstract class Fruits {
	private String color;
	private double weight;
	private String name;
	private boolean fresh;

	public Fruits() {
		this.fresh = true;
	}
	
	protected Fruits(String color, double weight, String name) {
		this();
		this.color = color;
		this.weight = weight;
		this.name = name;
	}
	
	public String getColor() {
		return color;
	}

	public double getWeight() {
		return weight;
	}

	public String getName() {
		return name;
	}

	public boolean isFresh() {
		return fresh;
	}

	public void setFresh(boolean fresh) {
		this.fresh = fresh;
	}
	
	public abstract String taste();
	
	@Override
	public String toString() {
		return "Fruits [color=" + color + ", weight=" + weight + ", name=" + name + "]\n";
	}

}
