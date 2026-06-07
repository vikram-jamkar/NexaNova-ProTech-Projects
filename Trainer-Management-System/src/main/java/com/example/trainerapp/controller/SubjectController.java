package com.example.trainerapp.controller;

import com.example.trainerapp.entity.Subject;
import com.example.trainerapp.entity.Trainer;
import com.example.trainerapp.repository.SubjectRepository;
import com.example.trainerapp.repository.TrainerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.http.HttpStatus;

import java.util.List;
import java.util.Map;
@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/subject")
public class SubjectController {

    @Autowired
    private SubjectRepository subjectRepository;

    @Autowired
    private TrainerRepository trainerRepository;

    // ------------------- CREATE -------------------
    @PostMapping
    public Subject addSubject(@RequestBody Subject subject) {
        return subjectRepository.save(subject);
    }

    // ------------------- READ -------------------
    @GetMapping
    public List<Subject> getAllSubjects() {
        return subjectRepository.findAll();
    }

    @GetMapping("/{id}")
    public SubjectWithTrainers getSubjectWithTrainers(@PathVariable Integer id) {
        Subject subject = subjectRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Subject not found"));

        // use subjectName because Trainer.subject is String
        List<Trainer> trainers = trainerRepository.findBySubject(subject.getSubjectName());
        return new SubjectWithTrainers(subject, trainers);
    }


    @PutMapping("/{id}")
    public Subject updateSubject(@PathVariable Integer id, @RequestBody Subject updatedSubject) {
        Subject subject = subjectRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Subject not found"));

       
        subject.setDescription(updatedSubject.getDescription());

        return subjectRepository.save(subject);
    }

    // ------------------- DELETE -------------------
    @DeleteMapping("/{id}")
    public Map<String, String> deleteSubject(@PathVariable Integer id) {
        Subject subject = subjectRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Subject not found"));

        subjectRepository.delete(subject);
        return Map.of("message", "Subject with id " + id + " deleted successfully!");
    }

    // ------------------- DTO -------------------
    public static class SubjectWithTrainers {
        private Subject subject;
        private List<Trainer> trainers;

        public SubjectWithTrainers(Subject subject, List<Trainer> trainers) {
            this.subject = subject;
            this.trainers = trainers;
        }

        public Subject getSubject() { return subject; }
        public List<Trainer> getTrainers() { return trainers; }
    }
}
