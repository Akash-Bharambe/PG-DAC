package com.products.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.products.entities.Product;
import com.products.service.ProductsService;

@RestController 
@RequestMapping("/products")
public class ProductsControler {
	
	@Autowired
	private ProductsService service;
	
	public ProductsControler() {
		System.out.println("in CTOR"+ getClass());
	}
	
	@GetMapping
	public List<Product> getProducts() {
		return service.getAllProducts();
	}
	
	@PostMapping
	public Product addProduct(@RequestBody Product product ) {
		return service.addProduct(product);
	}
	
	@PutMapping
	public Product updateProduct(@RequestBody Product product) {
		return service.updateProduct(product);
	}
	
}
