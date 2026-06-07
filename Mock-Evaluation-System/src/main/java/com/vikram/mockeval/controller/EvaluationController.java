package com.vikram.mockeval.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vikram.mockeval.entity.Evaluation;
import com.vikram.mockeval.service.EvaluationService;
@CrossOrigin
@RestController
@RequestMapping("/evaluations")
public class EvaluationController {

    @Autowired
    private EvaluationService evaluationService;

    @PostMapping
    public Evaluation create(@RequestBody Evaluation e) {
        return evaluationService.save(e);
    }

    @GetMapping
    public List<Evaluation> getAll() {
        return evaluationService.getAll();
    }
}