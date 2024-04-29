package core;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

/**
 * Represents a stock with its attributes such as ID, name, company name, price,
 * closing date, and quantity.
 */
public class Stock implements Serializable {
	private static final long serialVersionUID = 6523976122936806769L;

	private String stockID; // Unique identifier for the stock
	private String stockName; // Name of the stock
	private String companyName; // Name of the company
	private double price; // Current price of the stock
	private LocalDate closingDate; // Date when the stock market closed
	private int quantity; // Number of stocks

	/**
	 * Constructs a new Stock object with the specified attributes.
	 * 
	 * @param stockID     The unique identifier for the stock.
	 * @param stockName   The name of the stock.
	 * @param companyName The name of the company.
	 * @param price       The current price of the stock.
	 * @param closingDate The date when the stock market closed.
	 * @param quantity    The number of stocks.
	 */
	public Stock(String stockID, String stockName, String companyName, double price, LocalDate closingDate,
			int quantity) {
		super();
		this.stockID = stockID;
		this.stockName = stockName;
		this.companyName = companyName;
		this.price = price;
		this.closingDate = closingDate;
		this.quantity = quantity;
	}

	/**
	 * Gets the quantity of the stock.
	 * 
	 * @return The quantity of the stock.
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * Sets the quantity of the stock.
	 * 
	 * @param quantity The new quantity of the stock.
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	/**
	 * Gets the stock ID.
	 * 
	 * @return The stock ID.
	 */
	public String getStockID() {
		return stockID;
	}

	/**
	 * Gets the company name.
	 * 
	 * @return The company name.
	 */
	public String getCompanyName() {
		return companyName;
	}

	/**
	 * Returns a string representation of the stock.
	 * 
	 * @return A string representation of the stock.
	 */
	@Override
	public String toString() {
		return "Stock [stockID=" + stockID + ", stockName=" + stockName + ", companyName=" + companyName + ", price="
				+ price + ", closingDate=" + closingDate + ", quantity=" + quantity + "]";
	}

	/**
	 * Returns the hash code of the stock based on its ID.
	 * 
	 * @return The hash code of the stock.
	 */
	@Override
	public int hashCode() {
		return Objects.hash(stockID);
	}

	/**
	 * Checks if this stock is equal to another object.
	 * 
	 * @param obj The object to compare with this stock.
	 * @return True if the stocks are equal, false otherwise.
	 */
	@Override
	public boolean equals(Object obj) {
		Stock stock = null;
		if (obj instanceof Stock)
			stock = (Stock) obj;
		return this.stockID.equals(stock.stockID);
	}

}
