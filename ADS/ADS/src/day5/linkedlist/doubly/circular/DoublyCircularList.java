package day5.linkedlist.doubly.circular;

public interface DoublyCircularList<T> extends Iterable<DoublyCircularList.Node<T>> {
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

	void insert(T element);
	boolean isEmpty();
	int size();
	void reverseList();

	T delete(T element);
	T deleteAll(T element);
	
}
