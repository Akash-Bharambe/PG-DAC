package com.linkedlist;

public interface LinkedList extends Iterable<LinkedList.Node> {

	class Node {
		Node next;
		Integer data;

		public Node(Integer data) {
			this.next = null;
			this.data = data;
		}

		public Node() {
			this.next = null;
			this.data = null;
		}

		@Override
		public String toString() {
			return data + "";
		}

	}

	void add(int value);

	boolean isPalindrome();

	void displayReverse();

	int size();

	boolean isEmpty();

	int sizeOfLinkedList();

	void printList();

	int deleteAtEnd();
}
