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
		try {
			while ((ch = menuList()) != 0) {
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

			}
			sortItemCode(items);
			sortPrice(items);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
