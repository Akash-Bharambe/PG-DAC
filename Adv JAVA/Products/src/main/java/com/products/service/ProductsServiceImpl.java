package com.products.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.products.entities.Product;
import com.products.exceptions.ProductExceptions;
import com.products.repository.ProductsRepository;

@Service
@Transactional
public class ProductsServiceImpl implements ProductsService {

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

	@Override
	public String updateProduct(Long id, Product product) {
		String msgString = "Not Found";
		if(repository.existsById(id)) {
			repository.save(product);
			msgString = "Updated Successfully";
			return msgString;
		}
		return msgString;
	}

	@Override
	public String deleteProduct(Long id) {
		String msgString = "Not Found";
		if(repository.existsById(id)) {
			repository.deleteById(id);
			msgString = "Deleted Successfully";
			return msgString;
		}
		return msgString;
	}

	@Override
	public Product getproduct(Long id) {
		return repository.findById(id).orElseThrow(()-> new ProductExceptions("Product not Found"));
	}
	
	

}
