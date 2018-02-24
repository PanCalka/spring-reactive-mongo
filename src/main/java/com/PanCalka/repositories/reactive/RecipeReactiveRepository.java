package com.PanCalka.repositories.reactive;

import com.PanCalka.domain.Recipe;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface RecipeReactiveRepository extends ReactiveMongoRepository<Recipe, String>{
}
