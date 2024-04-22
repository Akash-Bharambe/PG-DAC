package p4;

import java.util.List;

public class Test1 {

	public static void main(String[] args) {
		/*
		 * Create immutable List of double values , display the same
		 * 
		 * 
		 */
		List<Double> doubles = List.of(1.0, 2.7, 3.8, 45.9);
//		for(double d : doubles)
//			System.out.println(d);
		// Iterable i/f : public default void forEach(Consumer<? super T> action)
		// In imperative(conventional) style -create a separate imple class n pass the
		// ref.
		System.out.println("list via conventional prog ");
		doubles.forEach(new MyConsumer<>());
		//Can it be replaced by declarative (Func prog) style ? YES
		/*
		 * arg of forEach : Consumer
		 * Is Consumer func i/f ? YES
		 * SAM (func method) : public void accept(T o)
		 */
		System.out.println("list via FP ");
		doubles.forEach(d -> System.out.println(d));

	}

}
