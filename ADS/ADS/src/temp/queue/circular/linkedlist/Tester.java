package temp.queue.circular.linkedlist;

import temp.queue.circular.linkedlist.Queue.Node;

public class Tester {

	public static void main(String[] args) {
		
		Queue<Integer> queue = new QueueImpl<>();
		
		for (int i = 0; i < 10;i++) {
			queue.enqueue(i*10);
		}
		
		System.out.println("Front: "+queue.peek());
		System.out.println("Dequeued: "+queue.dequeue());
		
		for (Node<Integer> integer : queue) {
			System.out.println(integer);
		}
		
	}
	
}
