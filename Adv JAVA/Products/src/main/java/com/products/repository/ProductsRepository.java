package com.products.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.products.entities.Product;

@Repository
public interface ProductsRepository extends JpaRepository<Product, Long> {
//	
//	List<Product> getAllProducts();
//
//	List<Product> getProductsByCategory(String category);
//
//	void setDiscount(Long productId, double discount);
	
//	List<Product> findAll();
//	
//	List<Product> findByCategory(Category category);

	@Query("update Product p set p.price = p.price - :discount where p.productId = :productId")
	void setDiscount(double discount,Long productId);

	
 }
