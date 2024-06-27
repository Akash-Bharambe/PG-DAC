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
				return !flag && current != head;
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
			System.out.println("empty if");
			head = newNode;
			head.prev = head;
			head.next = head;
		} else if (head.value.compareTo(element) > 0) {
			System.out.println("empty else if");
			newNode.next = head;
			newNode.prev = head.prev;
			head.prev = newNode;
			head = newNode;
		} else {

			while (current.next != head && current.next.value.compareTo(element) < 0) {
				System.out.println("while");
				current = current.next;
			}

//			if (current.prev == null && current.value.compareTo(element) > 0) {
//				current.prev = newNode;
//				newNode.next = head;
//				head = newNode;
//			} else 
			if (current.value.compareTo(element) < 0) {
				System.out.println("if");
				newNode.next = current.next;
				newNode.prev = current;
				current.next = newNode;
				newNode.next.prev = newNode;
			}else {
				System.out.println("else");
				newNode.prev = current;
				newNode.next = current.next;
				current.next.prev = newNode;
				current.next = newNode;
			}
		}

	}

	@Override
	public void reverseList() {
		Node<T> current = head;
		Node<T> prev = null;

		while (current != null) {

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
			head = head.next;
			if (head != null)
				head.prev = null;

			size--;
		}

		Node<T> current = head;

		while (current != null) {
			if (current.value.equals(element)) {
				value = current.value;
				current.prev.next = current.next;
				if (current.next != null) {
					current.next.prev = current.prev;
				}
				size--;

			}
			current = current.next;
		}
		return value;
	}
}
