package com.vikram.mockeval.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vikram.mockeval.entity.Evaluation;

public interface EvaluationRepository extends JpaRepository<Evaluation, Long> {
}