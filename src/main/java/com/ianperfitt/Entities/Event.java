package com.ianperfitt.Entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/*
 * Event entity mapped to event table in database.
 * 
 */

@Entity
@Table(name = "event")
public class Event {

	/*
	 * Tells Hibernate to use the SQL sequence provided in the database when
	 * generating primary keys for persisted User entities.
	 */

	private Long eventId;

	private String eventName;

	private EventAddress eventAddress;

	private String eventGenre;

	private String eventType;

	private Image eventFlyer;

	@Id
	@GeneratedValue
	@Column(name = "event_id")
	public Long getEventId() {
		return eventId;
	}

	public void setEventId(Long eventId) {
		this.eventId = eventId;
	}

	@Column(name = "event_name", nullable = false, length = 100)
	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "event_address")
	public EventAddress getEventAddress() {
		return eventAddress;
	}

	public void setEventAddress(EventAddress eventAddress) {
		this.eventAddress = eventAddress;
	}

	@Column(name = "event_genre", nullable = false, length = 100)
	public String getEventGenre() {
		return eventGenre;
	}

	public void setEventGenre(String eventGenre) {
		this.eventGenre = eventGenre;
	}

	@Column(name = "event_type", nullable = false, length = 100)
	public String getEventType() {
		return eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "event_flyer")
	public Image getEventFlyer() {
		return eventFlyer;
	}

	public void setEventFlyer(Image eventFlyer) {
		this.eventFlyer = eventFlyer;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((eventAddress == null) ? 0 : eventAddress.hashCode());
		result = prime * result + ((eventGenre == null) ? 0 : eventGenre.hashCode());
		result = prime * result + ((eventType == null) ? 0 : eventType.hashCode());
		result = prime * result + ((eventId == null) ? 0 : eventId.hashCode());
		result = prime * result + ((eventName == null) ? 0 : eventName.hashCode());
		result = prime * result + ((eventFlyer == null) ? 0 : eventFlyer.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Event other = (Event) obj;
		if (eventAddress == null) {
			if (other.eventAddress != null)
				return false;
		} else if (!eventAddress.equals(other.eventAddress))
			return false;
		if (eventFlyer == null) {
			if (other.eventFlyer != null)
				return false;
		} else if (!eventFlyer.equals(other.eventFlyer))
			return false;
		if (eventGenre == null) {
			if (other.eventGenre != null)
				return false;
		} else if (!eventGenre.equals(other.eventGenre))
			return false;
		if (eventId == null) {
			if (other.eventId != null)
				return false;
		} else if (!eventId.equals(other.eventId))
			return false;
		if (eventName == null) {
			if (other.eventName != null)
				return false;
		} else if (!eventName.equals(other.eventName))
			return false;
		if (eventType == null) {
			if (other.eventType != null)
				return false;
		} else if (!eventType.equals(other.eventType))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Event [eventId=" + eventId + ", eventName=" + eventName + ", eventAddress=" + eventAddress
				+ ", eventGenre=" + eventGenre + ", eventType=" + eventType + ", eventFlyer=" + eventFlyer + "]";
	}

	public Event(Long eventId, String eventName, EventAddress eventAddress, String eventGenre, String eventType,
			Image eventFlyer) {
		super();
		this.eventId = eventId;
		this.eventName = eventName;
		this.eventAddress = eventAddress;
		this.eventGenre = eventGenre;
		this.eventType = eventType;
		this.eventFlyer = eventFlyer;
	}

	public Event() {
		super();
		// TODO Auto-generated constructor stub
	}

}
