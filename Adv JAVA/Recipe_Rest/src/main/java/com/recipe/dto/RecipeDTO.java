package com.recipe.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.recipe.entities.CuisineType;
import com.recipe.entities.DifficultyLevel;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter 
@NoArgsConstructor
public class RecipeDTO {
	@NotBlank(message = "Title can't be empty")
	private String title;
	private String description;
	@NotBlank(message = "Ingredients can't be empty")
	private String ingredients;
	@NotNull(message = "Instructions cant be empty")
	private String instructions;
	@NotNull(message = "Difficulty level cant be empty")
	private DifficultyLevel difficultiLevel;
	@NotNull(message = "Cuisine type can't be empty")
	private CuisineType cuisineType;
	@NotNull(message = "User id cant be empty")
	private UserDTO user;
}
