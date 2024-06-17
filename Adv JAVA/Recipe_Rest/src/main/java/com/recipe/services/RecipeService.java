package com.recipe.services;

import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.recipe.dto.RecipeDTO;
import com.recipe.entities.Recipe;
import com.recipe.entities.User;
import com.recipe.exception.RecipeException;
import com.recipe.repositories.RecipeRepository;
import com.recipe.repositories.UserRepository;

@Service
@Transactional
public class RecipeService {
	@Autowired
	private RecipeRepository recipeRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private ModelMapper mapper;
	
	public List<RecipeDTO> getAllRecipes()
	{
		return recipeRepository.findAll().stream().map(entity-> mapper.map(entity,RecipeDTO.class)).collect(Collectors.toList());
	}
	
	public RecipeDTO getRecipeById(Long id)
	{
		if (recipeRepository.existsById(id)) 
			return mapper.map(recipeRepository.findById(id), RecipeDTO.class) ;			
		throw new RecipeException("Recipe Not Found");
	}
	
	public RecipeDTO addRecipe(RecipeDTO recipeDTO)
	{	
		User user = userRepository.findByName(recipeDTO.getUser().getName());
		Recipe recipe = mapper.map(recipeDTO, Recipe.class);
		recipe.setUser(user);
		return mapper.map(recipeRepository.save(recipe), RecipeDTO.class);
	}
	
	public RecipeDTO updateRecipeDetails( Long id ,RecipeDTO recipeDTO)
	{
		if (recipeRepository.existsById(id)) {
		Recipe recipe = recipeRepository.findById(id).orElseThrow();		
		mapper.map(recipeDTO, recipe);
		return mapper.map(recipeRepository.save(recipe), RecipeDTO.class);
		}
		throw new RecipeException("User Not Found");
	}
	
	public String deleteRecipe(Long id) {
		
		if(recipeRepository.existsById(id))
		{
			recipeRepository.deleteById(id);
			return "Recipe Deleted SuccessFully!!!";
		}
		throw new RecipeException("User Not Found");
	}

}
