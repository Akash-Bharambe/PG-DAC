package practise.queue;

public interface Queue {
	void enqueue(int value);
	Integer dequeue();
	boolean isEmpty();
	boolean isFull();
	Integer size();
	Integer peek();
}
