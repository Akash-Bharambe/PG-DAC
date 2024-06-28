package day5.linkedlist.doubly.circular;

import day5.linkedlist.doubly.circular.DoublyCircularList.Node;

public class Tester {

	public static void main(String[] args) {
		DoublyCircularList<Integer> list = new DoubleLinkedListImpl<Integer>();

		list.insert(0);
		list.insert(4);
		list.insert(2);
		list.insert(2);
		list.insert(2);
		
		
		list.deleteAll(2);
		list.delete(4);
		list.deleteAll(2);

		for (Node<Integer> node : list) {
			System.out.print(node + " ");
		}
		System.out.println();
//		list.reverseList();
//		for (Node<Integer> node : list) {
//			System.out.print(node + " ");
//		}

	}

}
