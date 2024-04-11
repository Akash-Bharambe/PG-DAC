package com.vehicle.tester;

import java.time.LocalDate;
import java.util.Scanner;
import static com.vehicle.exception.ValidationRules.*;

public class Program {

	public static int menuList() {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("0. EXIT");
			System.out.println("1. Validate Speed");
			System.out.println("2. Validate Fuel");
			System.out.println("3. Validate License");
			System.out.print("Enter Choice: ");
			return scanner.nextInt();
		}
	}

	public static void main(String[] args) {
		int ch;
		try (Scanner scanner = new Scanner(System.in)) {
			while ((ch = menuList()) != 0) {
				try {
					switch (ch) {
					case 1:
						System.out.print("Enter Speed: ");
						validateSpeed(scanner.nextInt());
						break;
					case 2:
						System.out.print("Enter Fuel: ");
						validateFuel((scanner.next()).toLowerCase());
						break;
					case 3:
						System.out.print("Enter Expiry Date of License in format yyyy mm dd ");
						validateDate(LocalDate.of(scanner.nextInt(), scanner.nextInt(), scanner.nextInt()));
						break;

					default:
						System.out.println("Please Enter Valid Input");
						break;
					}
				} catch (RuntimeException e) {
					System.out.println(e.getMessage());
				}
			}
		}

	}

}
