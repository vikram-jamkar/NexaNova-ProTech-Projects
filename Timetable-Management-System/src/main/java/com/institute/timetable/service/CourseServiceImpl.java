package com.institute.timetable.service;

import com.institute.timetable.entity.Course;
import com.institute.timetable.repository.CourseRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements Courseservice {

    private final CourseRepository courseRepository;

    public CourseServiceImpl(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @Override
    public Course addCourse(Course course) {
        return courseRepository.save(course);
    }

    @Override
    public List<Course> getAllActiveCourses() {
        return courseRepository.findByActiveTrue();
    }@Override
    public void deleteCourse(Long id) {
        courseRepository.deleteById(id);
    }
}
