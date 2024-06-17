package com.recipe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.recipe.dto.RecipeDTO;
import com.recipe.services.RecipeService;

@RestController
@RequestMapping("/recipies")
public class RecipeController {
	@Autowired
	private RecipeService recipeService;
	
	@GetMapping
	public ResponseEntity<?> getAllRecipies()
	{
		return ResponseEntity.status(HttpStatus.OK).body(recipeService.getAllRecipes());
	}
	@GetMapping("/{id}")
	public ResponseEntity<?> getRecipeById(@PathVariable Long id)
	{
		return ResponseEntity.status(HttpStatus.OK).body(recipeService.getRecipeById(id));
	}
	
	@PostMapping
	public ResponseEntity<?> addRecipe(@RequestBody RecipeDTO recipe ){
		return ResponseEntity.status(HttpStatus.CREATED).body(recipeService.addRecipe(recipe));
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> updateRecipe(@PathVariable Long id,@RequestBody RecipeDTO updatedRecipe)
	{
		return ResponseEntity.status(HttpStatus.OK).body(recipeService.updateRecipeDetails(id, updatedRecipe));
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteRecipe(@PathVariable Long id)
	{
		return ResponseEntity.status(HttpStatus.OK).body(recipeService.deleteRecipe(id));
	}

}
