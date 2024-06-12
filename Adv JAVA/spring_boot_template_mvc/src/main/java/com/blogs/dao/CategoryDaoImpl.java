package com.blogs.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.blogs.entities.Category;


@Repository//dao layer spring bean
public class CategoryDaoImpl implements CategoryDao {
	//depcy - SF
	@Autowired //byType
	private EntityManager manager;
	/*
	 * javax.persistence.EntityManager -> Super i/f of org.hibernate.Session
	 * Spring Boot Doesn't directly support Hibernate APIs
	 *  So using its Super Interface
	 *  SF -> EntityManagerFactory
	 *  Session -> EntityManager
	 *  EntityManager can be directly Autowired in DAO Layer
	 *  @AutoWired | @PersistanceContext(from JPA package)
	 */

	@Override
	public List<Category> getAllCategories() {
		String jpql="select c from Category c";
		return manager.createQuery(jpql,Category.class).getResultList();				
	}

}
