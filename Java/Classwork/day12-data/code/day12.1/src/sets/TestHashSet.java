package sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestHashSet {

	public static void main(String[] args) {
		// create empty HashSet
		Set<String> stringSet = new HashSet<>();// size=0,
		// init capa=16 , load factor=0.75
		// populate the HashSet from the array
		String[] strings = { "one", "two", "three", "one", "three", "four", "five", "six" };
		// Collections.addAll(stringSet, strings);
		for (String s : strings)
			System.out.println("Added " + stringSet.add(s));
		// display the HashSet : toString of HS
		System.out.println(stringSet);

		// check for dups , sorting / ordering ??? -- no dups , un ordered n un sorted
		// set
		// check if specific element exists ? - "three"
		System.out.println("set contains three "+stringSet.contains("Three"));
		// remove an element (three) from the HS (HashSet) n 
		//display the set by attaching
		// Iterator
		System.out.println("removed "+stringSet.remove("three"));
		System.out.println("String Set : via Iterator");
		Iterator<String> stringItr=stringSet.iterator();
		while(stringItr.hasNext())
			System.out.println(stringItr.next());
	}

}
