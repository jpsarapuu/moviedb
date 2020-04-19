package com.example.repository;

import com.example.model.Movie;
import com.example.model.MovieDTO;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MovieRepository extends CrudRepository<Movie, Long> {

    List<MovieDTO> findAllBy();
}
