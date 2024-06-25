package day4.linkedlist.doubly;

import java.util.Iterator;

public class DoubleLinkedListImpl<T extends Number & Comparable<T>> implements DoublyLinkedList<T> {

	private Node<T> head;
	private int size;

	public DoubleLinkedListImpl() {
		head = null;
		size = 0;
	}

	@Override
	public Iterator<Node<T>> iterator() {
		return new Iterator<DoublyLinkedList.Node<T>>() {

			private Node<T> current = head;
//			private boolean flag = false;

			@Override
			public boolean hasNext() {
				return current != null;
			}

			@Override
			public Node<T> next() {
				Node<T> node = current;
//				flag = true;
				current = current.next;
				return node;
			}
		};
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public void insert(T element) {
		Node<T> newNode = new Node<>(element);
		Node<T> current = head;

		if (isEmpty()) {
			head = newNode;
		} else if (head.next == null && head.value.compareTo(element) > 0) {
			newNode.next = head;
			head.prev = newNode;
			head = newNode;
		} else {

			while (current.next != null && current.next.value.compareTo(element) < 0) {
				current = current.next;
			}

			if (current.prev == null && current.value.compareTo(element) > 0) {
				current.prev = newNode;
				newNode.next = head;
				head = newNode;
			} else if (current.next != null) {
				newNode.next = current.next;
				newNode.prev = current;
				current.next = newNode;
				newNode.next.prev = newNode;
			} else {
				current.next = newNode;
			}
		}

	}

	@Override
	public void reverseList() {
		Node<T> current = head;
		Node<T> prev = null;
		
		while(current != null){
			
		    prev = current.prev;
		    current.prev = current.next;
		    current.next = prev;
		    current = current.prev;
		}
		head = prev.prev;
	}

	@Override
	public T delete(T element) {
		Node<T> current = head;
		T value = null;

		if (isEmpty()) {
			throw new RuntimeException("Empty");
		}

		if (head.value.compareTo(element) == 0) {
			value = head.value;
			if (head.next != null) {
				head.next.prev = null;
				head = head.next;
				return value;
			}
			head = null;
		} else {
			while (current.next != null) {
				if (current.next.value.compareTo(element) == 0) {
					if (current.next.next != null) {
						current.next.next.prev = current;
						current.next = current.next.next;
					} else {
						current.next = null;
					}
					return value;
				}
				current = current.next;
			}
		}
		throw new RuntimeException("Not Found");

	}

	@Override
	public boolean isEmpty() {
		return head == null;
	}

}
