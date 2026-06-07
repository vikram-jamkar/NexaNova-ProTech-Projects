package com.quiz.quizapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quiz.quizapp.entity.Quiz;

public interface QuizRepository extends JpaRepository<Quiz, Integer>{

}