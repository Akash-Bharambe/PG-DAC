package iterators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class TestListIterator {

	public static void main(String[] args) {
		// create empty AL to store integers
		ArrayList<Integer> list = new ArrayList<>();// size=0, init capa=10
		int[] data = { 10, 2, 3, 4, -10, 2, 0, 2, 3, 111, 234, 50, 2 };
		// populate AL with above data
		for (int i : data)
			list.add(i);// auto boxing --append
		System.out.println("List contents via toString -" + list);
		//display list contents in reverse order by attaching ListIterator
		ListIterator<Integer> litr=list.listIterator(list.size());
		System.out.println("List contents in reverse order using ListItr -" + list);
		while(litr.hasPrevious())
			System.out.println(litr.previous());
	
	}

}
