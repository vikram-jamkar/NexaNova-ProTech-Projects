package com.quiz.quizapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quiz.quizapp.entity.Topic;

public interface TopicRepository extends JpaRepository<Topic, Integer>{

}