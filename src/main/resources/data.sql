DROP TABLE event;

CREATE TABLE IF NOT EXISTS event (
	id int AUTO_INCREMENT PRIMARY KEY,
	name VARCHAR(200),
	location VARCHAR(200),
	genre VARCHAR(200)
);

CREATE TABLE IF NOT EXISTS event_address (
	id int AUTO_INCREMENT PRIMARY KEY,
	house_number VARCHAR(200),
	street VARCHAR(200),
	city VARCHAR(200),
	state VARCHAR(200),
	country VARCHAR(200),
	zipcode VARCHAR(200)
);

INSERT INTO event (id,name, location, genre) VALUES
  (0,'MADDIES SHOW', 'maddies house', 'blues'),
  (1,'DADS SHOW', 'dads house', 'funk'),
  (2,'IANS SHOW', 'ians house', 'jazz');
  
INSERT INTO event_address (id,house_number, street, city, state, country, zipcode) VALUES
  (0,'212', 'NW J. St.', 'Bentonville', 'Arkansas', 'US', '72712')