package com.quiz.quizapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.quizapp.entity.Subject;
import com.quiz.quizapp.repository.SubjectRepository;

@Service
public class SubjectService {

    @Autowired
    SubjectRepository subjectRepository;

    public Subject saveSubject(Subject subject) {

        return subjectRepository.save(subject);

    }

}