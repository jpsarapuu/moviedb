package com.example.service;

import com.example.model.Movie;
import com.example.model.MovieDTO;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.http.ResponseEntity;

public interface MovieService {

    ResponseEntity<EntityModel<Movie>> getMovie(Long id);

    ResponseEntity<CollectionModel<EntityModel<MovieDTO>>> getMovies();
}
