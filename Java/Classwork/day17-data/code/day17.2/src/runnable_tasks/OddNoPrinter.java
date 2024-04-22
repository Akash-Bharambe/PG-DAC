package runnable_tasks;

import java.util.stream.IntStream;

public class OddNoPrinter implements Runnable {
	private int begin;
	private int end;

	public OddNoPrinter(int begin, int end) {
		super();
		this.begin = begin;
		this.end = end;
		System.out.println("in ctor of " + getClass() 
		+ " invoked by - " + Thread.currentThread().getName());//main 
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " : strted");
		try {
			IntStream.rangeClosed(begin, end) // IntStream : begin --end
					.filter(i -> i % 2 != 0) // filtered int strm
					.forEach(i -> System.out.println(Thread.currentThread().getName() + " : printing " + i));

		} catch (Exception e) {
			System.out.println(Thread.currentThread().getName() + ": exc " + e);
		}
		System.out.println(Thread.currentThread().getName() + " : over");

	}

}
