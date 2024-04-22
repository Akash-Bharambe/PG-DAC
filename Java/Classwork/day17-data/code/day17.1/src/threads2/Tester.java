package threads2;

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

		// how many RUNNABLE threads ? 1 : main (parent)
		// start the thrds
		/*
		 * What will hapeen if you call run() instead of start() ? Sequential exec or
		 * paraller exec ??? Sequential exec --all the tasks delegated to main thread
		 */
		t1.start();
		t2.start();
		t3.start(); // runnable : 1(parent thrd : main)+3 : child thrds
		System.out.println("Threads dead or alive " + t1.isAlive() + " " + t2.isAlive() + " " + t3.isAlive());// t t t
//		t2.start(); un comment n understand -IllegalThrdStateExc --got by main
		// B.L in main
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + " exec counter " + i);
			Thread.sleep(100);
		}
		System.out.println("main over.....");
		/*
		 * observe orphan threads
		 */

	}

}
