package com.quiz.quizapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.quizapp.entity.Admin;
import com.quiz.quizapp.repository.AdminRepository;

@RestController
public class AdminController {
	 @Autowired
	 private AdminRepository adminRepository;
	 
	 @PostMapping("/saveAdmin")
	    public Admin saveAdmin(@RequestBody Admin admin){

	        return adminRepository.save(admin);
	 }}
