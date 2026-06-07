package com.quiz.quizapp.repository;
import com.quiz.quizapp.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;



public interface QuestionRepository extends JpaRepository<Question, Integer>{
	Question findById(int id);

}