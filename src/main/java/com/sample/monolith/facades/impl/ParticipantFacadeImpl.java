package com.sample.monolith.facades.impl;

import com.sample.monolith.facades.ParticipantFacade;
import com.sample.monolith.models.Event;
import com.sample.monolith.models.Participant;
import com.sample.monolith.services.EventService;
import com.sample.monolith.services.ParticipantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ParticipantFacadeImpl implements ParticipantFacade {

    @Autowired
    private EventService eventService;

    @Autowired
    private ParticipantService participantService;

    @Override
    public List<Event> getAllEvents() {
        return eventService.getAllEvents();
    }

    @Override
    public List<Event> getMyEvents() {
        Participant currentParticipant = participantService.getCurrentParticipant();
        return eventService.getParticipantEvents(currentParticipant);
    }

    @Override
    public void takePart(Long eventId) {
        Participant currentParticipant = participantService.getCurrentParticipant();
        Event event = eventService.getEvent(eventId);
        eventService.takePart(currentParticipant, event);
    }
}
