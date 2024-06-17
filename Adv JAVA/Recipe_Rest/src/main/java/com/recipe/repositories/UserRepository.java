package com.recipe.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.recipe.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

	User findByName(String name);

}
