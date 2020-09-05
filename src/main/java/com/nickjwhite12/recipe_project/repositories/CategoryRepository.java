package com.nickjwhite12.recipe_project.repositories;

import com.nickjwhite12.recipe_project.model.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
