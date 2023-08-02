CREATE DATABASE user;
USE user;
CREATE TABLE User(
id SMALLINT,
full_name VARCHAR(100),
email VARCHAR(255),
password VARCHAR(15),
exp_in_year VARCHAR(50),
pro_skill VARCHAR(50),
project_id INT,
role ENUM('manager', 'employee', 'admin')

);
