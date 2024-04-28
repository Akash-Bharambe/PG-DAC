package util;

import static core.ValidationRules.validateClosingDate;
import static core.ValidationRules.validateStockID;

import java.time.LocalDate;
import java.util.HashMap;
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
		System.out.println("5. Display All Stocks");
		System.out.println("0. Save and EXIT");
		System.out.print("Enter Choice: ");
		int ch = scanner.nextInt();
		scanner.nextLine();
		return ch;
	}

	public static void addNewStock(Map<String, Stock> stocks) {

		System.out.print("Enter stock id: ");
		String stockID = scanner.nextLine();
		validateStockID(stockID, stocks);

		System.out.print("Enter Stock Name: ");
		String stockName = scanner.nextLine();

		System.out.print("Enter Company Name: ");
		String companyName = scanner.nextLine();

		System.out.print("Enter Price: ");
		double price = scanner.nextDouble();
		scanner.nextLine();

		System.out.print("Enter Closing Date: ");
		String date = scanner.nextLine();

		LocalDate closingDate = validateClosingDate(date);

		System.out.print("Enter Stocks Quantity: ");
		int quantity = scanner.nextInt();
		scanner.nextLine();

		stocks.put(stockID, new Stock(stockID, stockName, companyName, price, closingDate, quantity));

		System.out.print("Stock added Successfully...!!!\n");
	}

	public static void searchStock(Map<String, Stock> stocks) {
		System.out.print("Enter Company Name: ");
		String companyName = scanner.nextLine();

		stocks.values().stream().filter(s -> s.getCompanyName().equalsIgnoreCase(companyName))
				.forEach(s -> System.out.println(s));
	}

	public static void purchaseStocks(Map<String, Stock> stocks) {
		System.out.print("Enter stock id: ");
		String stockID = scanner.nextLine();

		if (!stocks.containsKey(stockID))
			throw new StocksException("Invalid Stock ID...!!!\n");

		System.out.print("Enter Stocks Quantity: ");
		int quantity = scanner.nextInt();
		scanner.nextLine();

		Stock stock = stocks.get(stockID);
		int availableStocks = stock.getQuantity();

		if (availableStocks < quantity)
			throw new StocksException("Only " + availableStocks + " stock are available...!!!\n");

		stock.setQuantity(availableStocks - quantity);

		System.out.println(quantity + " stocks purchased Successfully...!!!\n");
	}

	public static void sellStocks(Map<String, Stock> stocks) {

		System.out.print("Enter stock id: ");
		String stockID = scanner.nextLine();

		if (!stocks.containsKey(stockID))
			throw new StocksException("Invalid Stock ID...!!!\n");

		System.out.print("Enter Stocks Quantity: ");
		int quantity = scanner.nextInt();
		scanner.nextLine();

		Stock stock = stocks.get(stockID);
		int availableStocks = stock.getQuantity();

		stock.setQuantity(availableStocks + quantity);

		System.out.println(quantity + " stocks sold Successfully...!!!\n");
	}

	public static Map<String, Stock> populateStocks() {
		Map<String, Stock> stocksMap = new HashMap<>();

		stocksMap.put("STOCK-101", new Stock("STOCK-101", "TCS", "TATA", 5067.54, LocalDate.parse("2024-09-24"), 1025));
		stocksMap.put("STOCK-102",
				new Stock("STOCK-102", "AAPL", "Apple Inc.", 143.52, LocalDate.parse("2024-09-25"), 500));
		stocksMap.put("STOCK-103",
				new Stock("STOCK-103", "GOOGL", "Alphabet Inc.", 2810.21, LocalDate.parse("2024-09-26"), 300));
		stocksMap.put("STOCK-104",
				new Stock("STOCK-104", "MSFT", "Microsoft Corporation", 301.47, LocalDate.parse("2024-09-27"), 700));
		stocksMap.put("STOCK-105",
				new Stock("STOCK-105", "AMZN", "Amazon.com Inc.", 3401.46, LocalDate.parse("2024-09-28"), 100));
		stocksMap.put("STOCK-106",
				new Stock("STOCK-106", "NFLX", "Netflix Inc.", 537.27, LocalDate.parse("2024-09-29"), 200));
		stocksMap.put("STOCK-107",
				new Stock("STOCK-107", "TATA Steel", "TATA", 317.22, LocalDate.parse("2024-09-30"), 400));
		stocksMap.put("STOCK-108",
				new Stock("STOCK-108", "NVDA", "NVIDIA Corporation", 217.44, LocalDate.parse("2024-10-01"), 600));
		stocksMap.put("STOCK-109",
				new Stock("STOCK-109", "INTC", "Intel Corporation", 48.75, LocalDate.parse("2024-10-02"), 800));
		stocksMap.put("STOCK-110", new Stock("STOCK-110", "AMD", "Advanced Micro Devices Inc.", 111.34,
				LocalDate.parse("2024-10-03"), 900));
		stocksMap.put("STOCK-111",
				new Stock("STOCK-111", "TATA MOTORS", "TATA", 229.51, LocalDate.parse("2024-10-04"), 1000));

		return stocksMap;
	}

}
