package day2.queue;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;

public class Queue<T> implements QueueInterface<T> {

	private T[] arr;
	private int front;
	private int rear;

	public Queue(Class<T> clazz) {
		this(clazz, 10);
	}

	@SuppressWarnings("unchecked")
	public Queue(Class<T> clazz, int size) {
		this.arr = (T[]) Array.newInstance(clazz, size);
		this.front = -1;
		this.rear = -1;
	}

	@Override
	public Iterator<T> iterator() {
		return new Iterator<T>() {
			private int index = 0;

			@Override
			public boolean hasNext() {
				return arr[index] == null ? false : index < arr.length;
			}

			@Override
			public T next() {
				return arr[index++];
			}
		};
	}

	@Override
	public boolean isEmpty() {
		return this.front == this.rear;
	}

	@Override
	public boolean isFull() {
		return this.rear == (this.arr.length - 1);
	}

	@Override
	public void enqueue(T element) {
		if (!isFull()) {
			arr[++rear] = element;
			if (front == -1) {
				front = 0;
			}
			return;
		}
		throw new QueueFullException("Queue is Full");
	}

	@Override
	public T dequeue() {
		if (!isEmpty()) {
			T dequeued = arr[front++];
			arr[front-1] = null;
			if (isEmpty()) {
				this.front = -1;
				this.rear = -1;
			}
			return dequeued;
		}
		throw new QueueEmptyException("Queue is Empty");
	}

	@Override
	public T peek() {
		if (!isEmpty()) {
			return this.arr[this.front];
		}
		throw new QueueEmptyException("Queue is Empty");
	}

	@Override
	public int size() {
		return this.arr.length;
	}

	@Override
	public String toString() {
		return "Queue " + Arrays.toString(arr);
	}

	public static void main(String[] args) {
		Queue<Integer> queue = new Queue<Integer>(Integer.class);

		for (int i = 0; i < 10; i++) {
			queue.enqueue(i);
		}
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
//		for (int i = 0; i < 9; i++) {
//			queue.dequeue();
//		}
//		queue.enqueue(100);

		System.out.println(queue);
	}

}
