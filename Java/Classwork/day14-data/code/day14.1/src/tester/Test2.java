package tester;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Test2 {

	public static void main(String[] args) {
		LocalDate d1=LocalDate.parse("2000-11-21");
		LocalDate d2=LocalDate.parse("2006-10-20");
		System.out.println(Period.between(d1, d2).getMonths());
		System.out.println(ChronoUnit.MONTHS.between(d1, d2));
		System.out.println(ChronoUnit.YEARS.between(d1, d2));
		System.out.println(ChronoUnit.DAYS.between(d1, d2));
		

	}

}
