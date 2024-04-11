package com.learn.movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class MovieService {
    @Autowired
    private MovieService movieService;
    @Autowired
    private MovieRepository movieRepository;
     @GetMapping
    public List<Movie> AllMovies(){
            return movieRepository.findAll();
        }
}

