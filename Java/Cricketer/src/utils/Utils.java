package utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import app.Cricketer;
import app.ValidationRules;

public class Utils {
	private static Scanner scanner = new Scanner(System.in);
	private static List<Cricketer> cricketers = new ArrayList<>();

	public static int menuList() {
		System.out.println("1. Add Cricketer.\r\n" + "2. Modify Cricketer's rating\r\n"
				+ "3. Search Cricketer by name\r\n" + "4. Display all Cricketers added in collection.\r\n"
				+ "5. Display All Cricketers in sorted form by rating.");
		System.out.print("Enter Choice: ");
		int ch = scanner.nextInt();
		scanner.nextLine();
		return ch;
	}

	public static void addCricketer() {
		System.out.print("Enter name: ");
		String name = scanner.nextLine();

		System.out.print("Enter Age: ");
		int age = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Enter email: ");
		String email = scanner.nextLine();

		System.out.print("Enter Phone number: ");
		String phone = scanner.nextLine();

		System.out.print("Enter Player Rating(0-10): ");
		int rating = scanner.nextInt();
		scanner.nextLine();
		ValidationRules.validateRating(rating);

		cricketers.add(new Cricketer(name, age, email, phone, rating));
		System.out.println("Player Added...");
	}

	private static Cricketer findCricketer() {
		System.out.print("Enter name: ");
		String name = scanner.nextLine();

		return cricketers.get(cricketers.indexOf(new Cricketer(name)));
	}

	public static void modifyRating() {
		System.out.print("Enter new Rating(0-10): ");
		int rating = scanner.nextInt();
		scanner.nextLine();
		ValidationRules.validateRating(rating);
		findCricketer().setRating(rating);
		System.out.println("Rating Modified...");
	}

	public static void searchCricketer() {
		System.out.print(findCricketer());
	}

	public static void displayAllCricketer() {
		cricketers.forEach(c -> System.out.println(c));

	}

	public static void sortByRating() {
		cricketers.stream().sorted((c1, c2) -> ((Integer) c2.getRating()).compareTo(c1.getRating()))
				.forEach(c -> System.out.println(c));

	}

}
