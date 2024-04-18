package utils;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import exception.WatchException;
import watch.BandMaterialType;
import watch.CategoryType;
import watch.ShapeType;
import watch.StyleType;
import watch.Watch;
import static utils.ValidationRules.*;

public class Utils {
	private static Scanner scanner = new Scanner(System.in);

	public static int menuList() {
		System.out.println("1. Add New Watch");
		System.out.println("2. Update Stock of Watch");
		System.out.println("3. Set 10% discount on all 1 yr older Watch");
		System.out.println("4. Remove Watches which are never sold once listed in 18 months");
		System.out.println("5. Display all Watches");
		System.out.print("Enter Choice: ");
		return scanner.nextInt();
	}

	public static void addWatch(List<Watch> watchList) throws RuntimeException {
		System.out.print("Enter watch category: ");
		CategoryType category = validateCategory(scanner.next());

		System.out.print("Enter Watch Brand: ");
		String brand = scanner.next();

		System.out.print("Enter Shape of Watch: ");
		ShapeType shape = validateShape(scanner.next());

		System.out.print("Enter Style of Watch: ");
		StyleType style = validateStyle(scanner.next());

		System.out.print("Enter Band Material: ");
		BandMaterialType bandMaterial = validateBandMaterial(scanner.next());

		System.out.print("Enter stock size: ");
		int stock = validateStock(scanner.nextInt());

		System.out.print("Stock Listing Date: ");
		LocalDate listingDate = validateDate(scanner.next());

		System.out.print("Enter Price: ");
		double price = validatePrice(scanner.nextDouble());

		watchList.add(
				new Watch(category, brand, shape, style, bandMaterial, stock, listingDate, LocalDate.now(), price));
	}

	public static void updateStock(List<Watch> watchList) throws RuntimeException {
		System.out.print("Enter Watch ID to Update Stock: ");
		int watchID = scanner.nextInt();

		int index = watchList.indexOf(new Watch(watchID));

		if (index == -1) {
			throw new WatchException("ID NOT FOUND...!!!");
		}

		System.out.println("Enter Stock Size");
		watchList.get(index).setStock(validateStock(scanner.nextInt()));
		watchList.get(index).setStockUpdateDate(LocalDate.now());
	}

	public static void setDiscount(List<Watch> watchList) {
		watchList.stream().filter(w -> w.getStockListingDate().plusYears(1).isBefore(LocalDate.now())).forEach(w -> {
			System.out.println(w);
			w.setDiscount(10);
		});
		System.out.println("Discount of 10% set Set");
	}

	public static void removeUnsoldWatches(List<Watch> watchList) {
		List<Watch> removeList = new ArrayList<Watch>();
		watchList.stream().filter(w -> w.getStockUpdateDate().minusMonths(18).isBefore(w.getStockListingDate()))
				.forEach(w -> {
					System.out.println(w);
					removeList.add(w);
				});
		removeList.forEach(w -> watchList.remove(w));
	}

	public static void populateList(List<Watch> watchList) {
		watchList.add(new Watch(CategoryType.MEN, "Rolex", ShapeType.RECTANGLE, StyleType.CASUAL,
				BandMaterialType.CERAMIC, 50, LocalDate.parse("2023-05-11"), LocalDate.parse("2024-03-21"), 155000.3));

		watchList.add(new Watch(CategoryType.WOMEN, "Tag Heuer", ShapeType.ROUND, StyleType.FORMAL,
				BandMaterialType.LEATHER, 38, LocalDate.parse("2023-04-05"), LocalDate.parse("2023-05-15"), 85000.0));

		watchList.add(new Watch(CategoryType.UNISEX, "Seiko", ShapeType.SQUARE, StyleType.SPORTY,
				BandMaterialType.STAINLESS_STEEL, 42, LocalDate.parse("2022-01-20"), LocalDate.parse("2024-02-28"),
				35000.5));

		watchList.add(new Watch(CategoryType.WOMEN, "Michael Kors", ShapeType.OVAL, StyleType.CASUAL,
				BandMaterialType.LEATHER, 36, LocalDate.parse("2023-03-10"), LocalDate.parse("2023-04-30"), 12500.75));

		watchList.add(new Watch(CategoryType.MEN, "Citizen", ShapeType.ROUND, StyleType.DRESSY,
				BandMaterialType.STAINLESS_STEEL, 44, LocalDate.parse("2022-02-28"), LocalDate.parse("2024-04-15"),
				55000.2));

		watchList.add(new Watch(CategoryType.UNISEX, "Fossil", ShapeType.SQUARE, StyleType.CASUAL,
				BandMaterialType.LEATHER, 40, LocalDate.parse("2023-03-05"), LocalDate.parse("2023-04-20"), 18000.0));

		watchList.add(
				new Watch(CategoryType.WOMEN, "Bulova", ShapeType.ROUND, StyleType.FORMAL, BandMaterialType.GOLD_PLATED,
						38, LocalDate.parse("2022-01-15"), LocalDate.parse("2023-02-28"), 28000.4));

		watchList.add(new Watch(CategoryType.MEN, "Tissot", ShapeType.RECTANGLE, StyleType.SPORTY,
				BandMaterialType.RUBBER, 46, LocalDate.parse("2023-03-01"), LocalDate.parse("2024-04-10"), 42000.6));

		watchList.add(new Watch(CategoryType.WOMEN, "Guess", ShapeType.OVAL, StyleType.CASUAL,
				BandMaterialType.STAINLESS_STEEL, 34, LocalDate.parse("2022-02-15"), LocalDate.parse("2023-03-31"),
				9500.25));

		watchList.add(new Watch(CategoryType.UNISEX, "Casio", ShapeType.SQUARE, StyleType.SPORTY,
				BandMaterialType.RESIN, 42, LocalDate.parse("2022-03-20"), LocalDate.parse("2024-05-05"), 6000.0));

	}

}
