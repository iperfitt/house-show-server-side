package com.ianperfitt.Controllers;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ianperfitt.DTO.EventDTO;
import com.ianperfitt.Entities.Event;
import com.ianperfitt.Services.EventService;

@RestController
@CrossOrigin(origins = { "http://localhost:4200", "https://house-show-client-side.herokuapp.com" })
public class EventController {

	@Autowired
	private EventService es;

	@GetMapping("/allevents")
	public List<Event> getAllEvents() {
		return es.getAllEvents();
	}

	@RequestMapping("/createevent")
	public void createEvent(@RequestBody EventDTO eDTO) throws IOException {
		System.out.println("Event Data Transfer Object" + eDTO);
		es.createEvent(eDTO);
	}

}
