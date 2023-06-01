DROP TABLE IF EXISTS employee;
create table employee (
                      id INT AUTO_INCREMENT  PRIMARY KEY,
                      name VARCHAR(50) NOT NULL,
                      salary INT NOT NULL,
                      address VARCHAR(100) );