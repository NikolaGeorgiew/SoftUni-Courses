USE minions;
CREATE TABLE minions (
id INT NOT NULL AUTO_INCREMENT,
name VARCHAR(45),
age INT,
PRIMARY KEY(id)
);
CREATE TABLE towns (
town_id INT NOT NULL AUTO_INCREMENT,
name VARCHAR(45),
PRIMARY KEY(town_id)
);