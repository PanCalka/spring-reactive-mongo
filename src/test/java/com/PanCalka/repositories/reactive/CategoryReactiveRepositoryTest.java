package com.PanCalka.repositories.reactive;

import com.PanCalka.domain.Category;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.test.context.junit4.SpringRunner;
import reactor.core.publisher.Mono;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@DataMongoTest
public class CategoryReactiveRepositoryTest {

    private static final String TEST_DESCRIPTION = "test";

    @Autowired
    CategoryReactiveRepository categoryReactiveRepository;

    @Before
    public void setUp() throws Exception {
        categoryReactiveRepository.deleteAll().block();
    }

    @Test
    public void shouldSaveRecipe() {
        // given
        Category category = new Category();

        //when
        categoryReactiveRepository.save(category).block();

        //then
        Long count = categoryReactiveRepository.count().block();
        assertEquals(Long.valueOf(1L), count);
    }
    @Test
    public void shouldFindByDescription() {
        // given
        Category category = new Category();
        category.setDescription(TEST_DESCRIPTION);
        categoryReactiveRepository.save(category).block();

        //when
        Category testCategory = categoryReactiveRepository.findByDescription(TEST_DESCRIPTION).block();

        //then
        assertNotNull(testCategory.getId());
    }
}