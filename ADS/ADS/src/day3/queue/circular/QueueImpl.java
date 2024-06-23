package day3.queue.circular;

import java.lang.reflect.Array;
import java.util.Iterator;

public class QueueImpl<T> implements Queue<T> {

	private T[] arr;
	private int front;
	private int rear;
	private int capacity;

	public QueueImpl(Class<T> clazz) {
		this(clazz, 10);
	}

	@SuppressWarnings("unchecked")
	public QueueImpl(Class<T> clazz, int size) {
		arr = (T[]) Array.newInstance(clazz, size);
		front = -1;
		rear = -1;
		capacity = size + 1;
	}

	@Override
	public void enqueue(T element) {

		if (isFull()) {
			return;
		} else if (isEmpty()) {
			rear = 0;
			front = 0;
		} else {
			rear = (rear + 1) % capacity;
		}
		arr[rear] = element;
	}

	@Override
	public T dequeue() {
		if (isEmpty()) {
			return null;
		} else if (front == rear) {
			T t = arr[front];
			front = -1;
			rear = -1;
			return t;
		} else {
			T t = arr[front];
			arr[front] = null;
			front = (front + 1) % capacity;
			return t;
		}
	}

	@Override
	public int size() {
		if (front <= rear)
			return rear - front + 1;
		else if (isEmpty())
			return 0;
		else
			return capacity - front + rear + 1;
	}

	@Override
	public boolean isEmpty() {
		return front == -1;
	}

	@Override
	public boolean isFull() {
		return (rear + 1) % capacity == front;
	}

	@Override
	public T peek() {
		return arr[front];
	}

	@Override
	public Iterator<T> iterator() {
		return new Iterator<T>() {

			private int index = front;

			@Override
			public boolean hasNext() {
				return index <= rear;
			}

			@Override
			public T next() {
				return arr[index++];
			}
		};
	}

}
