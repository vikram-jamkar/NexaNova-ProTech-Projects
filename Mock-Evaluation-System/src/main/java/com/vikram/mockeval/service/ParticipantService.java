package com.vikram.mockeval.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vikram.mockeval.entity.Participant;
import com.vikram.mockeval.repository.ParticipantRepository;

@Service
public class ParticipantService {

    @Autowired
    private ParticipantRepository participantRepository;

    // Save participant
    public Participant save(Participant p) {
        return participantRepository.save(p);
    }

    // Get all participants
    public List<Participant> getAll() {
        return participantRepository.findAll();
    }

    // Get by id
    public Participant getById(Long id) {
        return participantRepository.findById(id).orElse(null);
    }

    // Delete
    public void delete(Long id) {
        participantRepository.deleteById(id);
    }
}