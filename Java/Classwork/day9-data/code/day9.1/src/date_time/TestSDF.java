package date_time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
 * Use SimpleDateFormat - to parse n format the dates
 */
public class TestSDF {
	private static SimpleDateFormat sdf;
	static {
		sdf = new SimpleDateFormat("yyyy-MM-dd");
	}

	public static void main(String... args) /* throws ParseException */ {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter DoB(yr-mon-day)");
			Date dob = sdf.parse(sc.next());
			System.out.println("DoB " + sdf.format(dob));
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("main cntd......");

	}

}
