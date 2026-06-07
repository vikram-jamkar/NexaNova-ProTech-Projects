package com.institute.timetable.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="name")
    @NotBlank(message = "Name is required")
    private String name;

    @Column(name="email")
    @NotBlank(message = "Email is required")
    private String email;

    @Column(name="password")
    @NotBlank(message ="Password is required")
    @Size(min = 4 , message = "Password must be at least 4 characters")
    private String password;

    @Column(name="role")
    @NotBlank(message = "Role is required")
    private String role;

    /* Student Enrollment */
    @ManyToOne
    @JoinColumn(name="batch_id")
    private Batch batch;

    public User() {}

    public User(Long id, String name, String email, String password, String role, Batch batch) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.role = role;
        this.batch = batch;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }

    public Batch getBatch() {
        return batch;
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

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setBatch(Batch batch) {
        this.batch = batch;
    }
}