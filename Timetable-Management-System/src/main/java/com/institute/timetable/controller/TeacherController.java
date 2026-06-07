package com.institute.timetable.controller;

import com.institute.timetable.entity.Teacher;
import com.institute.timetable.service.TeacherService;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/teachers")
public class TeacherController {

    private final TeacherService teacherService;

    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    // ✅ ADMIN only - Add teacher
    @PostMapping
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public Teacher addTeacher(@RequestBody Teacher teacher) {
        return teacherService.addTeacher(teacher);
    }

    // ✅ USER + ADMIN - Get all teachers
    @GetMapping
    @PreAuthorize("hasAnyAuthority('ROLE_USER','ROLE_ADMIN')")
    public List<Teacher> getAllTeachers() {
        return teacherService.getAllActiveTeachers();
    }

    // ✅ ADMIN only - Delete teacher
    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public String deleteTeacher(@PathVariable Long id) {
        teacherService.deleteTeacher(id);
        return "Teacher deleted successfully";
    }
}
