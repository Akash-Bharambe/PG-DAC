package utils;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.shop.core.Product;

import static com.shop.core.Category.*;
import static java.time.LocalDate.*;

public interface ShopUtils {
//add a static method to return List of some products'
	static List<Product> populateProductList() {
		// create empty ArrayList
		List<Product> list = new ArrayList<>();// size=0, init capa=10 : up casting
		// int productId, String name, String desc, int quantity, double price, Category
		// productCategory,
		// LocalDate manufactureDate
		list.add(new Product(10, "Brown_Bread", "Healthy Bread", 100, 40, BREAD, now()));
		list.add(new Product(100, "White_Bread", "Tasty Bread", 70, 35, BREAD, parse("2024-05-09")));
		list.add(new Product(14, "Multigrain_Bread", "Healthy n tasty Bread", 100, 80, BREAD, now()));
		list.add(new Product(57, "Garlic_Bread", "Tastiest Bread", 90, 65, BREAD, parse("2024-05-09")));
	
		list.add(new Product(50, "Marie", "Healthy Biscuits", 80, 10, BISCUITS, parse("2024-12-01")));
		list.add(new Product(40, "Monaco", "Salty Biscuits", 75, 15, BISCUITS, parse("2024-04-13")));
		list.add(new Product(60, "Sunflowe_Oil", "Healthy Oil", 50, 240, OIL, parse("2024-04-14")));
		list.add(new Product(70, "Gemini_Oil", "Vegetable Oil", 80, 220, OIL, parse("2024-04-19")));
		list.add(new Product(80, "Mango", "Seasonal Fruit", 45, 800, FRUITS, parse("2024-04-15")));
		list.add(new Product(15, "Watermelon", "Great Fruit", 60, 70, FRUITS, parse("2022-04-20")));
		return list;
	}

	// add a static method to return Map of products from populated list of products
	static Map<Integer, Product> populateProductMap(
			List<Product> productList) {
		Map<Integer, Product> map = new HashMap<>();// size=0, init capa=16 , load factor=.75
//		for (Product p : productList)
//			System.out.println("Put rets " + map.put(p.getProductId(), p));
		productList.forEach(p->map.put(p.getProductId(), p));
		System.out.println("size of the map " + map.size());
		return map;
	}

}
