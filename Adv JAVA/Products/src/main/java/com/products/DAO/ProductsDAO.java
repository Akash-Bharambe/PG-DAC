package com.products.DAO;

import java.util.List;

import com.products.entities.Product;

public interface ProductsDAO {
	
	List<Product> getAllProducts();

	List<Product> getProductsByCategory(String category);

	void setDiscount(Long productId, double discount);
}
