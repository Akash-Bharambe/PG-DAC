package day3.queue.linkedlist;

public interface Queue<T> extends Iterable<T> {

	void enqueue(T element);
	T dequeue();
	int size();
	boolean isEmpty();
	T peek();
	
}
