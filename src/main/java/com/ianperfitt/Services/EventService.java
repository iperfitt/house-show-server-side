package com.ianperfitt.Services;

import java.io.IOException;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.ianperfitt.DTO.EventDTO;
import com.ianperfitt.Entities.Event;

public interface EventService {

	List<Event> getAllEvents();

	void createEvent(MultipartFile flyer, EventDTO e) throws IOException;

	void deleteEvent(String name);
}
