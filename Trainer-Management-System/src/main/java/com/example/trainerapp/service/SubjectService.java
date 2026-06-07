package com.example.trainerapp.service;

import com.example.trainerapp.entity.Subject;
import com.example.trainerapp.entity.Trainer;
import com.example.trainerapp.repository.SubjectRepository;
import com.example.trainerapp.repository.TrainerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectService {

    @Autowired
    private SubjectRepository subjectRepository;

    @Autowired
    private TrainerRepository trainerRepository;

    // Get all subjects
    public List<Subject> getAllSubjects() {
        return subjectRepository.findAll();
    }

    // Get subject by ID
    public Subject getSubjectById(Integer id) {
        return subjectRepository.findById(id).orElse(null);
    }

    // Get trainers teaching a particular subject by subject ID
    public List<Trainer> getTrainersBySubjectId(Integer id) {
        Subject subject = subjectRepository.findById(id).orElse(null);
        if (subject == null) return null;
        return trainerRepository.findBySubject(subject.getSubjectName()); // fixed
    }

    // Add new subject
    public Subject addSubject(Subject subject) {
        boolean exists = subjectRepository.findAll().stream()
                .anyMatch(s -> s.getSubjectName().equalsIgnoreCase(subject.getSubjectName()));
        if (exists) {
            throw new RuntimeException("Subject with this name already exists!");
        }
        return subjectRepository.save(subject);
    }

    // Update subject
    public Subject updateSubject(Integer id, Subject updatedSubject) {
        Subject existing = subjectRepository.findById(id).orElse(null);
        if (existing == null) return null;

        existing.setSubjectName(updatedSubject.getSubjectName());
        existing.setDescription(updatedSubject.getDescription());

        return subjectRepository.save(existing);
    }

    // Delete subject
    public void deleteSubject(Integer id) {
        subjectRepository.deleteById(id);
    }
}
