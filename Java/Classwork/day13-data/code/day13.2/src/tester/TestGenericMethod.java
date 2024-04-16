package tester;

import java.util.Arrays;
import java.util.List;

public class TestGenericMethod {

	public static void main(String[] args) {
		// create a fixed size List<Integer> : 10 , 20 ,30 ,40 50
		// Rets FIXED size list
		List<Integer> intList = Arrays.asList(10, 20, 30, 40, 50);
		System.out.println(intList);
		// intList.add(60); exc
		// intList.remove(0); exc
		intList.set(0, 9999);
		System.out.println(intList);
		// create a fixed size List<Double> : 10 , 20 ,30 ,40 50
		List<Double> dbleList = Arrays.asList(10.0, 20.7, 30.0, 40.67, 50.5);
		System.out.println(dbleList);
	}

}
