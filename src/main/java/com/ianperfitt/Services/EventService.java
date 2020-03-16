package com.ianperfitt.Services;

import java.util.List;

import com.ianperfitt.Entities.Event;

public interface EventService {

	List<Event> getAllEvents();

	void createEvent(Event e);

	void deleteEvent(String name);
}
