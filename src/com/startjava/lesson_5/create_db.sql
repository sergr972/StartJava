-- create database

CREATE TABLE Jaegers (
	id          SERIAL PRIMARY KEY,
	modelName   TEXT,
	mark        char(6),
	height      NUMERIC(4, 2),
	weight      NUMERIC(4, 3),
	status      BOOLEAN,
	origin      TEXT,
    launch      DATE,
    kaijuKill   INTEGER
);
