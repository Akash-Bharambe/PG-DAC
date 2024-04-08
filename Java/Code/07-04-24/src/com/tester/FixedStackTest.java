package com.tester;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.stack.FixedStack;

public class FixedStackTest{
	private static Scanner scanner = new Scanner(System.in);

	private static int menuList() {
		int ch = 1;
		System.out.println();
		System.out.println("0. Back");
		System.out.println("1. Push");
		System.out.println("2. Pop");
		try {
			ch = scanner.nextInt();
		} catch (InputMismatchException e) {
			System.out.println(e.toString()+": Pushing...");
		}
		return ch;

	}

	public static void fixedStackMethod(FixedStack fixedStack) {
		int ch;
		System.out.println();
		System.out.println("Fixed Stack");
		while ((ch = menuList()) != 0) {
			switch (ch) {
			case 1:
				fixedStack.push();
				break;
			case 2:
				fixedStack.peep();
				fixedStack.pop();
				break;
			default:
				System.out.println("Enter Valid Input...!!!");
				break;
			}
		}
	}
}
