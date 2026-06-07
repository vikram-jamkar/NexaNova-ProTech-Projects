package com.institute.timetable.service;



import com.institute.timetable.entity.Course;
import java.util.List;

public interface Courseservice {

    Course addCourse(Course course);

    List<Course> getAllActiveCourses();
    void deleteCourse(Long id);
}
