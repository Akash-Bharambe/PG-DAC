package com.core;

import java.time.LocalDateTime;

public class Grocery {
	private String name;
	private double price;
	private int quantity;
	private LocalDateTime stockUpDateTime;

	public Grocery(String name, int quantity, double price, LocalDateTime stockUpDateTime) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.stockUpDateTime = stockUpDateTime;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public LocalDateTime getStockUpDateTime() {
		return stockUpDateTime;
	}

	public void setStockUpDateTime(LocalDateTime stockUpDateTime) {
		this.stockUpDateTime = stockUpDateTime;
	}

	public String display() {
		return "Grocery [name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
	}

	@Override
	public String toString() {
		return "Grocery [name=" + name + ", price=" + price + ", quantity=" + quantity + ", stockUpDateTime="
				+ stockUpDateTime + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Grocery) {
			Grocery grocery = (Grocery) obj;
			return grocery.name.equals(this.name);
		}
		return false;
	}

}
