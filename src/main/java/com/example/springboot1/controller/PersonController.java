package com.example.springboot1.controller;

import com.example.springboot1.exception.RecordNotFoundException;
import com.example.springboot1.model.Person;
import com.example.springboot1.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class PersonController {


    @Autowired
    private PersonRepository personRepository;

    @GetMapping("/persons")
    public ResponseEntity getPersons() {

        //lijst met personen uit de database
        Iterable<Person> persons = personRepository.findAll();
        return ResponseEntity.ok(persons);

    }

    @GetMapping("/persons/{nr}")
    public ResponseEntity getPerson(@PathVariable long nr) {
        //Optional: kan zijn dat deze niet bestaat
        Optional<Person> person = personRepository.findById(nr);
        try {
            return ResponseEntity.ok(person);
        } catch (Exception ex) {
            throw new RecordNotFoundException();
        }
    }

    @PostMapping("/persons")
    public ResponseEntity addPerson(@RequestBody Person person) {
        personRepository.save(person);
        return ResponseEntity.ok("added");
    }

    @DeleteMapping("/persons/{nr}")
    public ResponseEntity deletePerson(@PathVariable long nr) {
        personRepository.deleteById(nr);
        return ResponseEntity.ok("deleted");
    }

    @PutMapping("/persons/{nr}")
    public ResponseEntity upDatePerson(@PathVariable long nr, @RequestBody Person person) {
        return ResponseEntity.ok("updated");
    }
}
