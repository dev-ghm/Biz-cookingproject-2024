package com.callor.cooking.service;

import java.util.List;

import com.callor.cooking.models.Recipe;

public interface RecipeService {
	
	public List<Recipe> getRecipes(String recipe);
}
