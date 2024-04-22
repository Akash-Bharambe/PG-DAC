package tester;
import static utils.CustomerUtils.getAll;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.app.core.Customer;
public class Test1 {

	public static void main(String[] args) {
		List<Customer> allCustomers = getAll();
		System.out.println("All customers");
		allCustomers.forEach(System.out::println);
		//collect email ids of all customers in the separate set
		Set<String> emailList = allCustomers.stream() //Stream<Customers>
		.map(Customer :: getEmail)//c -> c.getEmail() : Stream<String>
		.collect(Collectors.toSet());
		//display emails
		System.out.println("Emails");
		emailList.forEach(System.out::println);
		//Objective : Collect all the phone nos of all customers in the phone no list.
		List<String> phoneNos = allCustomers.stream() //Stream<Customer>
		.flatMap(c -> c.getPhoneNumbers().stream()) //Stream<String> : ph nos
		.collect(Collectors.toList());
		System.out.println("Phone nos");
		phoneNos.forEach(System.out::println);

	}

}
