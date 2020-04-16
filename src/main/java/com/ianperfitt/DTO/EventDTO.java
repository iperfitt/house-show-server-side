package com.ianperfitt.DTO;

import org.springframework.web.multipart.MultipartFile;

public class EventDTO {

	private Long eventId;

	private String eventName;

	private String eventAddress;

	private String eventGenre;

	private String eventType;

	MultipartFile flyer;

	public Long getEventId() {
		return eventId;
	}

	public void setEventId(Long eventId) {
		this.eventId = eventId;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public String getEventAddress() {
		return eventAddress;
	}

	public void setEventAddress(String eventAddress) {
		this.eventAddress = eventAddress;
	}

	public String getEventGenre() {
		return eventGenre;
	}

	public void setEventGenre(String eventGenre) {
		this.eventGenre = eventGenre;
	}

	public String getEventType() {
		return eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	public MultipartFile getFlyer() {
		return flyer;
	}

	public void setFlyer(MultipartFile flyer) {
		this.flyer = flyer;
	}

	@Override
	public String toString() {
		return "EventDTO [eventId=" + eventId + ", eventName=" + eventName + ", eventAddress=" + eventAddress
				+ ", eventGenre=" + eventGenre + ", eventType=" + eventType + ", flyer=" + flyer + "]";
	}
}
