package com.products.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.products.entities.Product;
import com.products.repository.ProductsRepository;

@Service
@Transactional
public class ProductsSeriveImpl implements ProductsService {

	@Autowired
	private ProductsRepository repository;
	
	@Override
	public List<Product> getAllProducts() {	
		return repository.findAll();
	}

	@Override
	public Product addProduct(Product product) {
		return repository.save(product);
	}
	
	

}
