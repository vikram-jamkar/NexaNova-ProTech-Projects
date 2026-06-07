package com.quiz.quizapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.quizapp.entity.Subject;
import com.quiz.quizapp.service.SubjectService;

@RestController
public class SubjectController {

    @Autowired
    SubjectService subjectService;

    @PostMapping("/saveSubject")
    public Subject saveSubject(@RequestBody Subject subject) {

        return subjectService.saveSubject(subject);

    }

}