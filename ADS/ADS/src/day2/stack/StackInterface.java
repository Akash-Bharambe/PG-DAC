package day2.stack;

public interface StackInterface<T> extends Iterable<T> {
	boolean isFull();
	boolean isEmpty();
	T push(T element);
	T pop();
	T peek();
	int size();
	boolean contains(T[] arr);
}
