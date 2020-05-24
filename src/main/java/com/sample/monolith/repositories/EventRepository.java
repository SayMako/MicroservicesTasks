package com.sample.monolith.repositories;

import com.sample.monolith.models.Event;
import org.springframework.data.repository.CrudRepository;

public interface EventRepository extends CrudRepository<Event, Long> {
}
