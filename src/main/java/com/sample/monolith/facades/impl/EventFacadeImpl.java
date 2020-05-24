package com.sample.monolith.facades.impl;

import com.sample.monolith.dto.EventDto;
import com.sample.monolith.facades.EventFacade;
import com.sample.monolith.models.Event;
import com.sample.monolith.services.EventService;
import com.sample.monolith.services.VenueService;
import org.springframework.beans.factory.annotation.Autowired;

public class EventFacadeImpl implements EventFacade {

    @Autowired
    private EventService eventService;

    @Autowired
    private VenueService venueService;

    @Override
    public void createEvent(EventDto eventDto) {
        Event newEvent = new Event();
        newEvent.setTitle(eventDto.getTitle());
        newEvent.setVenue(venueService.getById(eventDto.getVenueId()));
        eventService.saveEvent(newEvent);
    }

    @Override
    public void editEvent(EventDto eventDto) {
        Event newEvent = eventService.getEvent(eventDto.getId());
        newEvent.setTitle(eventDto.getTitle());
        newEvent.setVenue(venueService.getById(eventDto.getVenueId()));
        eventService.saveEvent(newEvent);
    }
}
