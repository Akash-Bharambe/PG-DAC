package tester;

import java.util.stream.IntStream;

public class Test2 {

	public static void main(String[] args) {
		System.out.println("Even nos in 1-100");
		//Create IntStream : 1-100 , filter out even elems --display the same
		IntStream.rangeClosed(1, 100) //IntStream : 1-100
		.filter(i ->  i % 2 == 0) //IntStream --2,4,6,....100
		.forEach(i -> System.out.print(i+" "));
		//print sum of all odd nos in the range of 1-100
		int sum=IntStream.range(1, 101) //IntStream : 1-100
				.filter(i -> i % 2 != 0)
				.sum();
		System.out.println("sum of odd nos "+sum);
		//print sum of squares of all odd nos in the range of 1-100
		sum=IntStream.rangeClosed(1, 100) //IntStream : 1-100
		.filter(i -> i % 2 !=0) //IntStream - odd nos 
		.map(i -> i * i)//IntStream - sqs of odd nos
		.sum();//reduce : terminal op
		System.out.println("sum of sq of odd nos "+sum);
		//what will happen ?
		IntStream intStrm = IntStream.of(10,20,30,40,50);
		intStrm.forEach(i -> System.out.println(i));
	//	intStrm.forEach(i -> System.out.println(i));//IllgealStateExc : stream already closed due to terminal op.

	}

}
