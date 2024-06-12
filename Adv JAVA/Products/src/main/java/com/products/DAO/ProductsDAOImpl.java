package com.products.DAO;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.products.entities.Product;

@Repository
public class ProductsDAOImpl implements ProductsDAO{
	
	@Autowired
	private EntityManager manager;

	@Override
	public List<Product> getAllProducts() {
		String jpql = "select p from Product p";
		return manager.createQuery(jpql, Product.class).getResultList();
	}

	@Override
	public List<Product> getProductsByCategory(String category) {
		String jpqlString = "select p from Product p where p.category.name=:ctgry";
		return manager.createQuery(jpqlString, Product.class).setParameter("ctgry", category).getResultList();
	}

	@Override
	public void setDiscount(Long productId, double discount) {
		String jpqlString = "update Product p set p.price = p.price - :discount where p.productId = :productId";
		manager.createQuery(jpqlString, Product.class).setParameter("discount", discount).setParameter("productId", productId).executeUpdate();
	}

}
