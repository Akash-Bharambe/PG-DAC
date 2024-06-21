package day2.stack;

import java.util.Iterator;


public class Tester {
	public static void main(String[] args) {
		Stackk<Integer> stackk = new Stackk<>(Integer.class, 10);

		for (int i = 0; i < 100; i++) {
			stackk.push(i);
		}

		Iterator<Integer> it = stackk.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("Popped: "+stackk.pop());
		System.out.println("Popped: "+stackk.pop());
		System.out.println("Popped: "+stackk.pop());
		System.out.println("Popped: "+stackk.pop());
		System.out.println("Popped: "+stackk.pop());
		System.out.println(stackk);
		System.out.println("Top: "+ stackk.peek());
		System.out.println("Size: " + stackk.size());
	}
}
