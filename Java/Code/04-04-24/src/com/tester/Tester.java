package com.tester;

import java.util.Scanner;

import com.developer.geometry.Point2D;

public class Tester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("How many points to create: ");

		Point2D[] points = new Point2D[sc.nextInt()];

		for (int i = 0; i < points.length; i++) {

			System.out.println("Enter x coordinates: ");
			double x = sc.nextDouble();
			System.out.println("Enter y coordinates: ");
			double y = sc.nextDouble();
			points[i] = new Point2D(x, y);

			for (int j = 0; j <= i - 1; j++) {
				if (points[i].isEqual(points[j])) {
					points[i] = null;
					System.out.println("These Coordinates already exists");
					i--;
					break;
				}
			}
		}
		for (Point2D p : points) {
			System.out.println(p.show());
		}
		sc.close();
		// Test
	}

}
