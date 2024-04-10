package p1;
import static p1.Printer.SPEED;

public class TestPrinters {

	public static void main(String[] args) {
		//create Printer[] to store refs to different type of printers
		Printer[] printers= {new ConsolePrinter(),
				new FilePrinter(),
				new NetworkPrinter()}; //up casting
		for(Printer p : printers)
			p.print("some mesg");
		//Can non imple class DIRECTLY access i/f constants ? NO

		System.out.println(SPEED);

	}

}
