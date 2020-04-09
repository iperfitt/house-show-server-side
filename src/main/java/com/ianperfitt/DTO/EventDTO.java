package com.ianperfitt.DTO;

public class EventDTO {

	private Long eventId;

	private String eventName;

	private String eventAddress;

	private String eventGenre;

	private String eventType;

	public String getEventType() {
		return eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

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

	@Override
	public String toString() {
		return "EventDTO [eventId=" + eventId + ", eventName=" + eventName + ", eventAddress=" + eventAddress
				+ ", eventGenre=" + eventGenre + "]";
	}

}
