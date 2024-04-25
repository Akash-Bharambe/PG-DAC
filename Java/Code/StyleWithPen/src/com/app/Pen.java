package com.app;

import java.time.LocalDate;

/**
 * 1. 1. Add new Pen i/p : Brand ,Color,InkColor,Material ,Stock,Stock Listing
 * Date (Stock Update Date will be same as listing date while adding a pen) ,
 * price . You can skip the discount while adding a pen : default value 0.0
 * 
 * 2. Update stock of aPen i/p : brand | material | color | Ink color and new
 * quantity
 * 
 * 3.Set discount of 20% for all the pens which are not at all sold in last 3
 * months In this you can set the discount value for all such pens OR apply
 * discount n update price as well
 * 
 * 4. Remove Pens which are never sold once listed in 9 months
 * 
 * You can define a class Pen with the following fields � a. ID (unique
 * identifier for each Pen, should be generated automatically) b. Brand
 * (Example: Cello, Parker, Reynolds etc.) c. Color d. InkColor e. Material
 * (Example: Plastic, Alloy Steel, Metal etc.) f. Stock (Available quantity) g.
 * Stock Update Date (it changed every time when admin update stock or user
 * order executed) h. Stock Listing Date (date on which product is added to site
 * for sale) i. Price (in INR) j. Discounts (in percentage)
 * 
 * Note: You can use java collection to store items in memory.
 */

public class Pen {
	private String brand;
	private String color;
	private PenMaterialType material;
	private int stock;
	private LocalDate stockListingDate;
	private LocalDate stockUpdateDate;
	private int price;
	private double discount;

	public Pen(String brand, String color, PenMaterialType material, int stock, LocalDate stockListingDate, int price) {
		super();
		this.brand = brand;
		this.color = color;
		this.material = material;
		this.stock = stock;
		this.stockListingDate = stockListingDate;
		this.stockUpdateDate = stockListingDate;
		this.price = price;
		this.discount = 0;
	}

	public Pen(String brand, String color, PenMaterialType material) {
		super();
		this.brand = brand;
		this.color = color;
		this.material = material;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public PenMaterialType getMaterial() {
		return material;
	}

	public void setMaterial(PenMaterialType material) {
		this.material = material;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public LocalDate getStockListingDate() {
		return stockListingDate;
	}

	public void setStockListingDate(LocalDate stockListingDate) {
		this.stockListingDate = stockListingDate;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getDiscount() {
		return price - (price * discount);
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public LocalDate getStockUpdateDate() {
		return stockUpdateDate;
	}

	public void setStockUpdateDate(LocalDate stockUpdateDate) {
		this.stockUpdateDate = stockUpdateDate;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Pen) {
			Pen pen = (Pen) obj;
			return this.brand.equals(pen.brand) && this.color.equals(pen.color) && this.material.equals(pen.material);
		}
		return false;
	}

	@Override
	public String toString() {
		return "Pen [brand=" + brand + ", color=" + color + ", material=" + material + ", stock=" + stock
				+ ", stockListingDate=" + stockListingDate + ", price=" + price + ", discounted Price="
				+ this.getDiscount() + "]";
	}

}
