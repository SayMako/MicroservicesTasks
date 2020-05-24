package com.sample.monolith.services;

import com.sample.monolith.models.Event;
import com.sample.monolith.models.Participant;
import com.sample.monolith.models.Venue;

import java.util.List;

public interface EventService {
    void saveEvent(Event event);
    List<Event> getAllEvents();
    Event getEvent(Long eventId);
    List<Event> getParticipantEvents(Participant participant);
    void takePart(Participant participant, Event event);
    void deleteVenue(Event event, Venue venue);
}
