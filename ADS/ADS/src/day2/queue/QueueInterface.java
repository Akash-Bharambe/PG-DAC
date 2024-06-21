package day2.queue;

public interface QueueInterface<T> extends Iterable<T> {
	boolean isEmpty();
	boolean isFull();
	void enqueue(T element);
	T dequeue();
	T peek();
	int size();
}
