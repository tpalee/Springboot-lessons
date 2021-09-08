package com.example.springboot1.repository;

import com.example.springboot1.model.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Long> {
}
