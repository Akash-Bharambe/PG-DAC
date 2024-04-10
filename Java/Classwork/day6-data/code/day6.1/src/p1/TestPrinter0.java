package p1;

public class TestPrinter0 {

	public static void main(String[] args) {
		FilePrinter fp = new FilePrinter();// is it direct referencing or indirect ?
		// what will happen ???
		fp.openFile("f1");
		fp.print("some mesg");
		fp.closeFile("f1");
		Printer p;// p : i/f type of ref.
		p = fp;// up casting
		((FilePrinter) p).openFile("f1");
		p.print("some mesg");
		((FilePrinter) p).closeFile("f1");
		p = new ConsolePrinter();
		if (p instanceof FilePrinter) {
			((FilePrinter) p).openFile("f1");
			p.print("some mesg");
			((FilePrinter) p).closeFile("f1");
		} else
			System.out.println("not a FilePrinter....");

	}

}
