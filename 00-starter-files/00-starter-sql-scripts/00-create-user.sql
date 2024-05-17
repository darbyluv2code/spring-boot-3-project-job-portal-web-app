-- Drop user first if they exist
DROP USER IF EXISTS 'jobportal'@'%';

-- Now create user with prop privileges
CREATE USER 'jobportal'@'localhost' IDENTIFIED BY 'jobportal';

GRANT ALL PRIVILEGES ON * . * TO 'jobportal'@'localhost';