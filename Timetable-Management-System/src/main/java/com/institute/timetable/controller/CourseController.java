package com.institute.timetable.controller;

import com.institute.timetable.entity.Course;
import com.institute.timetable.service.Courseservice;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/courses")
public class CourseController {

    private final Courseservice courseService;

    public CourseController(Courseservice courseService) {
        this.courseService = courseService;
    }

    
    

    
 // ✅ ADMIN only
    @PostMapping
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")

    public Course addCourse1(@RequestBody Course course) {
        return courseService.addCourse(course);
    }

    // ✅ USER + ADMIN
    @GetMapping
    @PreAuthorize("hasAnyAuthority('ROLE_USER','ROLE_ADMIN')")
   
    public List<Course> getAllActiveCourses() {
        return courseService.getAllActiveCourses();
    }// ⭐ ADD THIS METHOD HERE
    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public void deleteCourse(@PathVariable Long id) {
        courseService.deleteCourse(id);
    }
}
