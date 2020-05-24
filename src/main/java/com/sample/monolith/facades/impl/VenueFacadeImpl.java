package com.sample.monolith.facades.impl;

import com.sample.monolith.dto.VenueDto;
import com.sample.monolith.facades.VenueFacade;
import com.sample.monolith.models.Venue;
import com.sample.monolith.services.EventService;
import com.sample.monolith.services.VenueService;
import org.springframework.beans.factory.annotation.Autowired;

public class VenueFacadeImpl implements VenueFacade {

    @Autowired
    private VenueService venueService;

    @Autowired
    private EventService eventService;

    @Override
    public void createVenue(VenueDto venueDto) {
        Venue newVenue = new Venue();
        newVenue.setOffline(venueDto.getOffline());
        newVenue.setOfflineAddress(venueDto.getOfflineAddress());
        newVenue.setOnline(venueDto.getOnline());
        newVenue.setOnlineLink(venueDto.getOnlineLink());
        venueService.saveVenue(newVenue);
    }

    @Override
    public void editVenue(VenueDto venueDto) {
        Venue venueToEdit = venueService.getById(venueDto.getId());
        venueToEdit.setOffline(venueDto.getOffline());
        venueToEdit.setOfflineAddress(venueDto.getOfflineAddress());
        venueToEdit.setOnline(venueDto.getOnline());
        venueToEdit.setOnlineLink(venueDto.getOnlineLink());
        venueService.saveVenue(venueToEdit);
    }

    @Override
    public void deleteVenue(VenueDto venueDto) {
        Venue venueToDelete = venueService.getById(venueDto.getId());
        eventService.getAllEvents().forEach(event -> eventService.deleteVenue(event, venueToDelete));
        venueService.deleteVenue(venueToDelete);
    }
}
