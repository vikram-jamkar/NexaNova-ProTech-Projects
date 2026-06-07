package com.example.trainerapp.repository;

import com.example.trainerapp.entity.Trainer;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface TrainerRepository extends JpaRepository<Trainer, Integer> {
    // Find trainers by subject name (String)
    List<Trainer> findBySubject(String subject);
}
