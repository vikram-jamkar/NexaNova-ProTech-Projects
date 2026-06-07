package com.quiz.quizapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.quizapp.entity.Student;
import com.quiz.quizapp.service.StudentService;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("/saveStudent")
    public Student saveStudent(@RequestBody Student student) {

        return studentService.saveStudent(student);

    }
    @GetMapping("/getAllStudents")
    public List<Student> getAllStudents(){

        return studentService.getAllStudents();

    }
    @DeleteMapping("/deleteStudent/{id}")
    public String deleteStudent(@PathVariable int id){

        return studentService.deleteStudent(id);

    }@PutMapping("/updateStudent")
    public Student updateStudent(@RequestBody Student student){

        return studentService.updateStudent(student);

    }
    @PostMapping("/loginStudent")
    public Student loginStudent(@RequestBody Student student){

        return studentService.loginStudent(student.getEmail(), student.getPassword());

    }
    
}