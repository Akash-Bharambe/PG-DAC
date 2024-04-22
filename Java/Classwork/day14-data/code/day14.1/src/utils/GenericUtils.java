package utils;

import java.util.Collection;
import java.util.List;

import com.app.core.Emp;
import com.app.core.Mgr;

public class GenericUtils {
	/*
	 * Add a method to print all elements from any of the following Test cases :
	 * AL<String> , LL<Integer> , Vector<LocalDate> , HS<Double> , LHS<Emp>
	 * ,TS<Fruit>
	 * 
	 */
	public static void printElements(Collection<?> collection) {
		for (Object o : collection)
			System.out.println(o);
	}

	// Can you replace ? by T : YES
	public static <T> void printElements2(Collection<T> collection) {
		for (T o : collection)
			System.out.println(o);
	}

	public static double computeSalarySum(List<? extends Emp> emps) {
		double sum = 0;
		for (Emp e : emps)
			sum += e.computeSalary();
//		emps.add(new Mgr(12345));
		return sum;
	}

}
