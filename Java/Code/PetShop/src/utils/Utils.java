package utils;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

import core.Category;
import core.Order;
import core.Pet;
import core.StatusType;
import exception.PetStoreException;

public class Utils {
	private static Scanner scanner = new Scanner(System.in);

	private static Map<Integer, Pet> pets;
	private static Map<Integer, Order> orders;
	private static Map<String, String> users;
	private static boolean isLoggedIn;
	private static boolean isAdmin;
	private static Random random;

	static {
		random = new Random();
		isLoggedIn = false;
		isAdmin = false;
		pets = new HashMap<>();
		orders = new HashMap<>();
		users = new HashMap<>();
		users.put("admin", "admin");
		users.put("akash", "123");
	}

	public static void signUp() {
		System.out.print("Enter username: ");
		String username = scanner.next();
		if (username.equals("admin"))
			throw new PetStoreException("username cannot be admin\n");
		System.out.print("Enter password: ");
		String pass = scanner.next();

		users.put(username, pass);
		System.out.println("User added Successfully...!!!\n");
	}

	public static void login() {
		System.out.print("Enter username: ");
		String username = scanner.next();

		if (users.containsKey(username)) {
			System.out.print("Enter password: ");
			String pass = scanner.next();
			if (users.containsValue(pass)) {
				isLoggedIn = true;
				System.out.println("Logged in as " + username + "\n");
			}
		}
		if (username.equals("admin") && isLoggedIn) {
			isAdmin = true;
		}
	}

	public static void logout() {
		isAdmin = isLoggedIn = false;
		System.out.println("Successfully logged out...!!!\n");
	}

	public static void addPet() {
		if (isAdmin) {

			System.out.print("Enter pet id: ");
			int petId = scanner.nextInt();

			System.out.print("Enter Pet Name: ");
			String name = scanner.nextLine();

			System.out.print("Enter Category: ");
			String category = scanner.next();

			System.out.print("Enter Price: ");
			double price = scanner.nextDouble();

			System.out.print("Enter stock");
			int stock = scanner.nextInt();

			pets.put(petId, new Pet(petId, name, Category.valueOf(category), price, stock));
		} else {
			throw new PetStoreException("Only admin can add new pet...!!!");
		}
	}

	public static void updatePetDetails() {
		if (isAdmin) {
			System.out.print("Enter pet id: ");
			int petId = scanner.nextInt();

			Pet pet = pets.get(petId);
			System.out.print("Enter Pet Name: ");
			String name = scanner.nextLine();
			pet.setName(name);

			System.out.print("Enter Category: ");
			String category = scanner.next();
			pet.setCategory(Category.valueOf(category));

			System.out.print("Enter Price: ");
			double price = scanner.nextDouble();
			pet.setUnitPrice(price);

			System.out.print("Enter stock");
			int stock = scanner.nextInt();
			pet.setStocks(stock);
		} else {
			throw new PetStoreException("Only admin can update pet details...!!!");
		}
	}

	public static void displayAllPets() {
		if (isLoggedIn)
			pets.values().forEach(Pet::toString);
	}

	public static void orderPet() {
		if (isLoggedIn) {
			System.out.println("Available Pets: ");
			displayAllPets();

			System.out.print("Enter pet id to place order");
			int petID = scanner.nextInt();

			if (pets.containsKey(petID)) {
				System.out.print("Enter Quantity: ");
				int quantity = scanner.nextInt();
				Pet pet = pets.get(petID);
				if (quantity > pet.getStocks()) {
					throw new PetStoreException("Only " + pet.getStocks() + " pets available");
				}
				int orderId = random.nextInt(9000) + 1000;
				orders.put(orderId, new Order(orderId, petID, quantity));

				Order order = orders.get(orderId);
				pet.setStocks(pet.getStocks() - quantity);
				System.out.println("Order Status: " + order.getStatus().name());
				System.out.println("Order ID: " + orderId);
			} else {
				throw new PetStoreException("Invalid pet ID...!!!\n");
			}

		} else {
			throw new PetStoreException("Please Login first...!!!\n");
		}
	}

	private static Order findOrder() {
		System.out.print("Enter Order ID: ");
		int orderId = scanner.nextInt();

		if (orders.containsKey(orderId))
			return orders.get(orderId);
		throw new PetStoreException("Invalid Order ID...!!!\n");
	}

	public static void checkOrderStatus() {
		if (isLoggedIn) {

			Order order = findOrder();

			System.out.println("Order no: " + order.getOrderId());
			System.out.println("Pet Ordered: " + pets.get(order.getPetId()).getName());
			System.out.println("Price: " + pets.get(order.getPetId()).getUnitPrice());
		} else {
			throw new PetStoreException("Please Login first...!!!\n");
		}
	}

	public static void updateOrderStatus() {
		if (isAdmin) {

			Order order = findOrder();

			System.out.print("Enter Order Status: ");
			for (StatusType type : StatusType.values()) {
				System.out.println(type);
			}
			String status = scanner.next();

			order.setStatus(StatusType.valueOf(status));
			System.out.println("Status Changed Succesfully...!!!\n");
		} else {
			throw new PetStoreException("Only admin can update Order Status...!!!\n");
		}
	}

	public static int menuList() {
		System.out.println("1. Login");
		System.out.println("2. Add new Pet (Admin only functionality)");
		System.out.println("3. Update Pet details (Admin only functionality)");
		System.out.println("4. Display all available pets");
		System.out.println("5. Order a Pet");
		System.out.println("6. Check order status by Order Id");
		System.out.println("7. Update order status (Admin only functionality)");
		System.out.println("8. Register new User");
		System.out.println("0. EXIT");
		System.out.print("Enter Choice: ");
		int ch = scanner.nextInt();
		scanner.nextLine();
		return ch;
	}
}
