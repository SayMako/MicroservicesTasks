package com.sample.monolith.facades;

import com.sample.monolith.dto.VenueDto;
import com.sample.monolith.models.Venue;

public interface VenueFacade {
    void createVenue(VenueDto venueDto);
    void editVenue(VenueDto venueDto);
    void deleteVenue(VenueDto venueDto);
}
