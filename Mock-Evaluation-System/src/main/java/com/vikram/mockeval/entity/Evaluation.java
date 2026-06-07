package com.vikram.mockeval.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "evaluation")
public class Evaluation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "participant_id")
    private Participant participant;

    @ManyToOne
    @JoinColumn(name = "technology_id")
    private Technology technology;

    @ManyToOne
    @JoinColumn(name = "round_id")
    private Round round;

    private int marks;

    private String feedback;

    public Evaluation() {}

    public Long getId() { return id; }
    public Participant getParticipant() { return participant; }
    public Technology getTechnology() { return technology; }
    public Round getRound() { return round; }
    public int getMarks() { return marks; }
    public String getFeedback() { return feedback; }

    public void setId(Long id) { this.id = id; }
    public void setParticipant(Participant participant) { this.participant = participant; }
    public void setTechnology(Technology technology) { this.technology = technology; }
    public void setRound(Round round) { this.round = round; }
    public void setMarks(int marks) { this.marks = marks; }
    public void setFeedback(String feedback) { this.feedback = feedback; }
}