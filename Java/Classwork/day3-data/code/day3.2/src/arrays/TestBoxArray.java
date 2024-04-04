package arrays;

/*
 * 1. Ask user(client) , to place the order size (i.e how many boxes to make )
Accept individual Box dims n display box dims n volume from a single for-each loop.

 */
import java.util.Scanner;

import com.cdac.core.Box;

public class TestBoxArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many boxes to make ?");
		Box[] boxes = new Box[sc.nextInt()];// 1 array object
		for(Box b : boxes)
			System.out.println(b);
		for (int i = 0; i < boxes.length; i++) {
			System.out.println("Enter box dims");
			boxes[i] = new Box(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
		}
		System.out.println("Display dims n vol");
		for(Box b : boxes)
		{
			System.out.println(b);
			System.out.println(b.getBoxDimensions());
			System.out.println("vol "+b.getVolume());
		}

		sc.close();

	}

}
