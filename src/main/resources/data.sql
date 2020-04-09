DROP TABLE IF EXISTS event;
DROP TABLE IF EXISTS eventaddress;

CREATE TABLE event (
	event_id int AUTO_INCREMENT PRIMARY KEY,
	event_name VARCHAR(200),
	event_address int,
	event_genre VARCHAR(200),
	event_type VARCHAR(200)
);

CREATE TABLE eventaddress (
	address_id int AUTO_INCREMENT,
	address_housenumber VARCHAR(200),
	address_street VARCHAR(200),
	address_city VARCHAR(200),
	address_state VARCHAR(200),
	address_country VARCHAR(200),
	address_zipcode VARCHAR(200)
);

  