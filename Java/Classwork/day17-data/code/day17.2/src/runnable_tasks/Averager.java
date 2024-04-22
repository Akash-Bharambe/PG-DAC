package runnable_tasks;

import java.util.stream.IntStream;

public class Averager implements Runnable {
	private int begin;
	private int end;

	public Averager(int begin, int end) {
		super();
		this.begin = begin;
		this.end = end;
		System.out.println("in ctor of " + getClass() + " invoked by - " + Thread.currentThread().getName());// main
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " : strted");
		try {
			double avg = IntStream.rangeClosed(begin, end) // IntStream : begin --end
					.average()
					.orElseThrow();// throws NoSuchElemExc ---strm empty !
			System.out.println("Avg printed by " + Thread.currentThread().getName() + " : " + avg);
		} catch (Exception e) {
			System.out.println(Thread.currentThread().getName() + ": exc " + e);
		}
		System.out.println(Thread.currentThread().getName() + " : over");

	}

}
