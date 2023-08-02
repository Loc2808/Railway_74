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


INSERT INTO user(id, full_name, email, password, exp_in_year, pro_skill, project_id, role)
VALUES (1, 'username A', 'A@gmail.com', '1234567', '10 years', NULL, 1, 'manager'),
	(2, 'username B', 'B@gmail.com', '2345678', NULL, 'dev', 3, 'employee'),
    (3, 'username C', 'c@gmail.com', '2345678', NULL, NULL, 1, 'admin'),
    (4, 'username D', 'D@gmail.com', '3456789', NULL, 'java', 2, 'employee'),
    (5, 'username E', 'E@gmail.com', '5678901', '3 years', NULL, 4, 'manager'),
    (6, 'username F', 'F@gmail.com', '8869654', NULL, NULL, 3, 'admin');
