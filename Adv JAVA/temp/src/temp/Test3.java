package temp;

public class Test3 implements Runnable {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Test3());
        thread.start();
        Thread thread1 = new Thread(new Test3());
        thread1.start();
//        thread.start();
//        System.out.println(thread.getState());
    }

    public void run() {
    	name();
    }
    public void name() {
    	System.out.println("Welcome");
	}
    
}
