package practise.queue;

public class QueueTester {

	public static void main(String[] args) {
		Queue queue = new QueueImpl(10);
		
		queue.enqueue(10);
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.dequeue();
		queue.enqueue(30);
		queue.dequeue();
		queue.enqueue(30);
		queue.enqueue(30);
		queue.dequeue();
		queue.enqueue(30);
		queue.enqueue(30);
		queue.dequeue();
		queue.enqueue(30);
		queue.enqueue(30);
		queue.enqueue(30);
		queue.enqueue(30);
		queue.enqueue(30);
		
		System.out.println(queue.size());

	}

}
