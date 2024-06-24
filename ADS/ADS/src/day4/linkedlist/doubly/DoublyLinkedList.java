package day4.linkedlist.doubly;

public interface DoublyLinkedList<T> extends Iterable<DoublyLinkedList.Node<T>> {
	class Node<T> {

		T value;
		Node<T> next;
		Node<T> prev;

		public Node() {
			this.value = null;
			this.next = null;
			this.prev = null;
		}

		public Node(T value) {
			this.value = value;
			this.next = null;
			this.next = prev;
		}

		public Node(Node<T> prev,T value, Node<T> next) {
			this.value = value;
			this.next = next;
			this.prev = prev;
		}

		public T getValue() {
			return value;
		}

		@Override
		public String toString() {
			return value + "";
		}

	}

	void insertAtEnd(T element);
	void insertAtStart(T element);
	void insertAtPosition(int pos, T element);
	
	int size();
	void reverseList();

	T deleteAtEnd();
	T deleteAtStart();
	T deleteAtPosition(int pos);
	
}
