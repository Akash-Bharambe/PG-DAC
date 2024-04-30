package com.core;

import java.time.LocalDate;
import java.util.Random;

/**
 * Shoe class to represent a shoe instance
 * 
 * This class is for maintaining a specific type of Shoe
 */
public class Shoe {
	private int ShoeID; // Unique ID of shoe
	@SuppressWarnings("unused")
	private CategoryType category; // Category to which this shoe belongs
	private LocalDate listingDate; // The date on which this shoe was listed
	private int stockSize; // The available quantity of shoes
	private LocalDate stockUpdateDate; // The date on which shoes quantity was updated
	private double price; // Price of this shoe
	private double discount; // Discount on this shoe
	private static Random random;

	static {
		random = new Random();
	}

	/**
	 * This is parameterized Constructor to initialize a shoe instance (FOR TESTING
	 * PURPOSE ONLY)
	 * 
	 * @param shoeID 		Unique ID of shoe
	 * @param category 		Category to which this shoe belongs
	 * @param listingDate	The date on which this shoe was listed
	 * @param stockSize 	The available quantity of shoes
	 * @param stockUpdateDate	The date on which shoes quantity was updated
	 * @param price			Price of this shoe
	 * @param discount		Discount on this shoe
	 */
	public Shoe(int shoeID, CategoryType category, LocalDate listingDate, int stockSize, LocalDate stockUpdateDate,
			double price, double discount) {
		super();
		ShoeID = shoeID;
		this.category = category;
		this.listingDate = listingDate;
		this.stockSize = stockSize;
		this.stockUpdateDate = stockUpdateDate;
		this.discount = discount;
		this.price = price - (price * discount);
	}
	
	/**
	 * This is parameterized Constructor to initialize a shoe instance
	 * 
	 * @param shoeID 		Unique ID of shoe
	 * @param category 		Category to which this shoe belongs
	 * @param listingDate	The date on which this shoe was listed
	 * @param stockSize 	The available quantity of shoes
	 * @param stockUpdateDate	The date on which shoes quantity was updated
	 * @param price			Price of this shoe
	 * @param discount		Discount on this shoe
	 */
	public Shoe(CategoryType category, LocalDate listingDate, int stockSize, LocalDate stockUpdateDate, double price,
			double discount) {
		ShoeID = random.nextInt(9000) + 1000;
		this.category = category;
		this.listingDate = listingDate;
		this.stockSize = stockSize;
		this.stockUpdateDate = stockUpdateDate;
		this.price = price;
		this.discount = discount;
	}

	/**
	 * Gets listing date
	 * 
	 * @return listing date of the shoe
	 */
	public LocalDate getListingDate() {
		return listingDate;
	}
	/**
	 * Gets stock size of shoe
	 * 
	 * @return the stock size of the shoe
	 */
	public int getStockSize() {
		return stockSize;
	}

	/**
	 * Sets the stock size of the shoe
	 * 
	 * @param stockSize stock size to be updated
	 */
	public void setStockSize(int stockSize) {
		this.stockSize = stockSize;
	}
	/**
	 * Gets last date at which stock was updated
	 * 
	 * @return last date at which stock was updated
	 */
	public LocalDate getStockUpdateDate() {
		return stockUpdateDate;
	}

	/**
	 * Sets date on which stock was updated
	 * 
	 * @param stockUpdateDate New stock Update Date
	 */
	public void setStockUpdateDate(LocalDate stockUpdateDate) {
		this.stockUpdateDate = stockUpdateDate;
	}

	/**
	 * Gets Discount offered on this shoe
	 * 
	 * @return Discount offered on this shoe
	 */
	public double getDiscount() {
		return discount;
	}

	/**
	 * Gets the price after calculating discount
	 * 
	 * @return the price after discount is calculated
	 */
	public double getDiscountedPrice() {
		return price - (price * discount);
	}

	/**
	 * Sets discount for this shoe
	 * 
	 * @param discount New discount to be offered
	 */
	public void setDiscount(double discount) {
		this.discount = discount;
	}

	/**
	 * Overriden method of Object Class to return shoe details
	 */
	@Override
	public String toString() {
		return "Shoe [ShoeID=" + ShoeID + ", listingDate=" + listingDate + ", stockSize=" + stockSize
				+ ", stockUpdateDate=" + stockUpdateDate + ", price=" + this.getDiscountedPrice() + ", discount="
				+ discount + "]";
	}

	/**
	 * Overriden method of Object Class to check if 2 shoes are same
	 * 
	 * @param Shoe object to be equated
	 * @return true if ShoeId od both shoes is same otherwise false
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Shoe) {
			Shoe shoe = (Shoe) obj;
			return shoe.ShoeID == this.ShoeID;
		}
		return false;
	}

}
