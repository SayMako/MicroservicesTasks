package com.sample.monolith.facades;

import com.sample.monolith.dto.EventDto;

public interface EventFacade {
    void createEvent(EventDto eventDto);
    void editEvent(EventDto eventDto);
}
