package com.blogs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.blogs.dao.UserDAO;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO userDAO;

	@Override
	public boolean validateUser(String username, String password) {
		try {
			userDAO.getAllUsers().stream()
					.filter(u -> u.getEmail().equals(username) && u.getPassword().equals(password)).findAny()
					.orElseThrow();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

}
