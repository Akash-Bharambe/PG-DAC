package day4.linkedlist.sorted;

public interface SortedLinkedList<T extends Number> extends Iterable<SortedLinkedList.Node<T>> {

	class Node<T extends Number> {

		T value;
		Node<T> next;

		public Node() {
			this.value = null;
			this.next = null;
		}

		public Node(T value) {
			this.value = value;
			this.next = null;
		}

		public Node(T value, Node<T> next) {
			this.value = value;
			this.next = next;
		}

		public T getValue() {
			return value;
		}

		@Override
		public String toString() {
			return value + "";
		}

	}

	
	void insert(T element);
	int size();
	T delete(T num);
	void reverseList();
	
}