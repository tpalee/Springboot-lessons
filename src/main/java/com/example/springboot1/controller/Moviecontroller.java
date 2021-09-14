package com.example.springboot1.controller;

import com.example.springboot1.exception.RecordNotFoundException;
import com.example.springboot1.model.Movie;
import com.example.springboot1.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class Moviecontroller {


    @Autowired
    private MovieRepository movieRepository;

    @GetMapping("/movies")
    public ResponseEntity getMovies() {

        //lijst met personen uit de database
        Iterable<Movie> movies =movieRepository.findAll();
        return ResponseEntity.ok(movies);

    }

    @GetMapping("/movies/{nr}")
    public ResponseEntity getMovie(@PathVariable long nr) {
        //Optional: kan zijn dat deze niet bestaat
        Optional<Movie> movie = movieRepository.findById(nr);
        try {
            return ResponseEntity.ok(movie);
        } catch (Exception ex) {
            throw new RecordNotFoundException();
        }
    }

    @PostMapping("/movies")
    public ResponseEntity addMovie(@RequestBody Movie movie) {
        movieRepository.save(movie);
        return ResponseEntity.ok("added movie");
    }

    @DeleteMapping("/movies/{nr}")
    public ResponseEntity deleteMovie(@PathVariable long nr) {
        movieRepository.deleteById(nr);
        return ResponseEntity.ok("deleted movie");
    }

    @PutMapping("/movies/{nr}")
    public ResponseEntity upDateMovie(@PathVariable long nr, @RequestBody Movie movie) {
        return ResponseEntity.ok("updated movie");
    }




}
