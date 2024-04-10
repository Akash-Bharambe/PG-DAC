package p1;

import static p1.Printer.SPEED;

public class TestPrinters2 {

	public static void main(String[] args) {
		// create Printer[] to store refs to different type of printers
		Printer[] printers = { new ConsolePrinter(), new FilePrinter(), new NetworkPrinter() }; // up casting
		for (Printer p : printers) {
			if (p instanceof FilePrinter) {
				// open file provided it's a FilePrinter
				FilePrinter fp = (FilePrinter) p;
				fp.openFile("sample_data");
				p.print("some mesg");
				fp.closeFile("sample_data");
			} else
				p.print("mesg....");
			

		}
		// Can non imple class DIRECTLY access i/f constants ? NO

		System.out.println(SPEED);

	}

}
