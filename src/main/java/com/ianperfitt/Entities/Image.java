package com.ianperfitt.Entities;

import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "eventflyer")
public class Image {

	@Id
	@Column(name = "flyer_id")
	@GeneratedValue
	private Long id;

	@Column(name = "flyer_name")
	private String name;

	@Column(name = "flyer_type")
	private String type;

	@Lob
	@Column(name = "event_flyer")
	private byte[] flyer;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public byte[] getFlyer() {
		return flyer;
	}

	public void setFlyer(byte[] flyer) {
		this.flyer = flyer;
	}

	@Override
	public String toString() {
		return "Image [id=" + id + ", name=" + name + ", type=" + type + ", flyer=" + Arrays.toString(flyer) + "]";
	}

	public Image(Long id, String name, String type, byte[] flyer) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.flyer = flyer;
	}

}
