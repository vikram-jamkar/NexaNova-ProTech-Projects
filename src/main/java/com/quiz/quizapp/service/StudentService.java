package com.quiz.quizapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.quizapp.entity.Student;
import com.quiz.quizapp.repository.StudentRepository;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;
    
    public Student saveStudent(Student student) {

        return studentRepository.save(student);

    }
    public List<Student> getAllStudents(){

        return studentRepository.findAll();

    }
    public String deleteStudent(int id){

        studentRepository.deleteById(id);

        return "Student Deleted";

    }
    public Student updateStudent(Student student){

        return studentRepository.save(student);

    }
    public Student loginStudent(String email,String password){

        return studentRepository.findByEmailAndPassword(email, password);

    }
}