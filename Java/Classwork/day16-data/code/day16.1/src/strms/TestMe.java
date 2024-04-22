package strms;

import java.util.Optional;
import java.util.stream.Stream;

public class TestMe {
	public static void main(String[] args) {
	//	Stream<String> stringStream = Stream.of("A", "B", "C", "D");
		Stream<String> stringStream = Stream.of();
		Optional<String> result1 = stringStream.findFirst();
		System.out.println(result1.orElseThrow());
//		if(result1.isPresent())
//		System.out.println(result1.get());
//		else
//			System.out.println("no result !!");
//		Optional<String> result2 = Stream.of("A", "B", "C", "D").findAny();
//		System.out.println(result2.get());
		
	//	stringStream.findAny();		
		/*
		 * Suppose : MyCustomException extends Exception{...}
		 * use above exception to throw in case of empty optional
		 */
	}

}
