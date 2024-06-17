package com.automobile.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.automobile.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	User findByUsername(String username);
}
