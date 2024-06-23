package day3.queue.circular;

public interface Queue<T> extends Iterable<T> {

	void enqueue(T element);
	T dequeue();
	int size();
	boolean isEmpty();
	boolean isFull();
	T peek();
	
}
