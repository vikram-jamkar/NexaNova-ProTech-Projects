package com.quiz.quizapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quiz.quizapp.entity.Subject;

public interface SubjectRepository extends JpaRepository<Subject, Integer>{

}