package com.vikram.mockeval.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vikram.mockeval.entity.Round;
import com.vikram.mockeval.service.RoundService;
@CrossOrigin
@RestController
@RequestMapping("/rounds")
public class RoundController {
	
	@Autowired
	private RoundService roundservice;

	 @PostMapping
	    public Round create(@RequestBody Round r) {
	        return roundservice.save(r);
	    }
	 @PutMapping("/{id}")
	 public Round update(@PathVariable Long id, @RequestBody Round r) {
	     r.setId(id);
	     return roundservice.save(r);
	 }

	    @GetMapping
	    public List<Round> getAll() {
	        return roundservice.getAll();
	    }
	    @DeleteMapping("/{id}")
	    public void delete(@PathVariable Long id) {
	        roundservice.delete(id);
	    }
}
