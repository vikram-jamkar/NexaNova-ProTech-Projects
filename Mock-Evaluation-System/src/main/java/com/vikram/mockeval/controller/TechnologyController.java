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

import com.vikram.mockeval.entity.Technology;
import com.vikram.mockeval.service.TechnologyService;
@CrossOrigin
@RestController
@RequestMapping("/technologies")
public class TechnologyController {
	@Autowired
	private TechnologyService technologyService;
	

    @PostMapping
    public Technology create(@RequestBody Technology tech){
        return technologyService.saveTechnology(tech);
    }
	
    @GetMapping
    public List<Technology> getAll(){
        return technologyService.getAllTechnologies();
    }
    @GetMapping("/{id}")
    public Technology getById(@PathVariable Long id){
        return technologyService.getTechnologyById(id);
    }
    @PutMapping("/{id}")
    public Technology update(@PathVariable Long id, @RequestBody Technology tech) {
        tech.setId(id);
        return technologyService.saveTechnology(tech);
    }
    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id){
        technologyService.deleteTechnology(id);
        return "Deleted Successfully";
    }
    

}
