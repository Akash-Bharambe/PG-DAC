package com.products.service;


import java.util.List;

import com.products.entities.Product;

public interface ProductsService {
	
	List<Product> getAllProducts();
	Product addProduct(Product product);
	String updateProduct(Long id, Product product);
	String deleteProduct(Long id);
	Product getproduct(Long id);
}
