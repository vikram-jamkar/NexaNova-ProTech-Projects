package com.vikram.mockeval.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vikram.mockeval.entity.Technology;

public interface TechnologyRepository  extends JpaRepository<Technology, Long>{
	

}
