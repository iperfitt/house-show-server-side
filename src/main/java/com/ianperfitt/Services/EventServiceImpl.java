package com.ianperfitt.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ianperfitt.Entities.Event;
import com.ianperfitt.Entities.EventAddress;
import com.ianperfitt.Repo.EventAddressRepo;
import com.ianperfitt.Repo.EventRepo;

@Service
public class EventServiceImpl implements EventService {

	@Autowired
	private EventRepo er;

	@Autowired
	private EventAddressRepo earepo;

	@Override
	public List<Event> getAllEvents() {
		return er.findAll();
	}

	@Override
	public void createEvent(Event e) {
		EventAddress ea = e.getEventAddress();
		Event event = e;
		event.setEventAddress(ea);
		er.save(event);
		System.out.println(event.toString());
//		er.save(e);
	}

	@Override
	public void deleteEvent(String name) {

	}
}
