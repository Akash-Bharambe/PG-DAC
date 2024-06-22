package temp.linkedlist;

import java.util.Iterator;

import temp.linkedlist.LinkedList.Node;

public class LinkedListImpl<T> implements LinkedList<T> {

	Node<T> head;
	Node<T> tail;

	public LinkedListImpl() {
		head = null;
		tail = null;
	}

	@Override
	public void insertAtEnd(T element) {

		Node<T> node = new Node<>(element);

		// For Handling Empty LinkedList
		if (head == null) {
			head = node;
			tail = node;
		} else { // For Handling LinkedList with Data
			tail.next = node;
			tail = node;
		}
	}

	@Override
	public void insertAtStart(T element) {

		Node<T> node = new Node<>(element);

		// If LinkedList is Empty
		if (head == null) {
			head = node;
			tail = node;
		} else { // If LinkedLsit have data
			node.next = head;
			head = node;
		}
	}

	@Override
	public void insertAtPosition(int pos, T element) {
		Node<T> currentNode = head;

		if (pos <= size()) {
			// Traversing till one node before position of adding new element
			while (pos - 1 > 1) {
				currentNode = currentNode.next;
				pos--;
			}
		} else {
			currentNode = tail;
		}

		Node<T> newNode = new Node<>(element);

		// If currentNode is not End of linkedList
		if (currentNode.next != null) {
			Node<T> tempNode = currentNode.next;
			currentNode.next = newNode;
			newNode.next = tempNode;

		} else { // If current Node is End of LinkedList
			currentNode.next = newNode;
			tail = newNode;
		}

	}

	public void display() {
		Node<T> node = head;
		while (node != null) {
			System.out.println(node.value);
			node = node.next;
		}
	}

	@Override
	public T deleteAtEnd() {
		Node<T> currentNode = head;

		while (currentNode.next.next != null) {
			currentNode = currentNode.next;
		}
		T value = currentNode.next.value;
		tail = currentNode;

		return value;
	}

	@Override
	public T deleteAtStart() {
		Node<T> tempNode = head;
		head = head.next;
		return tempNode.value;
	}

	@Override
	public T deleteAtPosition(int pos) {
		Node<T> currentNode = head;
		if (pos < size()) {
			while (pos - 1 > 1) {
				currentNode = currentNode.next;
				pos--;
			}

			T value = currentNode.next.value;
			currentNode.next = currentNode.next.next;
			return value;
		} else {
			return deleteAtEnd();
		}
	}

	@Override
	public int size() {
		Node<T> currentNode = head;
		int count = 0;
		while (currentNode != null) {
			count++;
			currentNode = currentNode.next;
		}
		return count;
	}

	@Override
	public Iterator<Node<T>> iterator() {

		return new Iterator<LinkedListImpl.Node<T>>() {
			private Node<T> currentNode = head;

			@Override
			public boolean hasNext() {
				return currentNode != null;
			}

			@Override
			public Node<T> next() {
				Node<T> tempNode = currentNode;
				currentNode = currentNode.next;
				return tempNode;
			}
		};
	}

}
