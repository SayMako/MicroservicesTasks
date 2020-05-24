package com.sample.monolith.services.impl;

import com.sample.monolith.models.Event;
import com.sample.monolith.models.Participant;
import com.sample.monolith.models.Venue;
import com.sample.monolith.repositories.EventRepository;
import com.sample.monolith.services.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EventServiceImpl implements EventService {

    @Autowired
    private EventRepository eventRepository;

    @Override
    public void saveEvent(Event event) {
        eventRepository.save(event);
    }

    @Override
    public List<Event> getAllEvents() {
        List<Event> result = new ArrayList<>();
        eventRepository.findAll().forEach(result::add);
        return result;
    }

    @Override
    public Event getEvent(Long eventId) {
        return eventRepository.findById(eventId).orElseThrow(() -> new RuntimeException("No event with ID=" + eventId));
    }

    @Override
    public List<Event> getParticipantEvents(Participant participant) {
        ArrayList<Event> events = new ArrayList<>();
        eventRepository.findAll().forEach(event -> {
            if (event.getParticipants().contains(participant)) {
                events.add(event);
            }
        });
        return events;
    }

    @Override
    public void takePart(Participant participant, Event event) {
        List<Participant> participants = event.getParticipants();
        participants.add(participant);
        eventRepository.save(event);
    }

    @Override
    public void deleteVenue(Event event, Venue venue) {
        if (event.getVenue().equals(venue)) {
            event.setVenue(null);
            eventRepository.save(event);
        }
    }
}
