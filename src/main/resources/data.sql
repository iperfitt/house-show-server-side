CREATE TABLE IF NOT EXISTS event (
	id int AUTO_INCREMENT PRIMARY KEY,
	location VARCHAR(200),
	genre VARCHAR(200)
);

INSERT INTO event (id, location, genre) VALUES
  (0, 'maddies show', 'blues'),
  (1, 'dads show', 'funk'),
  (2, 'ians show', 'jazz');