package com.fruits;

import java.util.Scanner;

enum CHOICE {
	EXIT, MANGO, APPLE, ORANGE, DISPLAY, DISPLAYALL, MARKSTALE, CHKSTALE, GETPULP, GETJAM, GETJUICE;
}

public class Fruitbasket {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many Fruits you want to Enter ::");
		int total = sc.nextInt();
		Fruits[] fruits = new Fruits[total];
		CHOICE choice;
		int counter = 0;
		do {
			System.out.println("1. Mango \n2. Apple \n3. Orange");
			System.out.println("4. Display \n5. Display_ALL \n 6.MarkStale");
			System.out.println("7. Check_Stale \n8. Get Pulp \n9.Get Jam \n10. Get Juice \n0. Exit\n");
			int input = sc.nextInt();
			choice = CHOICE.values()[input];
			switch (choice) {
			case MANGO:
				System.out.println("How many KGs you want to buy ::");
				if (counter < total) {
					fruits[counter] = new Mango(sc.nextInt());
					counter++;
				} else {
					System.out.println("basket is full");
				}
				break;
			case APPLE:
				System.out.println("Enter how many KGs you want to Buy");
				if (counter < total) {
					fruits[counter] = new Apple(sc.nextInt());
					counter++;
				} else {
					System.out.println("Basket is Full");
				}
				break;
			case ORANGE:
				System.out.println("How many KGs you want to buy");
				if (counter < total) {
					fruits[counter] = new Orange(sc.nextInt());
					counter++;
				} else {
					System.out.println("Basket is full");
				}
				break;
			case DISPLAY:
				System.out.println("Name of Fruits available in basket are");
				for (Fruits f : fruits) {
					if (f != null) {
						System.out.println(f.getName());
					}
				}
				break;
			case DISPLAYALL:
				for (Fruits f : fruits) {
					if (f.getFresh()) {
						System.out.print(f.toString());
						System.out.println(f.taste());
					}
				}
				break;
			case MARKSTALE:
				System.out.println("Enter index of fruits you want to be stale");
				int index = sc.nextInt();
				if (index >= 0 && index <= counter) {
					fruits[index].setFresh(false);
				} else {
					System.out.println("Invalid Index");
				}
				break;
			case CHKSTALE:
				for (int i = 0; i < counter; i++) {
					if (fruits[i].taste().equals("Sour")) {
						fruits[i].setFresh(false);
						System.out.println("Fruit set to stale");
					}
				}
				break;
			case GETPULP:
				for (Fruits f : fruits) {
					if (f instanceof Mango) {
						Mango m = (Mango) f;
						m.pulp();
						break;
					} else {
						System.out.println("there's no mango to get pulp");
						break;
					}
				}
				break;
			case GETJAM:
				for (Fruits f : fruits) {
					if (f instanceof Apple) {
						Apple a = (Apple) f;
						a.jam();
						break;
					} else {
						System.out.println("no apple, get apple to get jam");
						break;
					}
				}

				break;
			case GETJUICE:
				for (Fruits f : fruits) {
					if (f instanceof Orange) {
						Orange o = (Orange) f;
						o.juice();
						break;
					} else {
						System.out.println("there's no orange to get juice");
//						break;
					}
				}
				break;
			case EXIT:
				System.out.println("Program Terminated");
				System.exit(0);
				break;
			default:
				System.out.println("Invalid case");
				break;
			}
		} while (choice != CHOICE.EXIT);
	}

}
