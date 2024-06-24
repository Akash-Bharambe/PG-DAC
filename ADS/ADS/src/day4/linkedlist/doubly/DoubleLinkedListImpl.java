package day4.linkedlist.doubly;

import java.util.Iterator;

public class DoubleLinkedListImpl<T> implements DoublyLinkedList<T> {

	private Node<T> head;
	private Node<T> tail;
	private int size;

	public DoubleLinkedListImpl() {
		head = null;
		tail = null;
		size = 0;
	}

	@Override
	public Iterator<Node<T>> iterator() {
		return new Iterator<DoublyLinkedList.Node<T>>() {

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
	public void insertAtEnd(T element) {
		Node<T> node = new Node<>(element);
	
		if (head == null) {
			
		}
		tail.next = node;
		tail = node;
	
	}

	@Override
	public void insertAtStart(T element) {
		// TODO Auto-generated method stub

	}

	@Override
	public void insertAtPosition(int pos, T element) {
		// TODO Auto-generated method stub

	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public void reverseList() {
		// TODO Auto-generated method stub

	}

	@Override
	public T deleteAtEnd() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T deleteAtStart() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T deleteAtPosition(int pos) {

		return null;
	}

}
