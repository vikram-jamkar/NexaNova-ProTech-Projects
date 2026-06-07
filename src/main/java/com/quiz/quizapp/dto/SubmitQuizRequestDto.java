package com.quiz.quizapp.dto;

import java.util.List;

public class SubmitQuizRequestDto {

    private int studentId;

    private int quizId;

    private List<QuizSubmitDto> answers;
    
    public SubmitQuizRequestDto() {
		// TODO Auto-generated constructor stub
	}

	public SubmitQuizRequestDto(int studentId, int quizId, List<QuizSubmitDto> answers) {
		
		this.studentId = studentId;
		this.quizId = quizId;
		this.answers = answers;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public int getQuizId() {
		return quizId;
	}

	public void setQuizId(int quizId) {
		this.quizId = quizId;
	}

	public List<QuizSubmitDto> getAnswers() {
		return answers;
	}

	public void setAnswers(List<QuizSubmitDto> answers) {
		this.answers = answers;
	}
    

}