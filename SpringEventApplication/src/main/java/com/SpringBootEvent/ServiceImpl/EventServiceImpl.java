package com.SpringBootEvent.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringBootEvent.Repositary.EventRepositary;
import com.SpringBootEvent.Service.EventService;
import com.SpringBootEvent.model.Event;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class EventServiceImpl implements EventService{

	private final EventRepositary repo=null;
	
	
	@Override
	public List<Event> getAllEvent() {
		return repo.findAll();
	}


	@Override
	public Event saveEvent(Event event) {
		
		return repo.save(event);
	}


	@Override
	public Event getEventById(Long id) {
		
		return repo.findById(id).get();
	}


	@Override
	public Event updateEvent(Event event) {
		
		return repo.save(event);
	}


	@Override
	public void deleteEventById(Long id) {
		repo.deleteById(id);
		
	}

}
