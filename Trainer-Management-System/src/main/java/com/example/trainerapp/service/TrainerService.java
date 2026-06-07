package com.example.trainerapp.service;

import com.example.trainerapp.entity.Trainer;
import com.example.trainerapp.repository.TrainerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainerService {

    @Autowired
    private TrainerRepository trainerRepository;

    //  Get all trainers
    public List<Trainer> getAllTrainers() {
        return trainerRepository.findAll();
    }

    //  Get trainer by ID
    public Trainer getTrainerById(Integer id) {
        return trainerRepository.findById(id).orElse(null);
    }

    // Get trainers by subject name
    public List<Trainer> getTrainersBySubject(String subjectName) {
        return trainerRepository.findBySubject(subjectName);
    }

    // Add new trainer
    public Trainer addTrainer(Trainer trainer) {
        return trainerRepository.save(trainer);
    }

    //  Update trainer
    public Trainer updateTrainer(Integer id, Trainer updatedTrainer) {
        Trainer existing = trainerRepository.findById(id).orElse(null);
        if (existing == null) return null;

        existing.setName(updatedTrainer.getName());
        existing.setExperience(updatedTrainer.getExperience());
        existing.setSpecialization(updatedTrainer.getSpecialization());
        existing.setSubject(updatedTrainer.getSubject());

        return trainerRepository.save(existing);
    }

    // 6️Delete trainer
    public void deleteTrainer(Integer id) {
        trainerRepository.deleteById(id);
    }
}
