package com.example.trainerapp.repository;

import com.example.trainerapp.entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository interface for Subject entity.
 * Extends JpaRepository to provide CRUD operations.
 * No custom methods are required at this stage.
 */
public interface SubjectRepository extends JpaRepository<Subject, Integer> {
    // Standard CRUD methods are available by default:
    // save(), findAll(), findById(), deleteById(), etc.
}
