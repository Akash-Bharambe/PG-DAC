package watch;

import java.time.LocalDate;

public class Watch {
	private static int idCnt;
	private int id;
	private CategoryType category;
	private String brand;
	private ShapeType shape;
	private StyleType style;
	private BandMaterialType band;
	private int stock;
	private LocalDate stockListingDate;
	private LocalDate stockUpdateDate;
	private double price;
	private double discount;

	static {
		idCnt = 1;
	}

	public Watch(CategoryType category, String brand, ShapeType shape, StyleType style, BandMaterialType band,
			int stock, LocalDate stockListingDate, LocalDate stockUpdateDate, double price) {
		super();
		this.id = idCnt;
		this.category = category;
		this.brand = brand;
		this.shape = shape;
		this.style = style;
		this.band = band;
		this.stock = stock;
		this.stockListingDate = stockListingDate;
		this.stockUpdateDate = stockUpdateDate;
		this.price = price;
		this.discount = 0;
		idCnt++;
	}

	public Watch(int id) {
		super();
		this.id = id;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public LocalDate getStockUpdateDate() {
		return stockUpdateDate;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
		this.price = (this.price * this.discount) / 100;
	}

	public LocalDate getStockListingDate() {
		return stockListingDate;
	}

	public void setStockUpdateDate(LocalDate stockUpdateDate) {
		this.stockUpdateDate = stockUpdateDate;
	}

	@Override
	public String toString() {
		return String.format(
				"[id=%-2d %6s %-10s %-9s %-7s %-15s, stock=%-3d, ListingDate=%-10s, UpdateDate=%-10s, price=%-6.2f, discount=%-6.2f]",
				id, category, brand, shape, style, band, stock, stockListingDate, stockUpdateDate, price, discount);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Watch) {
			Watch other = (Watch) obj;
			return other.id == this.id;
		}
		return false;
	}

}
