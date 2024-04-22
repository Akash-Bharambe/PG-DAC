package tester;
import static utils.ShopUtils.*;

import java.util.List;
import java.util.Map;

import com.shop.core.Product;

public class TestShop {

	public static void main(String[] args) {
		System.out.println("Produdts in the shop : using List");
		List<Product> productList = populateProductList();
		for(Product p : productList)
			System.out.println(p);
		//display the products from the Map
		Map<Integer, Product> productMap = populateProductMap(productList);
		System.out.println("Produdts in the shop : using Map");
		for(Product p : productMap.values())
			System.out.println(p);
	}

}
