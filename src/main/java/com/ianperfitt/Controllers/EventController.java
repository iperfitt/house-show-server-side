package com.ianperfitt.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ianperfitt.Entities.Event;
import com.ianperfitt.Services.EventService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class EventController {

	@Autowired
	private EventService es;

	@RequestMapping("/allevents")
	public List<Event> getAllEvents() {
		return es.getAllEvents();
	}

	@RequestMapping("/createevent")
	public void createEvent(@RequestBody Event e) {
		es.createEvent(e);
	}

	@DeleteMapping(value = "/deleteevent/{name}")
	public void deleteEvent(@PathVariable String name) {
		es.deleteEvent(name);
	}

}
