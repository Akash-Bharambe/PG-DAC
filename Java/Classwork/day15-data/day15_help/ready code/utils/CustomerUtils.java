package utils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.app.core.Customer;

public interface CustomerUtils {

	public static List<Customer> getAll() {
		return Stream
				.of(new Customer(101, "Asmita", "asmita@gmail.com", Arrays.asList("397937955", "21654725")),
						new Customer(102, "Paresh", "paresh@gmail.com", Arrays.asList("89563865", "2487238947")),
						new Customer(103, "Kiran", "kiran@gmail.com", Arrays.asList("38946328654", "3286487236")),
						new Customer(104, "Sumit", "sumit@gmail.com", Arrays.asList("389246829364", "948609467")))
				.collect(Collectors.toList());
	}

}
