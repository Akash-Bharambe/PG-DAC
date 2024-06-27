package day4.linkedlist.sorted;

import day4.linkedlist.sorted.SortedLinkedList.Node;

public class Tester {

	
	public static void main(String[] args) {
		
		SortedLinkedList<Integer> list = new SortedLinkedListImpl<>();
		
		list.insert(10);
		list.insert(5);
//		list.insert(20);
//		list.insert(15);
//		list.insert(13);
		list.insert(13);
//		list.insert(40);
		
		list.delete(13);
		
		for (Node<Integer> node : list) {
			System.out.print(node+" ");
		}
		System.out.println();
		
		list.reverseList();
		
		for (Node<Integer> node : list) {
			System.out.print(node+" " );
		}
		
	}
}
