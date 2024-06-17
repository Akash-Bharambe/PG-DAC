package com.recipe.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.recipe.entities.Recipe;

public interface RecipeRepository extends JpaRepository<Recipe, Long> {

}
