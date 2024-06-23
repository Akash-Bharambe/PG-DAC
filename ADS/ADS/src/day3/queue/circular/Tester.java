package day3.queue.circular;

public class Tester {

	public static void main(String[] args) {
		Queue<Integer> queue = new QueueImpl<Integer>(Integer.class);

		for (int i = 0; i < 10; i++) {
			queue.enqueue(i*10);
		}
		
		Integer integer2 = queue.dequeue();
		System.out.println("Dequeued: "+integer2);
		
		for (Integer integer : queue) {
			System.out.print(integer+" ");
		}
		
		System.out.println();
		System.out.println("Front: "+queue.peek());
	}

}
