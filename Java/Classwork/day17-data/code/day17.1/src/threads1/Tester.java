package threads1;

public class Tester {

	public static void main(String[] args) throws InterruptedException{
		System.out.println(Thread.currentThread());//Thread[main,5,main]
		//create 3 user defined thrds : one two three
		//Thread(String name)
		MyClass t1=new MyClass("one");
		MyClass t2=new MyClass("two");
		MyClass t3=new MyClass("three");
		//how many RUNNABLE threads ? 1
		//start the thrds
		t1.start();
		t2.start();
		t3.start();
		//B.L in main 
		for (int i = 0; i < 20; i++) {
			System.out.println(Thread.currentThread().getName() + " exec counter " + i);
			Thread.sleep(1000);
		}
		System.out.println("main over.....");
		

	}

}
