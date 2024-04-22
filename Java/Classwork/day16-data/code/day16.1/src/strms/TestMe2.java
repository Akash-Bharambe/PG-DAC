package strms;

import java.util.Optional;
import java.util.stream.Stream;

import custom_exceptions.MyCustomException;
/*
 * Suppose : MyCustomException extends Exception{...}
 * use this  exception to throw in case of empty optional
 * 
 */
public class TestMe2 {
	public static void main(String[] args) throws MyCustomException{
		Stream<String> stringStream = Stream.of("hello","hi");
		Optional<String> result1 = stringStream.findFirst();
		System.out.println(result1.orElseThrow(
				() -> new MyCustomException("empty result!!!!!")));
		

		
	}

}
