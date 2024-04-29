package util;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.core.Contact;
import com.validations.ValidationRules;

public class Utils {

	private static Scanner scanner = new Scanner(System.in);

	public static void addNewContact(Map<String, Contact> map) {
		System.out.println("Enter Name: ");
		String name = scanner.nextLine();

		System.out.println("Enter Date of Birth(dd-mm-yyyy): ");
		String dob = scanner.nextLine();

		LocalDate dateOfBirth = ValidationRules.validateNameAndDOB(name, dob, map);

		System.out.println("Enter Phone number: ");
		String phoneNumber = scanner.nextLine();

		String email = null;

		System.out.println("Do you want to add email(y/n): ");
		String choice = scanner.nextLine();
		if (choice.equalsIgnoreCase("y")) {
			System.out.println("Enter Email: ");
			email = scanner.nextLine();
		}
		map.put(name, new Contact(phoneNumber, name, dateOfBirth, email));

	}

	public static void displayAllContacts(Map<String, Contact> map) {
		map.values().stream().forEach(System.out::println);
	}

	public static void updateDetails(Map<String, Contact> map) {
		System.out.println("Enter Name: ");
		String name = scanner.nextLine();

		System.out.println("Enter Date of Birth(yyyy-mm-dd): ");
		String dob = scanner.nextLine();

		Contact contact = map.get(name);

		if (contact.getDateOfBirth().equals(LocalDate.parse(dob))) {
			System.out.println("Enter Phone number: ");
			String phoneNumber = scanner.nextLine();
			contact.setPhoneNumber(phoneNumber);
		}

		System.out.println("Do you want to add email(y/n): ");
		String choice = scanner.nextLine();
		if (choice.equalsIgnoreCase("y")) {
			System.out.println("Enter Email: ");
			String email = scanner.nextLine();
			contact.setEmail(email);
		}
	}

	public static void removeContacts(Map<String, Contact> map) {
		map.values().removeIf(c -> c.getDateOfBirth().plusYears(80).isBefore(LocalDate.now()));
	}

	public static int menuList() {
		System.out.println("1. Add Contact");
		System.out.println("2. Display all Contacts");
		System.out.println("3. Update Contact Details");
		System.out.println("4. Remove contacts above 80");
		System.out.print("Enter Choice: ");
		int ch = 0;
		ch = scanner.nextInt();
		scanner.nextLine();
		return ch;
	}

	public static Map<String, Contact> populateMap() {
		Map<String, Contact> contactsMap = new HashMap<>();
		
		return contactsMap;
	}
}
