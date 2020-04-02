package com.ianperfitt.Services;

import java.util.List;

import com.ianperfitt.DTO.EventDTO;
import com.ianperfitt.Entities.Event;

public interface EventService {

	List<Event> getAllEvents();

	void createEvent(EventDTO e);

	void deleteEvent(String name);
}
