package day3.queue.linkedlist;

public class Tester {

	public static void main(String[] args) {
		Queue<Integer> queue = new QueueImpl<Integer>();
		
		for (int i = 0; i < 10; i++) {
			queue.enqueue(i*10);
		}
		
		for (Integer integer : queue) {
			System.out.print(integer+" ");
		}
		
	}

}
