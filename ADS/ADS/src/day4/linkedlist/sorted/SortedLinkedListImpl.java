package day4.linkedlist.sorted;

import java.util.Iterator;

public class SortedLinkedListImpl<T extends Number & Comparable<T>> implements SortedLinkedList<T> {

	private Node<T> head;
	private int size;

	public SortedLinkedListImpl() {
		head = null;
		size = 0;
	}

	@Override
	public Iterator<Node<T>> iterator() {

		return new Iterator<SortedLinkedList.Node<T>>() {

			private Node<T> current = head;

			@Override
			public boolean hasNext() {
				return current != null;
			}

			@Override
			public Node<T> next() {
				Node<T> node = current;
				current = current.next;
				return node;
			}
		};
	}

	@Override
	public void insert(T element) {
		Node<T> current = head;
		Node<T> newNode = new Node<>(element);

		if (head == null) {
			head = newNode;

		} else if (head.value.compareTo(element) > 0) {
			newNode.next = head;
			head = newNode;
		} else {
			while (current.next != null && current.next.value.compareTo(element) < 0) {
				current = current.next;
			}
			if (current.next != null) {
				newNode.next = current.next;
				current.next = newNode;
			} else {
				current.next = newNode;
			}
		}
		size++;
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public T delete(T num) {
		T value = null;

		if (head != null && head.value.equals(num)) {
			value = head.value;
			head = head.next;
			size--;
		}

		Node<T> current = head;

		while (current != null && current.next != null) {
			if (current.next.value.equals(num)) {
				value = current.next.value;
				current.next = current.next.next;
				size--;
			} else if (current.next.value.compareTo(num) > 0) {
				break;
			} else {
				current = current.next;
			}
		}
		return value;
	}

	@Override
	public void reverseList() {
		Node<T> current = head;
		Node<T> prevNode = null;
		Node<T> nextNode = null;
		
		while (current!= null) {
			nextNode = current.next;
			current.next = prevNode;
			
			prevNode = current;
			current= nextNode;
		}
		head = prevNode;
	}

}
