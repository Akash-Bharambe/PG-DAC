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
				boolean mangoFound = false;
				for (Fruits f : fruits) {
					if (f instanceof Mango) {
						mangoFound = true;
						System.out.println(f.taste());
						break;
					}
				}
				if (!mangoFound) {
					System.out.println("Cannot taste, add mangoes");
				}
				break;
			case 6:
				boolean appleFound = false;
				for (Fruits f : fruits) {
					if (f instanceof Apple) {
						appleFound = true;
						System.out.println(f.taste());
						break;
					}
				}
				if (!appleFound) {
					System.out.println("Cannot taste, add Apple");
				}
				break;
			case 7:
				boolean orangeFound = false;
				for (Fruits f : fruits) {
					if (f instanceof Orange) {
						orangeFound = true;
						System.out.println(f.taste());
						break;
					}
				}
				if (!orangeFound) {
					System.out.println("Cannot taste, add Oranges");
				}
				break;
			case 8:
				boolean mangoPulpExtracted = false;
				for (Fruits f : fruits) {
					if (f instanceof Mango) {
						mangoPulpExtracted = true;
						Mango mango = (Mango) f;
						System.out.println(mango.pulp());
						break;
					}
				}
				if (!mangoPulpExtracted) {
					System.out.println("Cannot extract pulp, add mangoes");
				}
				break;
			case 9:
				boolean orangeJuiceMade = false;
				for (Fruits f : fruits) {
					if (f instanceof Orange) {
						orangeJuiceMade = true;
						Orange orange = (Orange) f;
						System.out.println(orange.juice());
						break;
					}
				}
				if (!orangeJuiceMade) {
					System.out.println("Cannot make juice, add oranges");
				}
				break;

			case 10:
				boolean appleJamMade = false;
				for (Fruits f : fruits) {
					if (f instanceof Apple) {
						appleJamMade = true;
						Apple apple = (Apple) f;
						System.out.println(apple.jam());
						break;
					}
				}
				if (!appleJamMade) {
					System.out.println("Cannot make jam, add apples");
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
