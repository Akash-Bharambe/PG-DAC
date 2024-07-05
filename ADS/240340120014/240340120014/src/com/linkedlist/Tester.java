package com.linkedlist;

import java.util.Scanner;

public class Tester {

	private static Scanner scanner;

	static {
		scanner = new Scanner(System.in);
	}

	private static int menuList() {
		System.out.println();
		System.out.println("0. EXIT");
		System.out.println("1. Add Node");
		System.out.println("2. Check Palindrome");
		System.out.println("3. Display Reverse");
		System.out.println("4. Size");
		System.out.println("5. Display List");
		System.out.println("6. Delete Node From End");
		System.out.print("Enter Choice: ");
		return scanner.nextInt();
	}

	public static void main(String[] args) {

		LinkedList list = new SinglyLinkedList();

		for (int i = 1; i <= 5; i++) {
			list.add(i * 10);
		}

		for (int i = 6; i >= 1; i--) {
			list.add(i * 10);
		}

		int choice;
		while ((choice = menuList()) != 0) {
			try {

				switch (choice) {
				case 1:
					System.out.print("Enter a number: ");
					list.add(scanner.nextInt());
					break;

				case 2:
					list.printList();
					System.out.print(" isPalindrome: ");
					System.out.println(list.isPalindrome() ? " YES " : " NO ");
					break;

				case 3:
					list.displayReverse();
					break;

				case 4:
					System.out.println("Size of Linked List is " + list.size());
					break;

				case 5:
					list.printList();
					break;

				case 6:
					System.out.println(list.deleteAtEnd() + " deleted ");
					break;

				default:
					System.out.println("Please Enter a Valid Choice...!!!");
					break;
				}
			} catch (RuntimeException e) {
				System.out.println(e.getMessage());
			}
		}

	}

}
