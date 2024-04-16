package utils;

import java.util.Collection;
import java.util.List;

import com.app.core.Emp;

public class GenericUtils {
	/*
	 * Add a method to print any element from any of the following Test cases :
	 * AL<String> , LL<Integer> , Vector<LocalDate> , HS<Double> , LHS,TS
	 */
//	public static void printElementsFromCollection(Collection<Object> coll)
//	{
//		for(Object o : coll)
//			System.out.println(o);
//	}
	// generic method
	public static <T> void printElementsFromCollection(Collection<T> coll) {
		for (T o : coll)
			System.out.println(o);
	}

	// OR : ? wild card syntax in generics : represents ANY un known trype (can be
	// substrtuted by ANY type)
	// non generic : ?
	public static void printElementsFromCollection2(Collection<?> coll) {
		for (Object o : coll)
			System.out.println(o);
	}
	/*
	 * 2. Add a method to find sum of salary of emps from any List Test cases :
	 * AL<Mgr> ,LL<Worker> , Vector<SM> ....
	 */
//	public static double computeSumOfSalriesFromList(List<Emp> emps)
//	{
//		double sum=0;
//		for(Emp e : emps)
//			sum += e.computeSalary();
//		return sum;
//	}
	public static double computeSumOfSalriesFromList(List<? extends Emp> emps)
	{
		double sum=0;
		for(Emp e : emps)
			sum += e.computeSalary();
		return sum;
	}

}
