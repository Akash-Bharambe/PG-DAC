package p2;

import java.util.Collections;
import java.util.List;

public class TestStatticMethod {

	public static void main(String[] args) {
		// create un modifiable(immutable) List : 10,20,30,40,50
		List<Integer> intList = List.of(10, 20, 30, 40, 50);
		System.out.println(intList);
//		intList.add(1234);
//		intList.remove(0);
//		Collections.shuffle(intList);
//		intList.set(0, 1234);
		System.out.println(intList);

	}

}
