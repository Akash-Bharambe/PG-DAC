package day4.linkedlist.doubly;

import day4.linkedlist.doubly.DoublyLinkedList.Node;

public class Tester {

	public static void main(String[] args) {
		DoublyLinkedList<Integer> list = new DoubleLinkedListImpl<Integer>();

		list.insert(0);
		list.insert(4);
		list.insert(2);
		list.insert(10);
		list.insert(5);
		list.insert(1);
		list.insert(8);
		list.insert(-10);
		list.insert(50);
		list.insert(-1);

		list.delete(0);
		list.delete(50);

		for (Node<Integer> node : list) {
			System.out.print(node + " ");
		}
		System.out.println();
		list.reverseList();
		for (Node<Integer> node : list) {
			System.out.print(node + " ");
		}

	}

}
