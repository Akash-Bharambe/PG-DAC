package date_time_modern;

import java.time.LocalDate;
import java.util.Scanner;

public class TestLocalDate {

	public static void main(String... args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter DoB(yr-mon-day)");
			LocalDate dob = LocalDate.parse(sc.next());
			System.out.printf("Dob %s %n", dob);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("main cntd......");

	}

}
