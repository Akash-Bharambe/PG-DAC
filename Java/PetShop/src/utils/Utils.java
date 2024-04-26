package utils;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import core.Category;
import core.Order;
import core.Pet;

public class Utils {
	private static Scanner scanner = new Scanner(System.in);

	private static Map<Integer, Pet> pets;
	private static Map<Integer, Order> orders;
	private static Map<String, String> users;
	private static boolean isLoggedIn;

	static {
		isLoggedIn = false;
		pets = new HashMap<>();
		orders = new HashMap<>();
		users = new HashMap<>();
		users.put("admin", "admin");
		users.put("akash", "123");
	}

	public static void signUp() {
		System.out.println("Enter username: ");
		String username = scanner.next();

		System.out.println("Enter password: ");
		String pass = scanner.next();

		users.put(username, pass);
	}

	public static void login() {
		System.out.println("Enter username: ");
		String username = scanner.next();

		if (users.containsKey(username)) {
			System.out.println("Enter password: ");
			String pass = scanner.next();
			if (users.containsValue(pass)) {
				isLoggedIn = true;
				System.out.println("Logged in as " + username);
			}
		}
	}

	public static void addPet() {
		System.out.println("Enter pet id: ");
		int petId = scanner.nextInt();

		System.out.println("Enter Pet Name: ");
		String name = scanner.nextLine();

		System.out.println("Enter Category: ");
		String category = scanner.next();

		System.out.println("Enter Price: ");
		double price = scanner.nextDouble();

		System.out.println("Enter stock");
		int stock = scanner.nextInt();

		pets.put(petId, new Pet(petId, name, Category.valueOf(category), price, stock));
	}

	public static void updatePetDetails() {
		System.out.println("Enter pet id: ");
		int petId = scanner.nextInt();

		Pet pet = pets.get(petId);
		System.out.println("Enter Pet Name: ");
		String name = scanner.nextLine();
		pet.setName(name);

		System.out.println("Enter Category: ");
		String category = scanner.next();
		pet.setCategory(Category.valueOf(category));

		System.out.println("Enter Price: ");
		double price = scanner.nextDouble();
		pet.setUnitPrice(price);

		System.out.println("Enter stock");
		int stock = scanner.nextInt();
		pet.setStocks(stock);
	}

}
