package sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class TestLinkedHashSet {

	public static void main(String[] args) {
		// create empty LinkedHashSet
		Set<String> stringSet = new LinkedHashSet<>();// size=0,
		// init capa=16 , load factor=0.75
		// populate the HashSet from the array
		String[] strings = { "one", "two", "three", "one", "three", "four", "five", "six" };
		// Collections.addAll(stringSet, strings);
		for (String s : strings)
			System.out.println("Added " + stringSet.add(s));	
		System.out.println(stringSet);
		
	}

}
