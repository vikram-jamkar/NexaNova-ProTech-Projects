package com.institute.timetable.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.institute.timetable.entity.User;

public interface UserRepository extends JpaRepository<User, Long>

{

	User findByEmail(String email);

}
