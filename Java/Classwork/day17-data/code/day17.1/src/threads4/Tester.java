package threads4;

public class Tester {

	public static void main(String[] args) throws InterruptedException {
		System.out.println(Thread.currentThread());// Thread[main,5,main]
		// create 3 user defined thrds : one two three
		// create runnable task instance
		MyClass task = new MyClass();
		// Thread(Runnable instance, String name)
		Thread t1 = new Thread(task, "one");
		Thread t2 = new Thread(task, "two");
		Thread t3 = new Thread(task, "three");		
		t1.start();
		t2.start();
		t3.start(); // runnable : 1(parent thrd : main)+3 : child thrds
		System.out.println("Threads dead or alive " + t1.isAlive() + " " + t2.isAlive() + " " + t3.isAlive());// t t t
		System.out.println("main waiting for child trhds to complete exec");
		t1.join();//main :  Blocked on join   t1 : runnable
		t2.join();
		t3.join();
		System.out.println("Threads dead or alive " + t1.isAlive() + " " + t2.isAlive() + " " + t3.isAlive());// f f f

		System.out.println("main over.....");
		/*
		 * observe orphan threads
		 */

	}

}
