package com.nickjwhite12.recipe_project.repositories;

import com.nickjwhite12.recipe_project.model.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
