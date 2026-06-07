package com.institute.timetable.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity

@Table(name="courses")
public class Course {
	                  @Id
	                  @GeneratedValue(strategy = GenerationType.IDENTITY)
	                  
	                 Long id;
	                  @Column(name = "course_name", nullable = false, unique = true)
	                 String courseName;
	                 @Column(name="description")
	                 String description;
	                 @Column(name="durationInMonth")
	                 int durationInMonth;
	                 
	                 boolean active = true;
	                 public Course() {
	                	 
	                 }


	                 
	                 
	                 
	                 
					 public Course(Long id, String courseName, String description, int durationInMonth,boolean active) {
						
						this.id = id;
						this.courseName = courseName;
						this.description = description;
						this.durationInMonth = durationInMonth;
						this.active = active;
						
					}


					 public Long getId() {
						 return id;
					 }


					 public void setId(Long id) {
						 this.id = id;
					 }


					 public String getCourseName() {
						 return courseName;
					 }


					 public void setCourseName(String courseName) {
						 this.courseName = courseName;
					 }


					 public String getDescription() {
						 return description;
					 }


					 public void setDescription(String description) {
						 this.description = description;
					 }


					 public int getDurationInMonth() {
						 return durationInMonth;
					 }


					 public void setDurationInMonth(int durationInMonth) {
						 this.durationInMonth = durationInMonth;
					 }






					 public boolean isActive() {
						 return active;
					 }






					 public void setActive(boolean active) {
						 this.active = active;
					 }






					
	

}
