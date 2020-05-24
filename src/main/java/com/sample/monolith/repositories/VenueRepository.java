package com.sample.monolith.repositories;

import com.sample.monolith.models.Venue;
import org.springframework.data.repository.CrudRepository;

public interface VenueRepository extends CrudRepository<Venue, Long> {
}
