package com.app.tester;

import java.util.Scanner;
import com.app.fruits.*;

public class FruitBasket {
	private static Scanner scanner = new Scanner(System.in);

	public static int menuList() {
		System.out.println();
		System.out.println("0. EXIT");
		System.out.println("1. Add Mango");
		System.out.println("2. Add Apple");
		System.out.println("3. Add Orange");
		System.out.println("4. Display Basket");
		System.out.println("5. Taste Mango");
		System.out.println("6. Taste Apple");
		System.out.println("7. Taste Orange");
		System.out.println("8. Extract Mango Pulp");
		System.out.println("9. Make Apple Jam");
		System.out.println("10. Make Orange Juice");
		System.out.println("11. Make Fruits Stale");
		System.out.println("12. Make Stale Fruits Sour");
		System.out.print("Enter Choice: ");
		return scanner.nextInt();
	}

	public static void main(String[] args) {
		int choice;
		int counter = 0;

		System.out.print("How many Fruits to add: ");
		int total = scanner.nextInt();
		Fruits[] fruits = new Fruits[total];
		while ((choice = menuList()) != 0) {
			switch (choice) {
			case 1:
				if (counter < total) {
					System.out.print("How many KG of Mangoes to add: ");
					fruits[counter] = new Mango(scanner.nextInt());
					counter++;
				} else {
					System.out.println("Basket Full");
				}
				break;
			case 2:
				if (counter < total) {
					System.out.print("How many KG of Apples to add: ");
					fruits[counter] = new Apple(scanner.nextInt());
					counter++;
				} else {
					System.out.println("Basket Full");
				}
				break;
			case 3:
				if (counter < total) {
					System.out.print("How many KG of Orange to add: ");
					fruits[counter] = new Orange(scanner.nextInt());
					counter++;
				} else {
					System.out.println("Basket Full");
				}
				break;
			case 4:
				for (Fruits f : fruits)
					if (f != null)
						System.out.println(f);
				break;
			case 5:
				for (Fruits f : fruits)
					if (f instanceof Mango) {
						System.out.println(f.taste());
						break;
					} else {
						System.out.println("Cannot taste, add mangoes");
						break;
					}
				break;
			case 6:
				for (Fruits f : fruits)
					if (f instanceof Apple) {
						System.out.println(f.taste());
						break;
					} else {
						System.out.println("Cannot taste, add Apple");
						break;
					}
				break;
			case 7:
				for (Fruits f : fruits)
					if (f instanceof Orange) {
						System.out.println(f.taste());
						break;
					} else {
						System.out.println("Cannot taste, add Orange");
						break;
					}
				break;
			case 8:
				for (Fruits f : fruits) {
					if (f instanceof Mango) {
						Mango mango = (Mango) f;
						System.out.println(mango.pulp());
						break;
					} else {
						System.out.println("Cannot Pulp, add mangoes");
						break;
					}
				}
				break;
			case 9:
				for (Fruits f : fruits) {
					if (f instanceof Orange) {
						Orange orange = (Orange) f;
						System.out.println(orange.juice());
						break;
					} else {
						System.out.println("Cannot make juice, add oranges");
						break;
					}
				}
				break;
			case 10:
				for (Fruits f : fruits) {
					if (f instanceof Apple) {
						Apple apple = (Apple) f;
						System.out.println(apple.jam());
						break;
					} else {
						System.out.println("Cannot make jam, add apples");
						break;
					}
				}
				break;
			case 11:
				System.out.println("Enter which index to make stale");
				int stale = scanner.nextInt();
				if (stale >= 0 && stale < total && fruits[stale] != null) {
					fruits[stale].setFresh(false);
					System.out.println("Fruit Stale Status: " + !fruits[stale].isFresh());
				} else {
					System.out.println("Fruit Not Present in Basket at Specified index");
				}
				break;
			case 12:
				for (Fruits f : fruits) {
					if (f != null) {
						if (f.taste().equalsIgnoreCase("sour")) {
							f.setFresh(false);
							System.out.println("Sour fruits are Stale");
						}
					}
				}
				break;
			default:
				System.out.println("Please Enter a valid Input...!!!");
				break;
			}
		}

	}

}
