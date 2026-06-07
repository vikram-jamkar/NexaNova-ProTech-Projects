package com.institute.timetable.repository;

import com.institute.timetable.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {

    // Only active teachers
    List<Teacher> findByActiveTrue();

    // Find teacher by email
    Teacher findByEmail(String email);
}
