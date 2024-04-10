package p1;

public class ConsolePrinter implements Printer {
	@Override
	public void print(String mesg) {
		System.out.println("Printing mesg : " + mesg + " on the console");
		//Can imple class DIRECTLY access i/f constants ? YES
		System.out.println("speed : "+SPEED);
	}
}
