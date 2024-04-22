package tester;

import java.util.Map;
import java.util.Scanner;

import com.shop.core.Category;
import com.shop.core.Product;

import static utils.ShopUtils.*;

public class Test3 {

	public static void main(String[] args) {
		/* get the products in a map(product map)
		 * accept product category from user 
		 * display sum of prices of all the products from the specified category
		*/
		try(Scanner sc=new Scanner(System.in))
		{
			//get the map n display all products
			Map<Integer, Product> productMap = populateProductMap(populateProductList());
			productMap.forEach((k,v)-> System.out.println(v));
			System.out.println("Choose category");
			Category cat=Category.valueOf(sc.next().toUpperCase());
			double sum = productMap.values() //Collection<Product>
			.stream() //Stream<Product>
			.filter(p -> p.getProductCategory().equals(cat)) //Stream<Product> : filtered products
			.mapToDouble(p -> p.getPrice())//DoubleStream
			.sum();
			System.out.println("sum "+sum);
		}

	}

}
