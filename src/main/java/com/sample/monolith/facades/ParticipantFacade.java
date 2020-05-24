package com.sample.monolith.facades;

import com.sample.monolith.models.Event;

import java.util.List;

public interface ParticipantFacade {
    List<Event> getAllEvents();
    List<Event> getMyEvents();
    void takePart(Long eventId);
}
