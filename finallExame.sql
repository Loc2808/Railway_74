CREATE DATABASE User;

USE user;


CREATE TABLE Manager(
id SMALLINT NOT NULL,
full_name VARCHAR(255),
email VARCHAR(255),
password VARCHAR(255),
pro_kill VARCHAR(255) NULL,
role ENUM('Manager'),
exp_in_year VARCHAR(255),
project_id VARCHAR(255)

);

CREATE TABLE employee(
id SMALLINT NOT NULL,
full_name VARCHAR(255),
email VARCHAR(255),
password VARCHAR(255),
pro_kill VARCHAR(255),
role ENUM('Employee'),
project_id VARCHAR(255),
exp_in_year VARCHAR(255) NULL

);