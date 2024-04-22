package p4;

import static utils.ShopUtils.populateProductList;

import java.util.List;

import com.shop.core.Product;

public class Test2 {

	public static void main(String[] args) {
		// get a populated list of products
		List<Product> productList = populateProductList();
		for (Product p : productList)
			System.out.println(p);

		// Can it be replaced by declarative (Func prog) style ? YES
		// Iterable i/f : public default void forEach(Consumer<? super T> action)
		// In imperative(conventional) style -create a separate 
		//imple class n pass the
		// ref.
		/*
		 * arg of forEach : Consumer 
		*	Is Consumer func i/f ? 
		 * YES SAM (func method) :
		 * public void accept(T o)
		 */
		System.out.println();
		productList.forEach(product -> System.out.println(product));
		//discount all products by 10
		productList.forEach(p -> p.setPrice(p.getPrice()-10));
		System.out.println("products after discount");
		productList.forEach(product -> System.out.println(product));
		
	}

}
