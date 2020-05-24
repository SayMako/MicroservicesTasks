package com.sample.monolith.services.impl;

import com.sample.monolith.models.Venue;
import com.sample.monolith.repositories.VenueRepository;
import com.sample.monolith.services.VenueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VenueServiceImpl implements VenueService {

    @Autowired
    private VenueRepository venueRepository;

    @Override
    public Venue getById(Long id) {
        return venueRepository.findById(id).orElseThrow(() -> new RuntimeException("Venue not found"));
    }

    @Override
    public void saveVenue(Venue venue) {
        venueRepository.save(venue);
    }

    @Override
    public void deleteVenue(Venue venue) {
        venueRepository.delete(venue);
    }
}
