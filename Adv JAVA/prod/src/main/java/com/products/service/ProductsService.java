package com.products.service;


import java.util.List;

import com.products.entities.Product;

public interface ProductsService {
	
	List<Product> getAllProducts();
	Product addProduct(Product product);
}
