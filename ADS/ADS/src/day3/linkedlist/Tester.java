package day3.linkedlist;

import day3.linkedlist.LinkedList.Node;

public class Tester {

	public static void main(String[] args) {

		LinkedList<Integer> nums = new LinkedListImpl<Integer>();

		for (int i = 1; i <= 10; i++) {
			nums.insertAtEnd(i * 10);
		}

		nums.insertAtStart(123);
		
		nums.reverseList();
		
		for (Node<Integer> node : nums) {
			System.out.print(node.getValue() + " ");
		}

//		for (Node<Integer> node : nums) {
//			System.out.print(node.getValue() + " ");
//		}

//		Stream.of(nums).forEach(System.out::println);
	}

}
