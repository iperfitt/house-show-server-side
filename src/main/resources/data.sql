DROP TABLE IF EXISTS event;
DROP TABLE IF EXISTS event_address;

CREATE TABLE event (
	id int SERIAL PRIMARY KEY NOT NULL,
	name VARCHAR(200),
	address_id int,
	genre VARCHAR(200)
);

CREATE TABLE event_address (
	id int NOT NULL,
	house_number VARCHAR(200),
	street VARCHAR(200),
	city VARCHAR(200),
	state VARCHAR(200),
	country VARCHAR(200),
	zipcode VARCHAR(200),
	foreign key (id) references event(id)
);

INSERT INTO event (id,name, address_id, genre) VALUES
  (0,'IANS SHOW', 0, 'blues');
  
INSERT INTO event_address (id,house_number, street, city, state, country, zipcode) VALUES
  (0,'212', 'NW J. St.', 'Bentonville', 'Arkansas', 'US', '72712');
  
  