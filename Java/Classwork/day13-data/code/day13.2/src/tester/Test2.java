package tester;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

import static utils.GenericUtils.printElements;

public class Test2 {

	public static void main(String[] args) {
		
		Object o="hello";//up casting 
		ArrayList<String> strings=new ArrayList<>();
		strings.add("one");
		strings.add("two");
		strings.add("three");
		// print elems from the AL<String>
		printElements(strings);
		/*
		 * Even though , Object is a super class of String ,
		 * Collection<Object> IS NOT a super type of Collection<String>
		 * Implies NO flexibility .
		 * Why - By default generic types are - invariant
		 * To achieve the flexibility -- use wild card notation in generics
		 * ? : un known type (=> can be replaced by ANY type)
		 * It grants : un restricted flexibility.
		 */
		//HS<Double>
		HashSet<Double> hs=
				new HashSet<>(Arrays.asList(1.2,3.0,4.55,5.0,5.7,1.2));
//		System.out.println(hs);
//		hs.add(3.4567);
//		System.out.println(hs);
		printElements(hs);
		
		

	}

}
