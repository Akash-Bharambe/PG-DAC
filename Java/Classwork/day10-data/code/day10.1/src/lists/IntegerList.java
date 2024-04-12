package lists;

import java.util.ArrayList;

public class IntegerList {

	public static void main(String[] args) {
		// create empty AL to store integers
		ArrayList<Integer> list = new ArrayList<>();// size=0, init capa=10
		int[] data = { 10, 2, 3, 4, -10, 2, 0, 2, 3, 111, 234, 50, 2 };
		// populate AL with above data
		for (int i : data)
			list.add(i);// auto boxing --append
		System.out.println("List contents via toString -" + list);
		list.add(0, 999);
		System.out.println("List contents after insert  -" + list);
		// display elems using for-each
		System.out.println("List contents via for-each");
		for (int i : list) // auto unboxing
			System.out.println(i);
		// check if "3" exists in the list
		System.out.println(list.contains(3) ? "YES" : "NO");// internally invokes
		// equals method of Integer class
		System.out.println(list.indexOf(2) + " " + list.lastIndexOf(2));
		System.out.println("size " + list.size());
		// remove 5th element n display list again
		System.out.println("Removed " + list.remove(5));
		System.out.println("List contents after remove  -" + list);
		// replace last elem by it's double value
		System.out.println("Replaced elem " + list.set(list.size() - 1, 
				list.get(list.size() - 1)*2));
		System.out.println("List contents after replace  -" + list);

	}

}
