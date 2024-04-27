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
		pets.put(101, new Pet(101, "Golden Retriever", Category.DOG, 2000, 5));
		pets.put(102, new Pet(102, "Labrador", Category.DOG, 5000, 10));
		pets.put(103, new Pet(103, "Persian Cat", Category.CAT, 20000, 17));
		pets.put(104, new Pet(104, "Siamese Cat", Category.CAT, 15000, 8));
		pets.put(105, new Pet(105, "Bengal Cat", Category.CAT, 18000, 12));
		pets.put(106, new Pet(106, "German Shepherd", Category.DOG, 7000, 15));
		pets.put(107, new Pet(107, "Poodle", Category.DOG, 6000, 20));
		pets.put(108, new Pet(108, "Maine Coon Cat", Category.CAT, 22000, 10));
		pets.put(109, new Pet(109, "Beagle", Category.DOG, 5500, 8));
		pets.put(110, new Pet(110, "Ragdoll Cat", Category.CAT, 19000, 14));
		pets.put(111, new Pet(111, "Siberian Husky", Category.DOG, 8000, 18));
		pets.put(112, new Pet(112, "British Shorthair Cat", Category.CAT, 23000, 9));
		pets.put(113, new Pet(113, "Golden Retriever Puppy", Category.DOG, 3000, 7));
		pets.put(114, new Pet(114, "Dwarf Hotot Rabbit", Category.RABBIT, 2500, 6));
		pets.put(115, new Pet(115, "Lionhead Rabbit", Category.RABBIT, 2800, 8));
		pets.put(116, new Pet(116, "Betta Fish", Category.FISH, 1000, 20));
		pets.put(117, new Pet(117, "Goldfish", Category.FISH, 500, 30));
		pets.put(118, new Pet(118, "Angelfish", Category.FISH, 1500, 15));
		pets.put(119, new Pet(119, "Guppy Fish", Category.FISH, 300, 25));
		pets.put(120, new Pet(120, "Netherland Dwarf Rabbit", Category.RABBIT, 3000, 10));
		pets.put(121, new Pet(121, "Tropical Fish Assortment", Category.FISH, 2000, 12));
		pets.put(122, new Pet(122, "Holland Lop Rabbit", Category.RABBIT, 3200, 7));
		pets.put(123, new Pet(123, "Betta Splendens Fish", Category.FISH, 1200, 18));

	}

	public static void signUp() throws PetStoreException {
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
			scanner.nextLine();
			System.out.print("Enter Pet Name: ");
			String name = scanner.nextLine();

			System.out.print("Enter Category: ");
			String category = scanner.next();

			System.out.print("Enter Price: ");
			double price = scanner.nextDouble();

			System.out.print("Enter stock: ");
			int stock = scanner.nextInt();

			pets.put(petId, new Pet(petId, name, Category.valueOf(category.toUpperCase()), price, stock));
		} else {
			throw new PetStoreException("Only admin can add new pet...!!!\n");
		}
	}

	public static void updatePetDetails() {
		if (isAdmin) {
			displayAllPets();
			
			System.out.print("Enter pet id: ");
			int petId = scanner.nextInt();
			scanner.nextLine();
			
			Pet pet = pets.get(petId);
			
			System.out.print("Enter Pet Name: ");
			String name = scanner.nextLine();
			pet.setName(name);

			System.out.print("Enter Category: ");
			String category = scanner.next();
			pet.setCategory(Category.valueOf(category.toUpperCase()));

			System.out.print("Enter Price: ");
			double price = scanner.nextDouble();
			pet.setUnitPrice(price);

			System.out.print("Enter stock: ");
			int stock = scanner.nextInt();
			pet.setStocks(stock);
			
			System.out.println("Pet Details Updated...!!!\n");
			
		} else {
			throw new PetStoreException("Only admin can update pet details...!!!\n");
		}
	}

	public static void displayAllPets() {
		if (isLoggedIn)
			pets.values().forEach(p -> System.out.println(p));
	}

	public static void orderPet() {
		if (isLoggedIn) {
			System.out.println("Available Pets: ");
			displayAllPets();

			System.out.print("Enter pet id to place order: ");
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
				System.out.println("Order ID: " + orderId+"\n");
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
			System.out.println("Order Status: " + order.getStatus().name());
			System.out.println("Price: " + pets.get(order.getPetId()).getUnitPrice());
		} else {
			throw new PetStoreException("Please Login first...!!!\n");
		}
	}

	public static void updateOrderStatus() {
		if (isAdmin) {

			Order order = findOrder();

			System.out.print("Enter Order Status: \n");
			for (StatusType type : StatusType.values()) {
				System.out.println(type);
			}
			String status = scanner.next();

			order.setStatus(StatusType.valueOf(status.toUpperCase()));
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
		System.out.println("9. logout");
		System.out.println("0. EXIT");
		System.out.print("Enter Choice: ");
		int ch = scanner.nextInt();
		scanner.nextLine();
		return ch;
	}
}
