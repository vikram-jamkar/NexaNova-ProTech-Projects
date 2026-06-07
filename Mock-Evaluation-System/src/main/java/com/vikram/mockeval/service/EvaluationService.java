package com.vikram.mockeval.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vikram.mockeval.entity.Evaluation;
import com.vikram.mockeval.repository.EvaluationRepository;

@Service
public class EvaluationService {

    @Autowired
    private EvaluationRepository evaluationRepository;

    public Evaluation save(Evaluation e) {
        return evaluationRepository.save(e);
    }

    public List<Evaluation> getAll() {
        return evaluationRepository.findAll();
    }
}