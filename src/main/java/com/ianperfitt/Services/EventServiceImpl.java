package com.ianperfitt.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ianperfitt.Entities.Event;
import com.ianperfitt.Repo.EventRepo;

@Service
public class EventServiceImpl implements EventService {

	@Autowired
	private EventRepo er;

	@Override
	public List<Event> getAllEvents() {
		return er.findAll();
	}

	@Override
	public void createEvent(Event e) {
		er.save(e);
	}

	@Override
	public void deleteEvent(String name) {

	}
}
