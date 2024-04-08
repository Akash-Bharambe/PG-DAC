package com.tester;

import java.util.Scanner;

import com.stack.FixedStack;
import com.stack.GrowableStack;

public class Program {

	private static Scanner scanner = new Scanner(System.in);
	private static FixedStack fixedStack = new FixedStack();
	private static GrowableStack growableStack = new GrowableStack();

	private static int menuList() {
		System.out.println("0. EXIT");
		System.out.println("1. Growable Array");
		System.out.println("2. Fixed Array");
		return scanner.nextInt();
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
				break;
			}
		}

	}

}
