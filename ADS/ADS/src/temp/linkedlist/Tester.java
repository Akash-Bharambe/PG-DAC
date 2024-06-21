package temp.linkedlist;

import temp.linkedlist.LinkedList.Node;

public class Tester {

	public static void main(String[] args) {

		LinkedList<Integer> nums = new LinkedListImpl<Integer>();

		for (int i = 1; i <= 10; i++) {
			nums.insertAtEnd(i * 10);
		}
		nums.insertAtStart(123);
		nums.insertAtEnd(50);

		for (Node<Integer> node : nums) {
			System.out.print(node.getValue() + " ");
		}
		
		nums.insertAtPosition(3, 1);
//		Stream.of(nums).forEach(System.out::println);
	}

}
