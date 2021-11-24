DROP TABLE IF EXISTS USER;

CREATE TABLE USER (
	id int primary key not null,
	name varchar(20) not null,
	email varchar(40) null,
	age int(3)
);