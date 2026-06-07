package com.quiz.quizapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quiz.quizapp.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{
	Student findByEmailAndPassword(String email,String password);

}