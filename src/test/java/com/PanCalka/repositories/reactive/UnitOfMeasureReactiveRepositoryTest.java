package com.PanCalka.repositories.reactive;

import com.PanCalka.domain.UnitOfMeasure;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@DataMongoTest
public class UnitOfMeasureReactiveRepositoryTest {

    @Autowired
    UnitOfMeasureReactiveRepository unitOfMeasureReactiveRepository;

    @Before
    public void setUp() throws Exception {
        unitOfMeasureReactiveRepository.deleteAll().block();
    }

    @Test
    public void shouldSaveRecipe() {
        // given
        UnitOfMeasure unitOfMeasure = new UnitOfMeasure();

        //when
        unitOfMeasureReactiveRepository.save(unitOfMeasure).block();

        //then
        Long count = unitOfMeasureReactiveRepository.count().block();
        assertEquals(Long.valueOf(1L), count);
    }
}