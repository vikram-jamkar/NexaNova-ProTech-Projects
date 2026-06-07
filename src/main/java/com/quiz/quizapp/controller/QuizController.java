package com.quiz.quizapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.quizapp.entity.Quiz;
import com.quiz.quizapp.service.QuizService;

@RestController
public class QuizController {

    @Autowired
    QuizService quizService;

    @PostMapping("/saveQuiz")
    public Quiz saveQuiz(@RequestBody Quiz quiz) {

        return quizService.saveQuiz(quiz);

    }
    @GetMapping("/getAllQuiz")
    public List<Quiz> getAllQuiz(){

        return quizService.getAllQuiz();

    }
    
    

    }

