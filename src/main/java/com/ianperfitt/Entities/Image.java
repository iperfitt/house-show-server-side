package com.ianperfitt.Entities;

import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "eventflyer")
public class Image {

	private Long flyerid;

	private String flyerName;

	private String flyerType;

	private byte[] eventFlyer;

	@Id
	@GeneratedValue
	@Column(name = "flyer_id")
	public Long getId() {
		return flyerid;
	}

	public void setId(Long flyerid) {
		this.flyerid = flyerid;
	}

	@Column(name = "flyer_name")
	public String getflyerName() {
		return flyerName;
	}

	public void setflyerName(String flyerName) {
		this.flyerName = flyerName;
	}

	@Column(name = "flyer_type")
	public String getflyerType() {
		return flyerType;
	}

	public void setflyerType(String flyerType) {
		this.flyerType = flyerType;
	}

//	@Lob
//	@Column(name = "event_flyer", columnDefinition = "blob")
//	public byte[] getFlyer() {
//		return eventFlyer;
//	}

	public void setFlyer(byte[] eventFlyer) {
		this.eventFlyer = eventFlyer;
	}

	@Override
	public String toString() {
		return "Image [id=" + flyerid + ", flyerName=" + flyerName + ", flyerType=" + flyerType + ", flyer="
				+ Arrays.toString(eventFlyer) + "]";
	}

	public Image(String flyerName, String flyerType, byte[] eventFlyer) {
		super();
		this.flyerName = flyerName;
		this.flyerType = flyerType;
		this.eventFlyer = eventFlyer;
	}

	public Image() {
		super();
		// TODO Auto-generated constructor stub
	}

}
