package sets;

import java.util.Set;
import java.util.TreeSet;

public class TestTreeSet1 {

	public static void main(String[] args) {
		// create empty LinkedHashSet
		Set<String> stringSet = new TreeSet<>();// size=0,
		// init capa=16 , load factor=0.75
		// populate the HashSet from the array
		String[] strings = { "one", "two", "three", "one", "three", "four", "five", "six" };
		// Collections.addAll(stringSet, strings);
		for (String s : strings)
			System.out.println("Added " + stringSet.add(s));	//JVM uses TimSort --will invoke internally 
		//String's compareTo --asc order.
		System.out.println(stringSet);
		
	}

}
