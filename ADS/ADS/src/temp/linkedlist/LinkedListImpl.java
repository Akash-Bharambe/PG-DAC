package temp.linkedlist;

import java.util.Iterator;

public class LinkedListImpl<T> implements LinkedList<T> {

	Node<T> head;

	public LinkedListImpl() {
		head = new Node<>();
	}

	@Override
	public void insertAtEnd(T element) {

		if (head == null) {
			head.next = new Node<>(element);
		} else {
			Node<T> trav = head;
			while (trav.next != null) {
				trav = trav.next;
			}

			trav.next = new Node<>(element);
		}
	}
	
	@Override
	public void insertAtStart(T element) {
		
		if (head == null) {
			head.next = new Node<>(element);
		}else {
			LinkedListImpl.Node<T> temp = head.next;
			head.next = new Node<>(element);
			head.next.next = temp;
		}
	}
	
	@Override
	public void insertAtPosition(int pos, T element) {
		Node<T> currentNode = head.next;
		while (pos != 0) {
			currentNode = currentNode.next;
			pos--;
		}
		Node<T> tempNode = currentNode;
		currentNode.next = new Node<>(element);
		currentNode.next.next = tempNode;
	}

	@Override
	public Iterator<Node<T>> iterator() {

		return new Iterator<LinkedListImpl.Node<T>>() {
			private Node<T> currentNode = head.next;
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
