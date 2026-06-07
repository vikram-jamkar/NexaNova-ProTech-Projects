package com.quiz.quizapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quiz.quizapp.entity.Admin;

public interface AdminRepository extends JpaRepository<Admin,Integer>{

}
