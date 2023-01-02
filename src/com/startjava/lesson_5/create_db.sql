-- create database
DROP DATABASE IF EXISTS Jaegers;
CREATE DATABASE Jaegers;

CREATE TABLE Jaegers (
	id        SERIAL PRIMARY KEY,
	modelName TEXT,
	mark      CHAR(6),
	height    NUMERIC(4, 2),
	weight    NUMERIC(4, 3),
	status    TEXT,
	origin    TEXT,
    launch    DATE,
    kaijuKill INTEGER
);

\ir  'init_db.sql'
\ir  'queries.sql'



