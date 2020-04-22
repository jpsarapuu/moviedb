package com.example.service;

import com.example.model.Category;
import com.example.model.Movie;
import com.example.model.MovieDTO;
import com.example.repository.CategoryRepository;
import com.example.repository.MovieRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class MovieServiceTest {

    @Autowired
    MovieService movieService;

    @Autowired
    MovieRepository movieRepository;

    @Autowired
    CategoryRepository categoryRepository;

    static Long TEST_MOVIE_ID;
    static Long TEST_CATEGORY_ID;

    @BeforeEach
    void setUp() {
        Category test = new Category("Test");
        TEST_CATEGORY_ID = categoryRepository.save(test).getId();

        Movie viimneReliikvia = Movie.builder().id(-1L).title("Viimne Reliikvia")
                .category(test).year(1969).rating(7.8)
                .description("A medieval love story with lots of adventures.").build();
        TEST_MOVIE_ID = movieRepository.save(viimneReliikvia).getId();
    }

    @AfterEach
    void tearDown() {
        movieRepository.deleteById(TEST_MOVIE_ID);
        categoryRepository.deleteById(TEST_CATEGORY_ID);
    }

    @Test
    void getMovie() {
        ResponseEntity<EntityModel<Movie>> responseEntity = movieService.getMovie(TEST_MOVIE_ID);

        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        assertNotNull(responseEntity.getBody());
        assertNotNull(responseEntity.getBody().getContent());
        assertEquals(TEST_MOVIE_ID, responseEntity.getBody().getContent().getId());
    }

    @Test
    void getMovies() {
        ResponseEntity<CollectionModel<EntityModel<MovieDTO>>> responseEntity = movieService.getMovies();
        long movieCount = movieRepository.findAllBy().size();

        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        assertNotNull(responseEntity.getBody());
        assertNotNull(responseEntity.getBody().getContent());
        assertEquals(movieCount, responseEntity.getBody().getContent().size());
    }
}