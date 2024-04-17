package app.utils;

import static app.customer.ValidationRules.validateEmail;
import static app.customer.ValidationRules.validatePass;
import static app.customer.ValidationRules.validatePlan;
import static app.customer.ValidationRules.validateRegistrationAmount;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import app.customer.Customer;
import app.customer.PlanType;
import app.exception.CustomerException;

public class Utils {

	private static Scanner scanner = new Scanner(System.in);

	public static int menuList() {
		System.out.println();
		System.out.println("0. EXIT");
		System.out.println("1. Sign Up");
		System.out.println("2. Sign In");
		System.out.println("3. Change Password");
		System.out.println("4. Unsubscribe");
		System.out.println("5. Display all Customers");
		System.out.println("6. Sort email asc");
		System.out.println("7. Sort email desc");
		System.out.println("8. Sort Balance");
		System.out.println("9. Sort DOB");
		System.out.println("10. Filter Plans");
		return scanner.nextInt();
	}

	public static void filterPaln(Map<String, Customer> map) {
		System.out.println("Enter Plan: ");
		String plan = scanner.next();
		PlanType planType = validatePlan(plan);
		map.values().forEach(c -> {
			if (planType == c.getPlan())
				System.out.println(c);
		});
	}

	public static void sortDOB(Map<String, Customer> map) {
		List<Customer> customerList = new ArrayList<Customer>(map.values());

		Collections.sort(customerList, (c1, c2) -> c1.getDob().compareTo(c2.getDob()));
		displayAllCustomers(customerList);
	}

	public static void sortEmailAsc(Map<String, Customer> map) {
		TreeMap<String, Customer> treeMap = new TreeMap<String, Customer>(map);
		displayAllCustomers(treeMap);
	}

	public static void sortEmailDesc(Map<String, Customer> map) {
		TreeMap<String, Customer> treeMap = new TreeMap<String, Customer>((o1, o2) -> o2.compareTo(o1));
		treeMap.putAll(map);
		displayAllCustomers(treeMap);
	}

	public static void sortBalance(Map<String, Customer> map) {
		List<Customer> customersList = new ArrayList<>(map.values());

		Collections.sort(customersList, (c1, c2) -> (int) (c1.getRegistrationAmmount() - c2.getRegistrationAmmount()));
		displayAllCustomers(customersList);
	}

	public static void populateList(Map<String, Customer> customersMap) {
		customersMap.put("aakash@gmail.com", new Customer("Akash", "Bharambe", "aakash@gmail.com", "aakash@123", 100000,
				LocalDate.parse("2002-06-26"), PlanType.PLATINUM));
		customersMap.put("sakshi@example.com", new Customer("Sakshi", "Bharambe", "sakshi@example.com", "sakshi@123",
				75000, LocalDate.parse("2001-09-29"), PlanType.GOLD));
		customersMap.put("johndoe@example.com", new Customer("John", "Doe", "johndoe@example.com", "p@ssw0rd", 75000,
				LocalDate.parse("1990-05-15"), PlanType.GOLD));
		customersMap.put("janesmith@example.com", new Customer("Jane", "Smith", "janesmith@example.com", "securePW123",
				50000, LocalDate.parse("1985-11-20"), PlanType.SILVER));
		customersMap.put("michaelj@example.com", new Customer("Michael", "Johnson", "michaelj@example.com",
				"myPassword123", 125000, LocalDate.parse("1978-09-10"), PlanType.PLATINUM));
		customersMap.put("emilyb@example.com", new Customer("Emily", "Brown", "emilyb@example.com", "password1234",
				90000, LocalDate.parse("1982-03-25"), PlanType.GOLD));
		customersMap.put("davidlee@example.com", new Customer("David", "Lee", "davidlee@example.com", "abc123XYZ",
				60000, LocalDate.parse("1995-07-30"), PlanType.SILVER));
		customersMap.put("sarahw@example.com", new Customer("Sarah", "Wilson", "sarahw@example.com", "sarahsPass",
				85000, LocalDate.parse("1989-01-08"), PlanType.GOLD));
		customersMap.put("chrism@example.com", new Customer("Chris", "Martinez", "chrism@example.com", "cMartinez123",
				110000, LocalDate.parse("1973-12-12"), PlanType.PLATINUM));
		customersMap.put("kimn@example.com", new Customer("Kim", "Nguyen", "kimn@example.com", "securePassword", 70000,
				LocalDate.parse("1992-04-18"), PlanType.SILVER));
		customersMap.put("ryang@example.com", new Customer("Ryan", "Garcia", "ryang@example.com", "ryan1234", 80000,
				LocalDate.parse("1987-06-05"), PlanType.GOLD));
		customersMap.put("michellec@example.com", new Customer("Michelle", "Chang", "michellec@example.com", "chang567",
				95000, LocalDate.parse("1980-08-22"), PlanType.PLATINUM));

	}

	public static void signUp(Map<String, Customer> customersMap) throws RuntimeException {

		System.out.print("Enter Full Name: ");
		String fName = scanner.next();
		String lName = scanner.next();

		System.out.print("Enter email: ");
		String email = scanner.next();
		validateEmail(email.toLowerCase(), customersMap);

		System.out.print(
				"Enter password (Passsword must contain 1 atleast Uppercase letter, 1 Lowercase Letter, 1 symbol and at least 1 number) : ");
		String pass = validatePass(scanner.next());

		System.out.print("Enter Plan: ");
		String plan = scanner.next();
		PlanType planType = validatePlan(plan);

		System.out.print("Enter Registration Amount: ");
		double registrationAmount = scanner.nextDouble();
		validateRegistrationAmount(planType, registrationAmount);

		System.out.print("Enter BirthDate(yyyy-mm-dd): ");
		String dob = scanner.next();

		customersMap.put(email,
				new Customer(fName, lName, email, pass, registrationAmount, LocalDate.parse(dob), planType));
		System.out.println("Customer Added...");
	}

	private static Customer validateCredentials(Map<String, Customer> customersMap) throws RuntimeException {
		System.out.print("Enter email: ");
		String email = scanner.next();
		Customer customer = customersMap.get(email);
		if (customer == null)
			throw new CustomerException("Customer do not exist");

		System.out.print("Enter password: ");
		String pass = scanner.next();

		if (customer.getPass().equals(pass))
			return customer;
		throw new CustomerException("Password Invalid");
	}

	public static void signIn(Map<String, Customer> customersMap) throws RuntimeException {
		Customer customer = validateCredentials(customersMap);
		System.out.println(customer);
	}

	public static void changePassword(Map<String, Customer> customersMap) throws RuntimeException {
		System.out.println("Enter email and Old Password...");
		Customer customer = validateCredentials(customersMap);

		System.out.print("Enter new password: ");
		customer.setPass(validatePass(scanner.next()));
		System.out.println("Password Changed...");
	}

	public static void unsubscribe(Map<String, Customer> customersMap) throws RuntimeException {
		Customer customer = validateCredentials(customersMap);
		System.out.print("Are you sure(y/n): ");
		if (scanner.next().equals("y")) {
			customersMap.remove(customer.getEmail());
			System.out.println("Sad to see you leave :(");
		} else
			System.out.println(":) yay you are staying...");
	}

	public static void displayAllCustomers(Map<String, Customer> customersMap) {
		customersMap.values().forEach(c -> System.out.println(c));
	}

	public static void displayAllCustomers(List<Customer> customers) {
		customers.forEach(c -> System.out.println(c));
	}

}