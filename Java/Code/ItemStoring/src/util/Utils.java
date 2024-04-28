package util;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import core.Item;

public class Utils {
	private static Scanner scanner = new Scanner(System.in);

	public static int menuList() {
		System.out.println("1. Add Item");
		System.out.println("2. Read all Items sorted by Item Code");
		System.out.println("3. Read all Items sorted by Date");
		System.out.println("0. EXIT");
		int ch = scanner.nextInt();
		scanner.nextLine();
		return ch;
	}

	public static void acceptData(List<Item> items) {
		System.out.println("Enter Item Code: ");
		String itemCode = scanner.nextLine();
		System.out.println("Enter Description of item: ");
		String description = scanner.nextLine();
		
		System.out.println("Enter Price: ");
		double price = scanner.nextDouble();
		
		System.out.println("Enter date: ");
		String date = scanner.next();
		
		items.add(new Item(itemCode, description, price, LocalDate.parse(date)));
	}

}
