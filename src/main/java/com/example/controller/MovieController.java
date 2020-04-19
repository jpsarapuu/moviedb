package com.example.controller;

import com.example.model.Movie;
import com.example.model.MovieDTO;
import com.example.service.MovieService;
import lombok.AllArgsConstructor;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("movies")
@AllArgsConstructor
public class MovieController {

    private MovieService movieService;

    @GetMapping("{id}")
    public ResponseEntity<EntityModel<Movie>> getMovie(@PathVariable Long id) {
        return movieService.getMovie(id);
    }

    @GetMapping("")
    public ResponseEntity<CollectionModel<MovieDTO>> getMovies() {
        return movieService.getMovies();
    }
}
