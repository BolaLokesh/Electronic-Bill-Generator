CREATE DATABASE electric_bill_db;

USE electric_bill_db;

CREATE TABLE bills (
id INT AUTO_INCREMENT PRIMARY KEY,
customer_name VARCHAR(255),
units_consumed INT,
total_bill DECIMAL(10, 2)
);
