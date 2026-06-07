package com.vikram.mockeval.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name ="batch" )
public class Batch {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "batch_id")
             private Long id;
	@Column(name = "batch_name")
             private String name;
	@Column(name="start_date")
             private LocalDate startDate;
	@Column(name="end_date")
             private LocalDate endDate;
             
             
public Batch() {
	
}


public Batch(Long id, String name, LocalDate startDate, LocalDate endDate) {
	
	this.id = id;
	this.name = name;
	this.startDate = startDate;
	this.endDate = endDate;
}


public Long getId() {
	return id;
}


public void setId(Long id) {
	this.id = id;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public LocalDate getStartDate() {
	return startDate;
}


public void setStartDate(LocalDate startDate) {
	this.startDate = startDate;
}


public LocalDate getEndDate() {
	return endDate;
}


public void setEndDate(LocalDate endDate) {
	this.endDate = endDate;
}             
             
             
             
             
             
             
             
             
}
