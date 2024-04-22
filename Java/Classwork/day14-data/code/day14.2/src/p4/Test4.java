package p4;

import static utils.ShopUtils.populateProductList;

import java.util.Collections;
import java.util.List;

import com.shop.core.Product;

public class Test4 {

	public static void main(String[] args) {
		// get a populated list of products
		List<Product> productList = populateProductList();
		productList.forEach(p -> System.out.println(p));
		// Sort the product list as per product price : desc manner
		// Hint : Use Collections.sort(List<T> list,Comparator<? super T> comp)
		// Comparator : func i/f
		// SAM : public int compare(T o1,T o2)
		System.out.println("---------------------------");
		Collections.sort(productList, (p1, p2) -> {
			if (p1.getPrice() < p2.getPrice())
				return 1;
			if (p1.getPrice() == p2.getPrice())
				return 0;
			return -1;
		});
		productList.forEach(p -> System.out.println(p));
		
	}

}
