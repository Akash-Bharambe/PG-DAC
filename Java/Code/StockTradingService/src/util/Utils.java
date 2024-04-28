package util;

import static core.ValidationRules.validateClosingDate;
import static core.ValidationRules.validateStockID;

import java.time.LocalDate;
import java.util.Map;
import java.util.Scanner;

import core.Stock;
import core.exception.StocksException;

public class Utils {
	private static Scanner scanner = new Scanner(System.in);

	public static int menuList() {
		System.out.println("1. Add new Stock");
		System.out.println("2. Search Stocks by Company");
		System.out.println("3. Purchase Stocks");
		System.out.println("4. Sell Stocks");
		System.out.println("0. Save and EXIT");
		System.out.print("Enter Choice: ");
		int ch = scanner.nextInt();
		scanner.nextLine();
		return ch;
	}

	public static void addNewStock(Map<String, Stock> stocks) {

		System.out.println("Enter stock id: ");
		String stockID = scanner.nextLine();
		validateStockID(stockID, stocks);

		System.out.println("Enter Stock Name: ");
		String stockName = scanner.nextLine();

		System.out.println("Enter Company Name: ");
		String companyName = scanner.nextLine();

		System.out.println("Enter Price: ");
		double price = scanner.nextDouble();

		System.out.println("Enter Closing Date: ");
		String date = scanner.nextLine();

		System.out.println("Enter Stocks Quantity: ");
		int quantity = scanner.nextInt();
		scanner.nextLine();

		LocalDate closingDate = validateClosingDate(date);
		stocks.put(stockID, new Stock(stockID, stockName, companyName, price, closingDate, quantity));
	}

	public static void searchStock(Map<String, Stock> stocks) {
		System.out.println("Enter Company Name: ");
		String companyName = scanner.nextLine();

		stocks.values().stream().filter(s -> s.getCompanyName().equals(companyName)).forEach(Stock::toString);
	}

	public static void purchaseStocks(Map<String, Stock> stocks) {
		System.out.println("Enter stock id: ");
		String stockID = scanner.nextLine();

		if (!stocks.containsKey(stockID))
			throw new StocksException("Invalid Stock ID...!!!\n");

		System.out.println("Enter Stocks Quantity: ");
		int quantity = scanner.nextInt();
		scanner.nextLine();

		Stock stock = stocks.get(stockID);

		if (stock.getQuantity() < quantity)
			throw new StocksException("Only " + stock.getQuantity() + " stock are available...!!!\n");

		stock.setQuantity(quantity);

		System.out.println(quantity + " stocks purchased Successfully...!!!\n");
	}

	public static void sellStocks(Map<String, Stock> stocks) {

		System.out.println("Enter stock id: ");
		String stockID = scanner.nextLine();

		if (!stocks.containsKey(stockID))
			throw new StocksException("Invalid Stock ID...!!!\n");

		System.out.println("Enter Stocks Quantity: ");
		int quantity = scanner.nextInt();
		scanner.nextLine();

		Stock stock = stocks.get(stockID);
		int availableStocks = stock.getQuantity();
		if (availableStocks < quantity)
			throw new StocksException("Only " + availableStocks + " stock are available...!!!\n");

		stock.setQuantity(availableStocks - quantity);

		System.out.println(quantity + " stocks sold Successfully...!!!\n");
	}

}
