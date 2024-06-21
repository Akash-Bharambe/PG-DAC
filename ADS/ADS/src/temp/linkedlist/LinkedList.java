package temp.linkedlist;

public interface LinkedList<T> extends Iterable<LinkedList.Node<T>> {

	class Node<T> {

		private T value;
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

	void insertAtEnd(T element);

	void insertAtStart(T element);

	void insertAtPosition(int pos, T element);

}
