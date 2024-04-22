package char_io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class CopyTextFilesFP {

	public static void main(String[] args) {
		System.out.println("Enter src n dest file names");
		try (Scanner sc = new Scanner(System.in);
				//chain of I/O streams
				// Java App <--- BR : buffering strm<----FR : node strms <---src text file
				BufferedReader br = 
						new BufferedReader(new FileReader(sc.nextLine()));
				//Java App --> PW --> FW --> text file
				PrintWriter pw=new PrintWriter(new FileWriter(sc.nextLine()))
				) {
			  br.lines() //Stream<String>
			  .forEach(line -> pw.println(line));
				System.out.println("end of file copy.....");
		}  //JVM : br.close(), sc.close()
		catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("main over...");

	}

}
