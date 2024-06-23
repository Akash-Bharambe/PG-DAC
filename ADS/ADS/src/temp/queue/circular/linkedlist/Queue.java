package temp.queue.circular.linkedlist;

public interface Queue<T> extends Iterable<Queue.Node<T>> {
	
	class Node<T> {

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

	void enqueue(T element);
	T dequeue();
	int size();
	boolean isEmpty();
	T peek();
	
}
