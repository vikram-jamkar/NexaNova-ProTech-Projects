package com.vikram.mockeval.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vikram.mockeval.entity.Technology;
import com.vikram.mockeval.repository.TechnologyRepository;
@Service
public class TechnologyService {
	@Autowired
	private TechnologyRepository technologyRepository;
	
	public Technology saveTechnology(Technology tech) {
        return technologyRepository.save(tech);
    }
	 public List<Technology> getAllTechnologies() {
	        return technologyRepository.findAll();
	 }
	 public Technology getTechnologyById(Long id) {
	        return technologyRepository.findById(id).orElse(null);
	    }
	 public void deleteTechnology(Long id) {
	        technologyRepository.deleteById(id);
	    }
}
