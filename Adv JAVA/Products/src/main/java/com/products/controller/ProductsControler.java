package com.products.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.products.DTO.APIResponse;
import com.products.entities.Product;
import com.products.service.ProductsService;

@RestController
@RequestMapping("/products")
public class ProductsControler {

	@Autowired
	private ProductsService service;

	public ProductsControler() {
		System.out.println("in CTOR" + getClass());
	}

	@GetMapping
	public ResponseEntity<?> getProducts() {
		return ResponseEntity.status(HttpStatus.OK).body(service.getAllProducts());
	}

	@GetMapping("/{id}")
	public ResponseEntity<?> getProductByID(@PathVariable Long id) {
		try {
			return ResponseEntity.status(HttpStatus.OK).body(service.getproduct(id));
		} catch (RuntimeException e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new APIResponse(e.getMessage()));
		}

	}

	@PostMapping
	public ResponseEntity<?> addProduct(@RequestBody Product product) {
		return ResponseEntity.status(HttpStatus.CREATED).body(service.addProduct(product));
	}

	@PutMapping("/{id}")
	public ResponseEntity<?> updateProduct(@PathVariable Long id, @RequestBody Product product) {
		return ResponseEntity.status(HttpStatus.OK).body(service.updateProduct(id, product));
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteProduct(@PathVariable Long id) {
		return ResponseEntity.status(HttpStatus.OK).body(service.deleteProduct(id));
	}

}
