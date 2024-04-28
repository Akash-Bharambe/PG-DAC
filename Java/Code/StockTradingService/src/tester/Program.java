package tester;

import static util.Utils.*;

import java.util.HashMap;
import java.util.Map;

import core.Stock;

public class Program {

	public static void main(String[] args) {
		Map<String, Stock> stocks = new HashMap<>();
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
				default:
					break;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
