package com.quiz.quizapp.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Quiz {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String quizName;
    private int duration;
    private String quizDate;
    private String quizTime;
    
    public Quiz() {
		// TODO Auto-generated constructor stub
	}
    
    
    
    
    


	public Quiz(int id, String quizName, int duration, String quizDate, String quizTime, List<Question> questions) {
	
		this.id = id;
		this.quizName = quizName;
		this.duration = duration;
		this.quizDate = quizDate;
		this.quizTime = quizTime;
		this.questions = questions;
	}







	public int getDuration() {
		return duration;
	}







	public void setDuration(int duration) {
		this.duration = duration;
	}







	public String getQuizDate() {
		return quizDate;
	}







	public void setQuizDate(String quizDate) {
		this.quizDate = quizDate;
	}

	public String getQuizTime() {
		return quizTime;
	}


	public void setQuizTime(String quizTime) {
		this.quizTime = quizTime;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getQuizName() {
		return quizName;
	}


	public void setQuizName(String quizName) {
		this.quizName = quizName;
	}


	public List<Question> getQuestions() {
		return questions;
	}


	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}




	@ManyToMany
    private List<Question> questions;

}