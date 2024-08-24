package com.SpringBootEvent.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.SpringBootEvent.Service.EventService;
import com.SpringBootEvent.model.Event;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;



//@Controller
@AllArgsConstructor
@NoArgsConstructor
public class Controller {
	@Autowired
	private EventService eventservice;
	
	
	
	@GetMapping("/events")
	public String listofevents(Model model) {
		List<Event> list=eventservice.getAllEvent();
		model.addAttribute("events", list);
		return "events";
	}
	@GetMapping("/event/new")
	public String createEventForm(Model model) {
		
		
		Event st=new Event();
		model.addAttribute("event", st);

		return "create_event";
	} 
	
	@PostMapping("/events")
	public String saveEvent(@ModelAttribute("event") Event event) {
		
		eventservice.saveEvent(event);
		return "redirect:/events";
	}
	@GetMapping("/events/edit/{id}")
	public String editEventForm(@PathVariable Long id, Model model) {
		model.addAttribute("event", eventservice.getEventById(id));
		return "edit_event";
	}
	@PostMapping("/events/{id}")
	public String updateEvent(@PathVariable Long id,
			@ModelAttribute("event") Event event,
			Model model) {
		
		Event existingEvent=eventservice.getEventById(id);
		existingEvent.setId(id);
		existingEvent.setFirstName(event.getFirstName());
		existingEvent.setLastName(event.getLastName());
		existingEvent.setEmail(event.getEmail());
		existingEvent.setEvent_name(event.getEvent_name());
		
		
		eventservice.updateEvent(existingEvent);
		
		return "redirect:/events";
	}
	
	
	@GetMapping("/events/{id}")
	public String deleteEvent(@PathVariable Long id) {
		eventservice.deleteEventById(id);
		return "redirect:/events";
	}
	

}
