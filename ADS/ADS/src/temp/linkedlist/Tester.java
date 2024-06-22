package temp.linkedlist;

import java.util.Iterator;

import temp.linkedlist.LinkedList.Node;

public class Tester {

	public static void main(String[] args) {

		LinkedList<Integer> nums = new LinkedListImpl<Integer>();

		for (int i = 1; i <= 10; i++) {
			nums.insertAtEnd(i * 10);
		}

		nums.insertAtStart(123);
//		nums.insertAtEnd(50);
//		nums.insertAtPosition(20, 1);
//		nums.insertAtPosition(3, 1);
//		nums.insertAtPosition(5, 1);
//		nums.deleteAtEnd();
		
		Integer integer = nums.deleteAtPosition(3);
		System.out.println("Deleted Value: "+integer);
		
//		for (Node<Integer> node : nums) {
//			System.out.print(node.getValue() + " ");
//		}
		System.out.println();
		
		Iterator<Node<Integer>> iterator = nums.iterator();
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			
		}

//		for (Node<Integer> node : nums) {
//			System.out.print(node.getValue() + " ");
//		}

//		Stream.of(nums).forEach(System.out::println);
	}

}
