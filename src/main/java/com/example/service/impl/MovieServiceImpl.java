package com.example.service.impl;

import com.example.controller.MovieController;
import com.example.model.Movie;
import com.example.model.MovieDTO;
import com.example.repository.MovieRepository;
import com.example.service.MovieService;
import lombok.AllArgsConstructor;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@Service
@AllArgsConstructor
public class MovieServiceImpl implements MovieService {

    private MovieRepository movieRepository;

    @Override
    public ResponseEntity<EntityModel<Movie>> getMovie(Long id) {

        Movie movie = movieRepository.findById(id).orElse(null);

        if (movie == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(new EntityModel<>(movie,
                linkTo(methodOn(MovieController.class).getMovie(movie.getId())).withSelfRel()));
    }

    @Override
    public ResponseEntity<CollectionModel<MovieDTO>> getMovies() {

        List<MovieDTO> movies = movieRepository.findAllBy();

        return ResponseEntity.ok(new CollectionModel<>(movies,
                linkTo(methodOn(MovieController.class).getMovies()).withSelfRel()));
    }
}
