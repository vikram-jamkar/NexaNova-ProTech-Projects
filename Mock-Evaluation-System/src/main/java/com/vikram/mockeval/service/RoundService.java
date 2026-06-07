package com.vikram.mockeval.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vikram.mockeval.entity.Round;
import com.vikram.mockeval.repository.RoundRepository;

@Service
public class RoundService {
	
	@Autowired
	private RoundRepository roundRepository;
	
	 public Round save(Round r) {
	        return roundRepository.save(r);
	    }
	 public List<Round> getAll() {
	        return roundRepository.findAll();
	    }
	 
	 public void delete(Long id) {
		    roundRepository.deleteById(id);
		}
}
