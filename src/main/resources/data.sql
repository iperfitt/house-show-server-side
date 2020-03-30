DROP TABLE event;

CREATE TABLE IF NOT EXISTS event (
	id int AUTO_INCREMENT PRIMARY KEY,
	name VARCHAR(200),
	location VARCHAR(200),
	genre VARCHAR(200)
);

INSERT INTO event (id,name, location, genre) VALUES
  (0,'MADDIES SHOW', 'maddies house', 'blues'),
  (1,'DADS SHOW', 'dads house', 'funk'),
  (2,'IANS SHOW', 'ians house', 'jazz');