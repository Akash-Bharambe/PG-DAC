package core;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class Item implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5334127063585624746L;
	private String itemCode;
	private String description;
	private double price;
	private LocalDate date;
	
	public Item(String itemCode, String description, double price, LocalDate date) {
		super();
		this.itemCode = itemCode;
		this.description = description;
		this.price = price;
		this.date = date;
	}

	public double getPrice() {
		return price;
	}

	public String getItemCode() {
		return itemCode;
	}

	@Override
	public String toString() {
		return "Item [itemCode=" + itemCode + ", description=" + description + ", price=" + price + ", date=" + date
				+ "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(itemCode);
	}

	@Override
	public boolean equals(Object obj) {
		Item item = null;
		if (obj instanceof Item)
			item = (Item) obj;
		return this.itemCode.equals(item.itemCode);
	}
	
	
}
