package com.sample.monolith.services;

import com.sample.monolith.models.Venue;

public interface VenueService {
    Venue getById(Long id);
    void saveVenue(Venue venueToEdit);
    void deleteVenue(Venue venue);
}
