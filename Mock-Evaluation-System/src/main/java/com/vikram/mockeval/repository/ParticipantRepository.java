package com.vikram.mockeval.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.vikram.mockeval.entity.Participant;

public interface ParticipantRepository extends JpaRepository<Participant, Long> {

}