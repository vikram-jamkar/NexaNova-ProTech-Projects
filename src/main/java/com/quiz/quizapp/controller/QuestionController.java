package com.quiz.quizapp.controller;

import com.quiz.quizapp.dto.SubmitQuizRequestDto;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.quizapp.entity.Question;
import com.quiz.quizapp.entity.Quiz;
import com.quiz.quizapp.entity.Result;
import com.quiz.quizapp.entity.Student;

import com.quiz.quizapp.service.QuestionService;
import com.quiz.quizapp.service.ResultService;

@RestController
public class QuestionController {

    @Autowired
    QuestionService questionService;

    @Autowired
    ResultService resultService;

    @PostMapping("/saveQuestion")
    public Question saveQuestion(@RequestBody Question question) {

        return questionService.saveQuestion(question);

    }

    @GetMapping("/getAllQuestion")
    public List<Question> getAllQuestion(){

        return questionService.getAllQuestion();

    }

    @PostMapping("/submitQuiz")
    public double submitQuiz(@RequestBody SubmitQuizRequestDto request){

        int score = questionService.calculateScore(request.getAnswers());

        int totalQuestions = request.getAnswers().size();

        double percentage =
                questionService.calculatePercentage(score, totalQuestions);

        Result result = new Result();

        Student student = new Student();

        student.setId(request.getStudentId());

        Quiz quiz = new Quiz();

        quiz.setId(request.getQuizId());

        result.setMarks(score);

        result.setPercentage(percentage);

        result.setStudent(student);

        result.setQuiz(quiz);

        resultService.saveResult(result);

        return percentage;

    }

}