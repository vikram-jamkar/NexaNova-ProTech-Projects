package com.institute.timetable.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.institute.timetable.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Long>{

	
	  // Sirf active courses lane ke liye
    List<Course> findByActiveTrue();
    // Course name se search (duplicate check)
    boolean existsByCourseName(String courseName);

}
