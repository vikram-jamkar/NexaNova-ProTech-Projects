package com.quiz.quizapp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Result {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int marks;

    @ManyToOne
    private Student student;

    @ManyToOne
    private Quiz quiz;
    
    private double percentage;
public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
public Result() {
	// TODO Auto-generated constructor stub
}
public Result(int id, int marks, Student student, Quiz quiz) {

	this.id = id;
	this.marks = marks;
	this.student = student;
	this.quiz = quiz;
	
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getMarks() {
	return marks;
}
public void setMarks(int marks) {
	this.marks = marks;
}
public Student getStudent() {
	return student;
}
public void setStudent(Student student) {
	this.student = student;
}
public Quiz getQuiz() {
	return quiz;
}
public void setQuiz(Quiz quiz) {
	this.quiz = quiz;
}



}