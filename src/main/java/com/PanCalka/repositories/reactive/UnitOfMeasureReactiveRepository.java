package com.PanCalka.repositories.reactive;

import com.PanCalka.domain.UnitOfMeasure;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

/**
 * Created by jt on 8/17/17.
 */
public interface UnitOfMeasureReactiveRepository extends ReactiveMongoRepository<UnitOfMeasure, String> {
}
