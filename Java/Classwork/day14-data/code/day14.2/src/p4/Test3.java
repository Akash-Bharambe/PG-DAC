package p4;

import static utils.ShopUtils.*;

import java.util.List;
import java.util.Map;

import com.shop.core.Product;

public class Test3 {

	public static void main(String[] args) {
		// get a populated map of products
		Map<Integer, Product> productMap =
				populateProductMap(populateProductList());
		//display product details from map
		for(Product p : productMap.values())//Collection<Product>
			System.out.println(p);
		/*
		 * Map i/f : new default method -- forEach
		 * public default void forEach(BiConsumer<? super K,? super V> consumer)
		 * BiConsumer : functional i/f 
		 * SAM - public void accept(T o1,U o2)
		 */
		System.out.println("product map details via FP");
		productMap.forEach((id,product) -> System.out.println(product));
	}

}
