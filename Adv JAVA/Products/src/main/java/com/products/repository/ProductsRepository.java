package com.products.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.products.entities.Product;

@Repository
public interface ProductsRepository extends JpaRepository<Product, Long> {

//	@Query("")
//	void setDiscount(double discount,Long productId);

 }
