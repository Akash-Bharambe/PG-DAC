package utils;

import java.util.Collection;

public class GenericUtils {
	/*
	 * Add a method to print all elements from any of the following Test cases :
	 * AL<String> , LL<Integer> , Vector<LocalDate> , HS<Double> , LHS<Emp>
	 * ,TS<Fruit>
	 * 
	 */
	public static void printElements(Collection<?> collection)
	{
		for(Object o : collection)
			System.out.println(o);
	}
}
