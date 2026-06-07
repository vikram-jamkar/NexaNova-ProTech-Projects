package com.quiz.quizapp.dto;

public class QuizSubmitDto {

    private int questionId;

    private String selectedAnswer;
    
    public QuizSubmitDto() {
		// TODO Auto-generated constructor stub
	}

	public QuizSubmitDto(int questionId, String selectedAnswer) {
		
		this.questionId = questionId;
		this.selectedAnswer = selectedAnswer;
	}

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public String getSelectedAnswer() {
		return selectedAnswer;
	}

	public void setSelectedAnswer(String selectedAnswer) {
		this.selectedAnswer = selectedAnswer;
	}
    
    

}