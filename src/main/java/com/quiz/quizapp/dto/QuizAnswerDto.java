package com.quiz.quizapp.dto;

import java.util.List;

public class QuizAnswerDto {

    private List<QuizSubmitDto> answers;
    public QuizAnswerDto() {
		// TODO Auto-generated constructor stub
	}
	public QuizAnswerDto(List<QuizSubmitDto> answers) {
		super();
		this.answers = answers;
	}
	public List<QuizSubmitDto> getAnswers() {
		return answers;
	}
	public void setAnswers(List<QuizSubmitDto> answers) {
		this.answers = answers;
	}
    

}