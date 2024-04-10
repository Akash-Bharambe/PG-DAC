package p1;

public class FilePrinter implements Printer {
	public void openFile(String name)
	{
		System.out.println("opening a file "+name);
	}
	@Override
	public void print(String mesg) {
		System.out.println("Saving a  mesg : " + mesg + " in the file");
		//Can imple class DIRECTLY access i/f constants ? YES
		System.out.println("speed : "+SPEED);
	}
	public void closeFile(String name)
	{
		System.out.println("closing a file "+name);
	}
}
