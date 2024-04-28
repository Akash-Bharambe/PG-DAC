package tester;

import static util.IOUtils.*;
import static util.Utils.menuList;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import core.Item;
import util.Utils;

public class Program {
	public static void main(String[] args) {
		List<Item> items = new ArrayList<>();
		populateData(items);
		int ch;
		while ((ch = menuList()) != 0) {
			try {
				switch (ch) {
				case 1:
					Utils.acceptData(items);
					break;
				case 2:
					readData("items_codes.ser");
					break;
				case 3:
					readData("items_price.ser");
					break;
				default:
					System.out.println("Please enter valid input...!!!/n");
					break;
				}
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		try {
			sortItemCode(items);
			sortPrice(items);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
