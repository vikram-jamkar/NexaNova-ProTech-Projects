package com.quiz.quizapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.quizapp.entity.Result;
import com.quiz.quizapp.repository.ResultRepository;

@Service
public class ResultService {

    @Autowired
    ResultRepository resultRepository;

    public Result saveResult(Result result) {

        return resultRepository.save(result);

    }
    public List<Result> getAllResults(){

        return resultRepository.findAll();

    }
    public List<Result> getResultsByStudentId(int studentId){

        return resultRepository.findByStudent_Id(studentId);

    }

}