package com.ianperfitt.Services;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ianperfitt.DTO.EventDTO;
import com.ianperfitt.Entities.Event;
import com.ianperfitt.Entities.EventAddress;
import com.ianperfitt.Repo.EventRepo;

@Service
public class EventServiceImpl implements EventService {

	@Autowired
	private EventRepo er;

	@Override
	public List<Event> getAllEvents() {
		return er.findAll();
	}

	// Event address is a comma delimited string in the following format:
	// "housenumber, street, city, state, county, zipcode"
	public EventAddress parseAddress(String address) {
		EventAddress ea = new EventAddress();
		String[] addressArr = address.split(",");
		ea.setAddressId(Integer.toUnsignedLong(0));
		ea.setCity(addressArr[1].substring(1));
		ea.setHousenumber(addressArr[0].substring(0, addressArr[0].indexOf(" ")));
		ea.setStreet(addressArr[0].substring(addressArr[0].indexOf(" ") + 1));
		ea.setCountry(addressArr[3].substring(1));
		ea.setState(addressArr[2].trim().split(" ")[0]);
		ea.setZipcode(addressArr[2].trim().split(" ")[1]);
		return ea;
	}

	@Override
	public void createEvent(EventDTO eDTO) throws IOException {
		Event event = new Event();
		event.setEventId(eDTO.getEventId());
		event.setEventName(eDTO.getEventName());
		event.setEventGenre(eDTO.getEventGenre());
		EventAddress ea = parseAddress(eDTO.getEventAddress());
		event.setEventAddress(ea);
		event.setEventType(eDTO.getEventType());

//		Image img = new Image(eDTO.getFlyer().getOriginalFilename(), eDTO.getFlyer().getContentType(),
//				eDTO.getFlyer().getBytes());
//		event.setEventFlyer(img);
		er.save(event);
	}
}
