package com.example.springboot1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuestionsController {

    private String[] questions = {
            "Where is Amsterdam",
            "Where is New York"
    };
    private String[] answers = {
            "in china",
            "ook in china"
    };


    @GetMapping(value = "/questions")
    public String[] getAllQuestions(){
        return questions;
    }


    @GetMapping(value = "/questions/{nr}")
    public String getSpecificQuestion(@PathVariable int nr){
        return questions[nr - 1];
    }


    @GetMapping(value = "/questions/{nr}/answer")
    public String getSpecificAnswer(@PathVariable int nr){
        return answers[nr - 1];
    }

}
