package app.utils;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import app.customer.Customer;
import app.customer.PlanType;
import app.customer.ValidationRules;
import app.exception.CustomerException;

public class Utils {

	private static Scanner scanner = new Scanner(System.in);

	public static void signUp(List<Customer> list) throws RuntimeException {

		System.out.print("Enter Full Name: ");
		String fName = scanner.next();
		String lName = scanner.next();

		System.out.print("Enter email: ");
		String email = scanner.next();
		ValidationRules.validateEmail(email.toLowerCase(), list);

		System.out.print("Enter password (Passsword must contain 1 atleast Uppercase letter, 1 Lowercase Letter, 1 symbol and at least 1 number) : ");
		String pass = scanner.next();
		ValidationRules.validatePass(pass);
		
		System.out.print("Enter Plan: ");
		String plan = scanner.next();
		PlanType planType = ValidationRules.validatePlan(plan);
		
		System.out.print("Enter Registration Amount: ");
		double registrationAmount = scanner.nextDouble();
		ValidationRules.validateRegistrationAmount(planType, registrationAmount);
		
		System.out.print("Enter BirthDate(yyyy-mm-dd): ");
		String dob = scanner.next();

		list.add(new Customer(fName, lName, email, pass, registrationAmount, LocalDate.parse(dob), planType));
		System.out.println("Customer Added...");
	}

	private static int validateCredentials(List<Customer> list) throws RuntimeException {
		System.out.print("Enter email: ");
		String email = scanner.next();

		System.out.print("Enter password: ");
		String pass = scanner.next();

		int index = list.indexOf(new Customer(email));

		if (index == -1) {
			throw new CustomerException("Customer do not exist");
		}

		Customer customer = list.get(index);

		if (customer.getPass().equals(pass)) {
			return index;
		}
		throw new CustomerException("Password Invalid");
	}

	public static void signIn(List<Customer> list) throws RuntimeException {
		Customer customer = list.get(validateCredentials(list));

		System.out.println(customer.toString());
	}

	public static void changePassword(List<Customer> list) throws RuntimeException {
		System.out.println("Enter email and Old Password...");
		Customer customer = list.get(validateCredentials(list));

		System.out.print("Enter new password: ");
		customer.setPass(scanner.next());
		System.out.println("Password Changed...");
	}

	public static void unsubscribe(List<Customer> list) throws RuntimeException {
		Customer customer = list.get(validateCredentials(list));
		System.out.print("Are you sure(y/n): ");
		if (scanner.next().equals("y")) {
			list.remove(customer);
			System.out.println("Sad to see you leave :(");
		}else {
			System.out.println(":) yay you are staying...");
		}
	}

	public static void displayAllCustomers(List<Customer> list) {
		for (Customer customer : list) {
			System.out.println(customer);
		}
	}
}
