package com.blogs.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.blogs.entities.User;

@Repository
public class UserDAOImpl implements UserDAO {

	@Autowired
	private EntityManager manager;
	
	@Override
	public List<User> getAllUsers() {
		System.out.println("in get all Users");
		String jpql = "select u from User u";
		return manager.createQuery(jpql, User.class).getResultList();
	}

}
