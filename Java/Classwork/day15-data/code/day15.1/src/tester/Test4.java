package tester;

import java.util.Comparator;
import java.util.Map;
import java.util.Scanner;

import com.shop.core.Category;
import com.shop.core.Product;

import static utils.ShopUtils.*;

public class Test4 {

	public static void main(String[] args) {
		/*
		 * get the products in a map(product map) 
		 * accept product category from user
		 * display the selected products sorted as per price
		 */
		try (Scanner sc = new Scanner(System.in)) {
			// get the map n display all products
			Map<Integer, Product> productMap = populateProductMap(populateProductList());
			productMap.forEach((k, v) -> System.out.println(v));
			System.out.println("Choose category");
			Category cat = Category.valueOf(sc.next().toUpperCase());
			Comparator<Product> comp = (p1, p2) -> {
				if (p1.getPrice() < p2.getPrice())
					return -1;
				if (p1.getPrice() == p2.getPrice())
					return 0;
				return 1;

			};
//		OR 	((Double)p1.getPrice()).compareTo(p2.getPrice());
			productMap.values() // Collection<Product>
					.stream() // Stream<Product>
					.filter(p -> p.getProductCategory().equals(cat)) // Stream<Product> : filtered products
					.sorted(comp) // sorted Stream<Product>
					.forEach(p -> System.out.println(p));

		}

	}

}
