package sets;

import java.util.Set;
import java.util.TreeSet;

import custom_ordering.StringDescComparator;

public class TestTreeSet2 {

	public static void main(String[] args) {
		// create empty TreeSet
		Set<String> stringSet = 
				new TreeSet<>(new StringDescComparator());// size=0,
		// init capa=16 , load factor=0.75
		System.out.println(stringSet);
		// populate the HashSet from the array
		String[] strings = { "one", "two", "three", "one", "three", "four", "five", "six" };
		// Collections.addAll(stringSet, strings);
		for (String s : strings)
			System.out.println("Added " + stringSet.add(s));	
		//JVM uses TimSort --will invoke internally 
		// StringDescComparator's compare--desc order.
		System.out.println(stringSet);
		
	}

}
