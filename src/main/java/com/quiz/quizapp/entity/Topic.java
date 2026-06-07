package com.quiz.quizapp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
@Entity
public class Topic {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String  topicName;
	 @ManyToOne
	    private Subject subject;

	 
	 public Topic() {
		// TODO Auto-generated constructor stub
	}


	 public Topic(int id, String topicName, Subject subject) {
		
		this.id = id;
		this.topicName = topicName;
		this.subject = subject;
	 }


	 public int getId() {
		 return id;
	 }


	 public void setId(int id) {
		 this.id = id;
	 }


	 public String getTopicName() {
		 return topicName;
	 }


	 public void setTopicName(String topicName) {
		 this.topicName = topicName;
	 }


	 public Subject getSubject() {
		 return subject;
	 }


	 public void setSubject(Subject subject) {
		 this.subject = subject;
	 }
	 
	 
}
