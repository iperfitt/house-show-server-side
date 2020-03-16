package com.ianperfitt.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/*
 * Users entity mapped to users table in database.
 * 
 */

@Entity
@Table(name = "event")
public class Event {

	/*
	 * Tells Hibernate to use the SQL sequence provided in the database when
	 * generating primary keys for persisted User entities.
	 */

	@Id
	@SequenceGenerator(name = "user_id_seq", sequenceName = "user_id_seq", allocationSize = 1)
	@GeneratedValue(generator = "user_id_seq", strategy = GenerationType.AUTO)
	private Long id;

	private String name;

	private String location;
	
	private String genre;
	
	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Event [id=" + id + ", name=" + name + ", location=" + location + ", genre=" + genre + "]";
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Event(Long id, String name, String location, String genre) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.genre = genre;
	}

	public Event() {
		super();
	}

}
