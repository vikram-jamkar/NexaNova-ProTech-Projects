package com.quiz.quizapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quiz.quizapp.entity.Result;

public interface ResultRepository extends JpaRepository<Result, Integer>{
	 List<Result> findByStudent_Id(int studentId);

}