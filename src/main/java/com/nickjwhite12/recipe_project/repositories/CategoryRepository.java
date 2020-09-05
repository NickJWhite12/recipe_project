package com.nickjwhite12.recipe_project.repositories;

import com.nickjwhite12.recipe_project.model.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CategoryRepository extends CrudRepository<Category, Long> {

    Optional<Category> findByCategoryName(String CategoryName);
}
