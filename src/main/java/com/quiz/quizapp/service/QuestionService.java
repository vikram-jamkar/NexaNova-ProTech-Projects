package com.quiz.quizapp.service;
import com.quiz.quizapp.dto.QuizSubmitDto;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.quizapp.entity.Question;
import com.quiz.quizapp.repository.QuestionRepository;

@Service
public class QuestionService {

    @Autowired
    QuestionRepository questionRepository;
    

    public Question saveQuestion(Question question) {

        return questionRepository.save(question);

    }
    public List<Question> getAllQuestion(){

        return questionRepository.findAll();

    }
    public int calculateScore(List<QuizSubmitDto> answers){

        int score = 0;

        for(QuizSubmitDto dto : answers){

            Question question = questionRepository.findById(dto.getQuestionId());

            if(question.getCorrectAnswer().equals(dto.getSelectedAnswer())){

                score++;

            }

        }

        return score;

    }
    public double calculatePercentage(int score,int totalQuestion){

        return (score * 100.0) / totalQuestion;

    }

}