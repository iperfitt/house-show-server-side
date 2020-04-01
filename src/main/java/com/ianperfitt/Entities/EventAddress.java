package com.ianperfitt.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "eventaddress")
public class EventAddress {

	private Long addressId;

	private String housenumber;

	private String street;

	private String city;

	private String state;

	private String country;

	private String zipcode;

	@Id
	@GeneratedValue
	@Column(name = "address_id")
	public Long getAddressId() {
		return addressId;
	}

	public void setAddressId(Long addressId) {
		this.addressId = addressId;
	}

	@Column(name = "address_housenumber", nullable = false, length = 250)
	public String getHousenumber() {
		return housenumber;
	}

	public void setHousenumber(String housenumber) {
		this.housenumber = housenumber;
	}

	@Column(name = "address_street", nullable = false, length = 50)
	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	@Column(name = "address_city", nullable = false, length = 50)
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Column(name = "address_state", nullable = false, length = 50)
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Column(name = "address_country", nullable = false, length = 50)
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Column(name = "address_zipcode", nullable = false, length = 50)
	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public EventAddress(Long addressId, String housenumber, String street, String city, String state, String country,
			String zipcode) {
		super();
		this.addressId = addressId;
		this.housenumber = housenumber;
		this.street = street;
		this.city = city;
		this.state = state;
		this.country = country;
		this.zipcode = zipcode;
	}

	public EventAddress() {
		super();
		// TODO Auto-generated constructor stub
	}

}
