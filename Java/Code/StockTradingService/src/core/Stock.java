package core;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class Stock implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6523976122936806769L;
	private String stockID;
	private String stockName;
	private String companyName;
	private double price;
	private LocalDate closingDate;
	private int quantity;

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

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getStockID() {
		return stockID;
	}

	public String getCompanyName() {
		return companyName;
	}

	@Override
	public String toString() {
		return "Stock [stockID=" + stockID + ", stockName=" + stockName + ", companyName=" + companyName + ", price="
				+ price + ", closingDate=" + closingDate + ", quantity=" + quantity + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(stockID);
	}

	@Override
	public boolean equals(Object obj) {
		Stock stock = null;
		if (obj instanceof Stock)
			stock = (Stock) obj;
		return this.stockID.equals(stock.stockID);
	}

}
