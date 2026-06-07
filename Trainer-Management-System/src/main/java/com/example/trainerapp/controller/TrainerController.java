package com.example.trainerapp.controller;

import com.example.trainerapp.entity.Trainer;
import com.example.trainerapp.repository.TrainerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.http.HttpStatus;
import jakarta.validation.Valid;

import java.util.List;
import java.util.Map;
@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/trainer")
public class TrainerController {

    @Autowired
    private TrainerRepository trainerRepository;

    // ------------------- CREATE -------------------
    @PostMapping
    public Trainer addTrainer(@Valid @RequestBody Trainer trainer) {
        return trainerRepository.save(trainer);
    }

    
    @GetMapping
    public List<Trainer> getAllTrainers() {
        return trainerRepository.findAll();
    }

    @GetMapping("/{id}")
    public Trainer getTrainerById(@PathVariable Integer id) {
        return trainerRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Trainer not found"));
    }

    @GetMapping("/subject/{subjectName}")
    public List<Trainer> getTrainersBySubject(@PathVariable String subjectName) {
        return trainerRepository.findBySubject(subjectName);
    }

    // ------------------- UPDATE -------------------
    @PutMapping("/{id}")
    public Trainer updateTrainer(@PathVariable Integer id, @RequestBody Trainer updatedTrainer) {
        Trainer trainer = trainerRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Trainer not found"));

        trainer.setName(updatedTrainer.getName());
        trainer.setExperience(updatedTrainer.getExperience());
        trainer.setSpecialization(updatedTrainer.getSpecialization());
        trainer.setSubject(updatedTrainer.getSubject());

        return trainerRepository.save(trainer);
    }

    // ------------------- DELETE -------------------
    @DeleteMapping("/{id}")
    public Map<String, String> deleteTrainer(@PathVariable Integer id) {
        Trainer trainer = trainerRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Trainer not found"));

        trainerRepository.delete(trainer);
        return Map.of("message", "Trainer with id " + id + " deleted successfully!");
    }
}
