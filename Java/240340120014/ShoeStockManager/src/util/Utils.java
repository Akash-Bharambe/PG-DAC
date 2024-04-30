package util;

import java.time.LocalDate;
import java.util.Map;
import java.util.Scanner;

import com.core.CategoryType;
import com.core.Shoe;
import com.core.ValidationRules;

public class Utils {

	private static Scanner scanner = new Scanner(System.in);

	/**
	 * Method to prompt user whole menu and return users input
	 * 
	 * @return users choice
	 */
	public static int menuList() {
		System.out.println("0. EXIT");
		System.out.println("1. Add New Shoe");
		System.out.println("2. Update Stock of a Shoe");
		System.out.println("3. Set 20% discount for shoes which are not sold in last 4 months");
		System.out.println("4. Remove Shoes that were listed a year ago and have not sold even a single piece yet");
		System.out.println("5. Display all available Shoes");
		System.out.print("Enter Choice: ");
		int ch = scanner.nextInt();
		scanner.nextLine();
		return ch;
	}

	/**
	 * Method to Take shoe details input from user and inserting it in shoeMap
	 * 
	 * @param shoeMap Map in which Shoe is to be added
	 */
	public static void addNewShoe(Map<Integer, Shoe> shoeMap) {
		int shoeID = ValidationRules.getStockID(shoeMap);

		for (CategoryType type : CategoryType.values()) {
			System.out.println(type);
		}

		System.out.print("Enter shoe Category: ");
		String categoryString = scanner.nextLine();

		CategoryType category = ValidationRules.validateCategory(categoryString);

		System.out.print("Enter Shoe Listing Date(dd-MM-yyyy): ");
		String dateString = scanner.nextLine();

		LocalDate stockListingDate = ValidationRules.validateDate(dateString);

		System.out.print("Enter Stock Size: ");
		int stockSize = scanner.nextInt();
		scanner.nextLine();

		System.out.print("Enter Stock Update Date(dd-MM-yyyy): ");
		String stockUpdateString = scanner.nextLine();

		LocalDate stockUpdateDate = ValidationRules.validateDate(stockUpdateString);

		System.out.print("Enter price of shoe: ");
		double price = scanner.nextDouble();
		scanner.nextLine();
		ValidationRules.validateprice(price);

		System.out.print("Enter Discount: ");
		double discount = scanner.nextDouble();
		scanner.nextLine();

		shoeMap.put(shoeID, new Shoe(shoeID, category, stockListingDate, stockSize, stockUpdateDate, price, discount));
		System.out.println("Shoe Added Successfully...!!!\n");
	}

	/**
	 * Method to update Stock of a specific Shoe
	 * 
	 * @param shoeMap Map which Contains Shoes
	 */
	public static void updateShoeStock(Map<Integer, Shoe> shoeMap) {
		System.out.print("Enter Shoe ID to update Stock: ");
		int stockID = scanner.nextInt();
		scanner.nextLine();

		System.out.print("Enter added Stock: ");
		int stockSize = scanner.nextInt();
		scanner.nextLine();

		Shoe shoe = shoeMap.get(stockID);
		shoe.setStockSize(shoe.getStockSize() + stockSize);

		shoe.setStockUpdateDate(LocalDate.now());
		System.out.println("Stock updated successfully...!!!\n");
	}

	/**
	 * Method to Set 20% discount for shoes which are not sold in last 4 months
	 * 
	 * @param shoeMap Map which Contains Shoes
	 */
	public static void setDiscount(Map<Integer, Shoe> shoeMap) {
		shoeMap.values().stream().filter(shoe -> shoe.getStockUpdateDate().plusMonths(4).isBefore(LocalDate.now()))
				.forEach(shoe -> shoe.setDiscount(0.20));

		System.out.println("Discont of 20% set successfully...!!!\n");
	}

	/**
	 * Method to Remove Shoes that were listed a year ago and have not sold even a single piece yet
	 * 
	 * @param shoeMap Map which Contains Shoes
	 */
	public static void removeShoes(Map<Integer, Shoe> shoeMap) {

		shoeMap.values().removeIf(shoe -> shoe.getListingDate().plusYears(1).isBefore(LocalDate.now())
				&& shoe.getStockUpdateDate().plusYears(1).isBefore(LocalDate.now()));

		System.out.println("Shoes Removed Successfully...!!!\n");
	}
}
