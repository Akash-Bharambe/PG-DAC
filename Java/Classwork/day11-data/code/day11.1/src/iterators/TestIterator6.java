package iterators;

import java.util.ArrayList;
import java.util.Iterator;

public class TestIterator6 {

	public static void main(String[] args) {
		// create empty AL to store integers
		ArrayList<Integer> list = new ArrayList<>();// size=0, init capa=10
		int[] data = { 10, 2, 3, 4, -10, 2, 0, 2, 3, 111, 234, 50, 2 };
		// populate AL with above data
		for (int i : data)
			list.add(i);// auto boxing --append
		System.out.println("List contents via toString -" + list);
		//display list contents by attaching Iterator
		Iterator<Integer> itr=list.iterator();
		list.add(12345);	
		itr=list.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
	
		
		
		
	
	}

}
