DROP TABLE IF EXISTS event;
DROP TABLE IF EXISTS eventaddress;
DROP TABLE IF EXISTS eventflyer;

CREATE TABLE event (
	event_id integer AUTO_INCREMENT PRIMARY KEY,
	event_name VARCHAR(200),
	event_address integer,
	event_genre VARCHAR(200),
	event_type VARCHAR(200),
	event_flyer integer
);

CREATE TABLE eventaddress (
	address_id integer AUTO_INCREMENT,
	address_housenumber VARCHAR(200),
	address_street VARCHAR(200),
	address_city VARCHAR(200),
	address_state VARCHAR(200),
	address_country VARCHAR(200),
	address_zipcode VARCHAR(200)
);

CREATE TABLE eventflyer (
	flyer_id integer AUTO_INCREMENT,
	flyer_name VARCHAR(200),
	flyer_type VARCHAR(200)
);
  