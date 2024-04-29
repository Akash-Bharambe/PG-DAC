package com.util;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.core.Grocery;

public class Utils {
	private static Scanner scanner = new Scanner(System.in);

	public static void addNewItem(Map<String, Grocery> map) {
		System.out.println("Enter item Name: ");
		String name = scanner.nextLine();

		System.out.println("Enter price");
		double price = scanner.nextDouble();
		scanner.nextLine();

		System.out.println("Enter quantity: ");
		int quantity = scanner.nextInt();
		scanner.nextLine();

		System.out.println("Enter Stock Update Date: ");
		String date = scanner.nextLine();

		System.out.println("Enter Stock Update Time: ");
		String time = scanner.nextLine();

		LocalDateTime stockUpDateTime = LocalDateTime.of(LocalDate.parse(date), LocalTime.parse(time));
		map.put(name, new Grocery(name, quantity, price, stockUpDateTime));
	}

	public static void updateQuantity(Map<String, Grocery> map) {
		System.out.println("Enter item Name: ");
		String name = scanner.nextLine();

		Grocery grocery = map.get(name);

		System.out.println("Enter quantity: ");
		int quantity = scanner.nextInt();
		scanner.nextLine();

		grocery.setQuantity(grocery.getQuantity() + quantity);
		grocery.setStockUpDateTime(LocalDateTime.now());
	}

	public static void displayItems(Map<String, Grocery> map) {
		map.values().forEach(i -> System.out.println(i.display()));
	}

	public static void removeOutOfStock(Map<String, Grocery> map) {
		map.values().removeIf(i -> i.getQuantity() == 0);
	}

	public static void displayLowestQuantity(Map<String, Grocery> map) {

		List<Grocery> values = new ArrayList<>(map.values());

		values.sort((v1, v2) -> ((Integer) v1.getQuantity()).compareTo(v2.getQuantity()));

		int count = 0;
		for (Grocery grocery : values) {
			if (count < 10) {
				System.out.println(grocery);
			}
			count++;
		}
	}

	public static int menuList() {
		System.out.println("1. Add grocery");
		System.out.println("2. Update Quantity");
		System.out.println("3. Display Items");
		System.out.println("4. Remove All items out of Stock");
		System.out.println("5. Display lowest quantity items");
		System.out.println("Enter Choice: ");
		int ch= scanner.nextInt();
		scanner.nextLine();
		return ch;
	}
}
