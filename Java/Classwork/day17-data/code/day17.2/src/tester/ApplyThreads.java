package tester;

import java.util.Scanner;

import runnable_tasks.Averager;
import runnable_tasks.EvenNoPrinter;
import runnable_tasks.OddNoPrinter;

public class ApplyThreads {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter begin n end values");
			int start = sc.nextInt();
			int end = sc.nextInt();
			// create runnable tasks --attach thrds to the runnable task
			// start the same
			// Thread(Runnable instance , String name)
			Thread t1 = new Thread(new EvenNoPrinter(start, end), "even_printer");
			Thread t2 = new Thread(new OddNoPrinter(start, end), "odd_printer");
			Thread t3 = new Thread(new Averager(start, end), "aveger");
			t1.start();
			t2.start();
			t3.start();
			System.out.println("main waiting for child thrds to finish exec");
			t1.join();
			t2.join();
			t3.join();
			System.out.println(t1.isAlive());

		} catch (Exception e) {
			System.out.println(Thread.currentThread().getName() + " exc " + e);
		}
		System.out.println("main over....");
		
	}

}
