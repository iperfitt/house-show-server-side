DROP TABLE IF EXISTS event;
DROP TABLE IF EXISTS event_address;

CREATE TABLE event (
	id int AUTO_INCREMENT PRIMARY KEY,
	name VARCHAR(200),
	addressid int,
	genre VARCHAR(200)
);

CREATE TABLE event_address (
	id int AUTO_INCREMENT,
	housenumber VARCHAR(200),
	street VARCHAR(200),
	city VARCHAR(200),
	state VARCHAR(200),
	country VARCHAR(200),
	zipcode VARCHAR(200),
	foreign key (id) references event(id)
);

  