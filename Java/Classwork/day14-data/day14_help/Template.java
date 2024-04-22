package tester;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// init
			boolean exit = false;
			int counter = 0;
			while (!exit) {
				System.out.println("Options : ");
				try {
					switch (sc.nextInt()) {
					case 1:

						break;

					case 10:
						exit = true;
						break;
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				// read off all pending tokens from the scanner : till new line
				sc.nextLine();

			}
		}
	}
}
