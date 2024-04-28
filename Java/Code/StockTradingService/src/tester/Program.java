package tester;

import static util.IOUtils.loadStockDetails;
import static util.IOUtils.saveStockDetails;
import static util.Utils.addNewStock;
import static util.Utils.menuList;
import static util.Utils.purchaseStocks;
import static util.Utils.searchStock;
import static util.Utils.sellStocks;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import core.Stock;

public class Program {

	public static void main(String[] args) {
		Map<String, Stock> stocks = null;
		try {
			stocks = new HashMap<>(loadStockDetails());

			int ch;
			while ((ch = menuList()) != 0) {
				try {
					switch (ch) {
					case 1:
						addNewStock(stocks);
						break;
					case 2:
						searchStock(stocks);
						break;
					case 3:
						purchaseStocks(stocks);
						break;
					case 4:
						sellStocks(stocks);
						break;
					case 5:
						stocks.values().forEach(s -> System.out.println(s));
						break;
					default:
						System.out.println("Please Enter Valid Input");
						break;
					}
					System.out.println();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

			saveStockDetails(stocks);
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
	}

}
