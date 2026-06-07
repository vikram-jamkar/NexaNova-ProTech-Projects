package com.institute.timetable.repository;

import com.institute.timetable.entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SubjectRepository extends JpaRepository<Subject, Long> {

    List<Subject> findByActiveTrue();
}
