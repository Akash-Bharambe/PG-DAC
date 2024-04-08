package com.tester;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.stack.FixedStack;
import com.stack.GrowableStack;

public class Program {

	private static Scanner scanner = new Scanner(System.in);
	private static FixedStack fixedStack = new FixedStack();
	private static GrowableStack growableStack = new GrowableStack();

	private static int menuList() {
		int ch = 1;
		System.out.println("0. EXIT");
		System.out.println("1. Growable Array");
		System.out.println("2. Fixed Array");
		try {
			ch = scanner.nextInt();
		} catch (InputMismatchException e) {
			System.out.println(e.toString()+": Selecting Growable Stack...");
		}
		return ch;
	}

	public static void main(String[] args) {

		int ch;

		while ((ch = menuList()) != 0) {
			switch (ch) {
			case 1:
				GrowableStackTest.growableStackMethod(growableStack);
				break;
			case 2:
				FixedStackTest.fixedStackMethod(fixedStack);
			default:
				System.out.println("Enter Valid Input...!!!");
				break;
			}
		}

	}

}
