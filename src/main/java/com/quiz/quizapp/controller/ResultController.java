package com.quiz.quizapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.quizapp.entity.Result;
import com.quiz.quizapp.service.ResultService;

@RestController
public class ResultController {

    @Autowired
    ResultService resultService;

    @PostMapping("/saveResult")
    public Result saveResult(@RequestBody Result result) {

        return resultService.saveResult(result);

    }
    @GetMapping("/getAllResults")
    public List<Result> getAllResults(){

        return resultService.getAllResults();

    }
    @GetMapping("/getResultsByStudent/{studentId}")
    public List<Result> getResultsByStudentId(
            @PathVariable int studentId){

        return resultService.getResultsByStudentId(studentId);

    }
}