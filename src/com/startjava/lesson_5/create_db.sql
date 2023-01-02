-- create database
DROP TABLE IF EXISTS Jaegers;

CREATE TABLE Jaegers (
	id          SERIAL PRIMARY KEY,
	modelName   TEXT,
	mark        CHAR(6),
	height      NUMERIC(4, 2),
	weight      NUMERIC(4, 3),
	status      TEXT,
	origin      TEXT,
    launch      DATE,
    kaijuKill   INTEGER
);

psql \ir  'D:/JAVA/Startjava/src/com/startjava/lesson_5/init_db.sql'
psql \ir  'D:/JAVA/Startjava/src/com/startjava/lesson_5/queries_db.sql'


