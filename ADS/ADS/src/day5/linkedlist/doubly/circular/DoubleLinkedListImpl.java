package day5.linkedlist.doubly.circular;

import java.util.Iterator;

public class DoubleLinkedListImpl<T extends Number & Comparable<T>> implements DoublyCircularList<T> {

	private Node<T> head;
	private int size;

	public DoubleLinkedListImpl() {
		head = null;
		size = 0;
	}

	@Override
	public Iterator<Node<T>> iterator() {
		return new Iterator<DoublyCircularList.Node<T>>() {

			private Node<T> current = head;
			private boolean flag = false;

			@Override
			public boolean hasNext() {
				return (!flag || current != head) && head != null;
			}

			@Override
			public Node<T> next() {
				Node<T> node = current;
				flag = true;
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
			head.prev = head;
			head.next = head;
		} else if (head.value.compareTo(element) > 0) {
			newNode.next = head;
			newNode.prev = head.prev;
			head.prev.next = newNode;
			head.prev = newNode;
			head = newNode;
		} else {

			while (current.next != head && current.next.value.compareTo(element) < 0) {
				current = current.next;
			}

			newNode.prev = current;
			newNode.next = current.next;
			current.next.prev = newNode;
			current.next = newNode;

		}

	}

	@Override
	public void reverseList() {
//		Node<T> current = head;
//		Node<T> prev = null;
//
//		while (current != null) {
//
//			prev = current.prev;
//			current.prev = current.next;
//			current.next = prev;
//			current = current.prev;
//		}
//		head = prev.prev;
	}

	@Override
	public T delete(T element) {
		Node<T> current = head;
		boolean started = false;
		T value = null;

		if (isEmpty()) {
			throw new RuntimeException("Empty");
		}

		if (head.value.equals(element)) {
			value = head.value;
			if (head.next != head) {
				head.next.prev = head.prev;
				head.prev.next = head.next;
				head = head.next;
				return value;
			}
			head = null;
		} else {
			while (!started || current != head) {
				started = true;
				if (current.value.equals(element)) {
					value = current.value;
					current.prev.next = current.next;
					current.next.prev = current.prev;
					return value;
				}
				current = current.next;
			}
		}
		return null;
	}

	@Override
	public boolean isEmpty() {
		return head == null;
	}

	@Override
	public T deleteAll(T element) {
		T value = null;

		while (head != null && head.value.equals(element)) {
			value = head.value;

			if (head.next == head) {
				head = null;
				continue;
			}
			head.prev.next = head.next;
			head.next.prev = head.prev;
			head = head.next;

			size--;
		}
		if (isEmpty()) {
			return value;
		}

		Node<T> current = head;
		boolean started = false;

		while (!started || current != head) {
			started = true;
			if (current.value.equals(element)) {
				value = current.value;
				current.prev.next = current.next;
				current.next.prev = current.prev;

				size--;

			}
			current = current.next;
		}
		return value;
	}
}
