package com.vikram.mockeval.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.vikram.mockeval.entity.Participant;
import com.vikram.mockeval.service.ParticipantService;
@CrossOrigin
@RestController
@RequestMapping("/participants")
public class ParticipantController {

    @Autowired
    private ParticipantService participantService;

    // Create participant
    @PostMapping
    public Participant create(@RequestBody Participant p) {
        return participantService.save(p);
    }

    // Get all participants
    @GetMapping
    public List<Participant> getAll() {
        return participantService.getAll();
    }
    @PutMapping("/{id}")
    public Participant update(@PathVariable Long id, @RequestBody Participant p) {
        p.setId(id);
        return participantService.save(p);
    }

    // Get participant by id
    @GetMapping("/{id}")
    public Participant getById(@PathVariable Long id) {
        return participantService.getById(id);
    }

    // Delete participant
    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        participantService.delete(id);
        return "Participant Deleted Successfully";
    }
}