package practise.linkedlist;

import java.util.Iterator;

public class LinkedListImpl implements LinkedList {

	Node head;
	int size;

	public LinkedListImpl() {
		this.head = null;
		size = 0;
	}

	public LinkedListImpl(int head) {
		this.head = new Node(head);
		this.head.next = this.head.prev = this.head;
		size = 0;
	}

	@Override
	public void addFront(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			head.next = head;
			head.prev = head;
		} else {
			newNode.prev = head.prev;
			head.prev.next = newNode;
			head.prev = newNode;
			newNode.next = head;
			head = newNode;
		}
		size++;
	}

	@Override
	public void addLast(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			head.next = head;
			head.prev = head;
		} else {
			newNode.prev = head.prev;
			head.prev.next = newNode;
			newNode.next = head;
			head.prev = newNode;
		}
		size++;
	}

	@Override
	public Integer removefront() {
		Integer data = null;
		if (head == null) {
			return null;
		}
		data = head.data;
		if (head == head.next) {
			head = null;
		} else {
			head.next.prev = head.prev;
			head.prev.next = head.next;
			head = head.next;
		}
		size--;
		return data;
	}

	@Override
	public Integer removeLast() {
		Integer data = null;
		if (head == null) {
			return null;
		}
		data = head.prev.data;
		if (head == head.prev) {
			head = null;
		} else {
			Node deleteNode = head.prev;
			deleteNode.prev.next = head;
			head.prev = deleteNode.prev;
		}
		size--;
		return data;
	}

	@Override
	public boolean isEmpty() {
		return head == null;
	}

	@Override
	public Iterator<Integer> iterator() {
		return new Iterator<Integer>() {

			Node current = head;
			boolean flag = false;

			@Override
			public Integer next() {
				flag = true;
				int data = current.data;
				current = current.next;
				return data;
			}

			@Override
			public boolean hasNext() {
				return (!flag || current != head) && current != null;
			}
		};
	}

	@Override
	public void addAt(int position, int data) {
		if (position <= 1) {
			addFront(data);
			return;
		} else if (position > size + 1) {
			addLast(data);
		}
		
		Node current = head;
		while (position > 2) {
			current= current.next;
			position--;
		}
		Node newNode = new Node(data);
		
		newNode.next = current.next;
		current.next.prev = newNode;
		current.next = newNode;
		newNode.prev = current;

	}

	@Override
	public Integer removeAt(int position) {
		Integer data = null;
		if (position <= 1) {
			data = removefront();
			return data;
		} else if (position > size + 1) {
			data = removeLast();
		}
		
		Node current = head;
		while (position > 2) {
			current= current.next;
			position--;
		}
		
		data = current.next.data;
		current.next = current.next.next;
		current.next.prev = current;
		return data;
	}

}
