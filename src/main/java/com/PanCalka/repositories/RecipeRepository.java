package com.PanCalka.repositories;

import com.PanCalka.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, String> {
}
