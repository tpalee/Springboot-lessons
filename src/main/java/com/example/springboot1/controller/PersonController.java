package com.example.springboot1.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PersonController {

    private static List<String>persons=new ArrayList<>();

    @GetMapping("/persons")
    public ResponseEntity getPersons(){
        return ResponseEntity.ok(persons);
    }

    @GetMapping("/persons/{nr}")
    public ResponseEntity getPersons(@PathVariable int nr){
        return ResponseEntity.ok(persons.get(nr));
    }

    @PostMapping("/persons")
    public ResponseEntity addPerson(@RequestBody String person){
        persons.add(person);
        return ResponseEntity.ok("added");
    }

    @DeleteMapping("/persons/{nr}")
    public ResponseEntity deletePerson(@PathVariable int nr){
        persons.remove(nr);
        return ResponseEntity.ok("deleted");
    }

    @PutMapping("/persons/{nr}")
    public ResponseEntity upDatePerson(@PathVariable int nr, @RequestBody String person){
        persons.set(nr,person);
        return ResponseEntity.ok("updated");
    }
}
