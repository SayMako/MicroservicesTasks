package com.sample.monolith.repositories;

import com.sample.monolith.models.Participant;
import org.springframework.data.repository.CrudRepository;

public interface ParticipantRepository extends CrudRepository<Participant, Long> {
}
