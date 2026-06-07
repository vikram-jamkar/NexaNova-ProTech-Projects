package com.quiz.quizapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.quizapp.entity.Quiz;
import com.quiz.quizapp.repository.QuizRepository;
import java.util.List;



@Service
public class QuizService {

    @Autowired
    QuizRepository quizRepository;

    public Quiz saveQuiz(Quiz quiz) {

        return quizRepository.save(quiz);}
        
        public List<Quiz> getAllQuiz(){

            return quizRepository.findAll();

        

    }

}