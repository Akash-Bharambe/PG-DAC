package char_io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class TestBufferedFileRead {

	public static void main(String[] args) {
		System.out.println("Enter src file name");
		try (Scanner sc = new Scanner(System.in);
				// Java App <--- BR : buffering strm<----FR : node strms <---src text file
				BufferedReader br = 
						new BufferedReader(new FileReader(sc.nextLine()))) {
			String line = null;
			while ((line = br.readLine()) != null)
				System.out.println(line);
			System.out.println("end of file read.....");
		}  //JVM : br.close(), sc.close()
		catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("main over...");

	}

}
