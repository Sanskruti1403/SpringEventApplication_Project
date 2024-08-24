package com.SpringBootEvent.Service;

import java.util.List;

import com.SpringBootEvent.model.Event;

public interface EventService {

	
List<Event> getAllEvent();

Event saveEvent(Event event);

Event getEventById(Long id);

Event updateEvent(Event event);

void deleteEventById(Long id);

}
