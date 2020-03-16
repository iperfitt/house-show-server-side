package com.ianperfitt.Controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class EventController {

	@GetMapping("/")
	public String hello() {
		return "Hello";
	}

//	@Autowired
//	private EventService es;
//
//	@RequestMapping("/allevents")
//	public List<Event> getAllEvents() {
//		return es.getAllEvents();
//	}
//
//	@RequestMapping("/createevent")
//	public void createEvent(@RequestBody Event e) {
//		es.createEvent(e);
//	}
//
//	@DeleteMapping(value = "/deleteevent/{name}")
//	public void deleteEvent(@PathVariable String name) {
//		es.deleteEvent(name);
//	}

}
