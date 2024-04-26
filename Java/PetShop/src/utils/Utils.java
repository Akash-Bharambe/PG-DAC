package utils;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

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
		}

	}
}
