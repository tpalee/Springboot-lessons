package com.example.springboot1.repository;

        import com.example.springboot1.model.Movie;
        import org.springframework.data.repository.CrudRepository;

public interface MovieRepository extends CrudRepository<Movie, Long> {
}