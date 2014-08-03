
# Written by Tobias Lovell

CREATE TABLE interest (
	interest_id INT UNSIGNED NOT NULL AUTO_INCREMENT,
	interest_name VARCHAR(75) NOT NULL,
	PRIMARY KEY (interest_id)
);

CREATE TABLE member (
	user_id INT UNSIGNED NOT NULL AUTO_INCREMENT,
	user_name VARCHAR(75) NOT NULL,
	user_email VARCHAR(75) NOT NULL,
	user_password VARCHAR(30) NOT NULL,
	membership_date DATETIME NOT NULL, 
	PRIMARY KEY (user_id)
);

CREATE TABLE followed_interest (
	fuser_id INT UNSIGNED NOT NULL,
	finterest_id INT UNSIGNED NOT NULL,
	PRIMARY KEY (finterest_id, fuser_id),
	INDEX (fuser_id),
	FOREIGN KEY (finterest_id) REFERENCES interest (interest_id),
	FOREIGN KEY (fuser_id) REFERENCES member (user_id)
);

CREATE TABLE event (
	event_id BIGINT NOT NULL,
	event_title VARCHAR(75) NOT NULL,
	event_summary VARCHAR(200) NOT NULL,
	event_desc VARCHAR(100) NOT NULL,
	event_location BIGINT NOT NULL,
	event_date DATETIME NOT NULL,
	event_duration TIMESTAMP NOT NULL,
	PRIMARY KEY (event_id)
);

CREATE TABLE event_attendee (
	attendee_id INT UNSIGNED NOT NULL,
	event_id BIGINT NOT NULL,
	PRIMARY KEY (event_id, attendee_id),
	INDEX (attendee_id),
	FOREIGN KEY (event_id) REFERENCES event (event_id),
	FOREIGN KEY (attendee_id) REFERENCES member (user_id)
);

CREATE TABLE event_organizer (
	organizer_id INT UNSIGNED NOT NULL,
	event_id BIGINT NOT NULL,
	PRIMARY KEY (event_id, organizer_id),
	INDEX (organizer_id),
	FOREIGN KEY (event_id) REFERENCES event (event_id),
	FOREIGN KEY (organizer_id) REFERENCES member (user_id) 
);

CREATE TABLE address (
	address_id BIGINT NOT NULL AUTO_INCREMENT,
	address_line1 VARCHAR(100) NOT NULL,
	address_line2 VARCHAR(150) NOT NULL,
	address_postcode VARCHAR(15) NOT NULL,
	address_town VARCHAR(50) NOT NULL,
	address_city VARCHAR(50) NOT NULL,
	address_country VARCHAR(50) NOT NULL,
	PRIMARY KEY (address_id)
);

CREATE TABLE comment_type (
	type_id INT UNSIGNED NOT NULL AUTO_INCREMENT,
	type_name VARCHAR(15),
	PRIMARY KEY (type_id)
);

CREATE TABLE comment (
	comment_id BIGINT NOT NULL AUTO_INCREMENT,
	comment_content TEXT NOT NULL,
	author_id INT UNSIGNED NOT NULL,
	comment_type INT UNSIGNED NOT NULL,
	PRIMARY KEY (comment_id),
	FOREIGN KEY (comment_type) REFERENCES comment_type (type_id),
	FOREIGN KEY (author_id) REFERENCES member (user_id)
);










