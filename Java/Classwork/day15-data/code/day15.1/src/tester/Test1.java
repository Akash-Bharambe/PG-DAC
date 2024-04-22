package tester;

import static utils.ShopUtils.populateProductList;
import static utils.ShopUtils.populateProductMap;

import java.time.LocalDate;
import java.util.Map;
import java.util.Scanner;

import com.shop.core.Product;

public class Test1 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// display the products from the Map
			Map<Integer, Product> productMap = populateProductMap(populateProductList()); // display map
			productMap.forEach((k, v) -> System.out.println(v));
			System.out.println("Enter exp days");
			int days = sc.nextInt();

			LocalDate today = LocalDate.now();
			productMap.values() // Collection<Product>
					.removeIf(p -> {
						System.out.println(p.getManufactureDate().plusDays(days));
						return p.getManufactureDate().plusDays(days).isBefore(today);
					});
			System.out.println("after remove");
			productMap.forEach((k, v) -> System.out.println(v));

		}
	}

}
