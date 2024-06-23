package temp.queue.circular.linkedlist;

import java.util.Iterator;

public class QueueImpl<T> implements Queue<T> {

	private Node<T> frontNode;
	private Node<T> rearNode;
	private int size;

	public QueueImpl() {
		this.size = 0;
		frontNode = null;
		rearNode = null;
	}

	@Override
	public void enqueue(T element) {
		Node<T> newNode = new Node<T>(element);

		if (isEmpty()) {
			frontNode = newNode;
			rearNode = newNode;
		} else {
			rearNode.next = newNode;
			rearNode = newNode;
			rearNode.next = frontNode;
		}
		size++;
	}

	@Override
	public T dequeue() {
		T value = frontNode.value;
		frontNode = frontNode.next;

		if (!isEmpty()) {
			rearNode.next = frontNode;
		} else {
			rearNode = null;
		}

		size--;
		return value;
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public T peek() {
		return frontNode.value;
	}

	@Override
	public Iterator<Node<T>> iterator() {
		return new Iterator<Node<T>>() {

			private Node<T> currentNode = frontNode;
			private boolean flag = true;

			@Override
			public boolean hasNext() {
				return flag || currentNode != frontNode;
			}

			@Override
			public Node<T> next() {
				Node<T> node = currentNode;
				currentNode = currentNode.next;
				flag = false;
				return node;
			}
		};
	}

}
