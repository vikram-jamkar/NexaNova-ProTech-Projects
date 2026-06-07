package com.vikram.mockeval.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "participant")
public class Participant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;

    @ManyToOne
    @JoinColumn(name = "batch_id")
    private Batch batch;

    @ManyToOne
    @JoinColumn(name = "technology_id")
    private Technology technology;

    public Participant() {}

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Batch getBatch() {
        return batch;
    }

    public Technology getTechnology() {
        return technology;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setBatch(Batch batch) {
        this.batch = batch;
    }

    public void setTechnology(Technology technology) {
        this.technology = technology;
    }
}