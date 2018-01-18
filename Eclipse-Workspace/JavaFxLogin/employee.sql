--
-- File generated with SQLiteStudio v3.1.1 on Thu Jan 18 09:42:09 2018
--
-- Text encoding used: System
--
PRAGMA foreign_keys = off;
BEGIN TRANSACTION;

-- Table: EmployeeData
CREATE TABLE EmployeeData (id INTEGER PRIMARY KEY AUTOINCREMENT, name STRING (100), age INTEGER (100), username STRING (100) NOT NULL, password STRING (100) NOT NULL);
INSERT INTO EmployeeData (id, name, age, username, password) VALUES (1, 'Mano', 20, 'mano', 'pass');
INSERT INTO EmployeeData (id, name, age, username, password) VALUES (2, 'virat', 25, 'virat', 'test');

COMMIT TRANSACTION;
PRAGMA foreign_keys = on;
