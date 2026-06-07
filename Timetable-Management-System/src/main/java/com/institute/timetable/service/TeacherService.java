package com.institute.timetable.service;

import com.institute.timetable.entity.Teacher;

import java.util.List;

public interface TeacherService {

    // Add new teacher
    Teacher addTeacher(Teacher teacher);

    // Get all active teachers
    List<Teacher> getAllActiveTeachers();

    // Get teacher by ID
    Teacher getTeacherById(Long id);

    // Delete teacher by ID
    void deleteTeacher(Long id);
}
