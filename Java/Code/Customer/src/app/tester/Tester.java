package app.tester;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import app.customer.Customer;
import app.customer.PlanType;
import app.utils.Utils;

public class Tester {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayList<Customer> customersList = new ArrayList<>();
		populateList(customersList);
		int ch;
		while ((ch = menuList()) != 0) {
			try {
				switch (ch) {
				case 1:
					Utils.signUp(customersList);
					break;
				case 2:
					Utils.signIn(customersList);
					break;
				case 3:
					Utils.changePassword(customersList);
					break;
				case 4:
					Utils.unsubscribe(customersList);
					break;
				case 5:
					Utils.displayAllCustomers(customersList);
					break;

				default:
					System.out.println("Please Enter Valid Input...!!!");
					break;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	private static int menuList() {
		System.out.println();
		System.out.println("0. EXIT");
		System.out.println("1. Sign Up");
		System.out.println("2. Sign In");
		System.out.println("3. Change Password");
		System.out.println("4. Unsubscribe");
		System.out.println("5. Display all Customers");
		return scanner.nextInt();
	}

	private static void populateList(List<Customer> customersList) {
		customersList.add(new Customer("Akash", "Bharambe", "aakash@gmail.com", "aakash@123", 100000,
				LocalDate.parse("2002-06-26"), PlanType.PLATINUM));
		customersList.add(new Customer("Sakshi", "Bharambe", "sakshi@example.com", "sakshi@123", 75000,
				LocalDate.parse("2001-09-29"), PlanType.GOLD));
		customersList.add(new Customer("John", "Doe", "johndoe@example.com", "p@ssw0rd", 75000,
				LocalDate.parse("1990-05-15"), PlanType.GOLD));
		customersList.add(new Customer("Jane", "Smith", "janesmith@example.com", "securePW123", 50000,
				LocalDate.parse("1985-11-20"), PlanType.SILVER));
		customersList.add(new Customer("Michael", "Johnson", "michaelj@example.com", "myPassword123", 125000,
				LocalDate.parse("1978-09-10"), PlanType.PLATINUM));
		customersList.add(new Customer("Emily", "Brown", "emilyb@example.com", "password1234", 90000,
				LocalDate.parse("1982-03-25"), PlanType.GOLD));
		customersList.add(new Customer("David", "Lee", "davidlee@example.com", "abc123XYZ", 60000,
				LocalDate.parse("1995-07-30"), PlanType.SILVER));
		customersList.add(new Customer("Sarah", "Wilson", "sarahw@example.com", "sarahsPass", 85000,
				LocalDate.parse("1989-01-08"), PlanType.GOLD));
		customersList.add(new Customer("Chris", "Martinez", "chrism@example.com", "cMartinez123", 110000,
				LocalDate.parse("1973-12-12"), PlanType.PLATINUM));
		customersList.add(new Customer("Kim", "Nguyen", "kimn@example.com", "securePassword", 70000,
				LocalDate.parse("1992-04-18"), PlanType.SILVER));
		customersList.add(new Customer("Ryan", "Garcia", "ryang@example.com", "ryan1234", 80000,
				LocalDate.parse("1987-06-05"), PlanType.GOLD));
		customersList.add(new Customer("Michelle", "Chang", "michellec@example.com", "chang567", 95000,
				LocalDate.parse("1980-08-22"), PlanType.PLATINUM));

	}
}
