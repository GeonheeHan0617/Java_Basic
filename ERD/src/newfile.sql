
/* Drop Tables */

DROP TABLE likemember CASCADE CONSTRAINTS;
DROP TABLE reply CASCADE CONSTRAINTS;
DROP TABLE board CASCADE CONSTRAINTS;
DROP TABLE memberfriend CASCADE CONSTRAINTS;
DROP TABLE member CASCADE CONSTRAINTS;




/* Create Tables */

CREATE TABLE board
(
	bno number(5) NOT NULL,
	witer  NOT NULL,
	bname varchar2(30),
	like number(5) NOT NULL,
	likeid varchar2(30),
	regdate date DEFAULT <작성일>,
	id varchar2(30) NOT NULL,
	PRIMARY KEY (bno)
);


CREATE TABLE likemember
(
	bno number(5) NOT NULL,
	likeid varchar2(30) NOT NULL,
	PRIMARY KEY (bno, likeid)
);


CREATE TABLE member
(
	id varchar2(30) NOT NULL,
	name varchar2(30) NOT NULL,
	address varchar2(100) NOT NULL,
	phonenumber varchar2(20) NOT NULL,
	friend varchar2(30),
	PRIMARY KEY (id)
);


CREATE TABLE memberfriend
(
	id varchar2(30) NOT NULL,
	friend varchar2(30) NOT NULL,
	PRIMARY KEY (id, friend)
);


CREATE TABLE reply
(
	writer varchar2(30),
	regdate date DEFAULT <작성일>,
	ano number(5) NOT NULL,
	title varchar2(30),
	content varchar2(100),
	id varchar2(30) NOT NULL,
	bno number(5) NOT NULL,
	PRIMARY KEY (ano)
);



/* Create Foreign Keys */

ALTER TABLE likemember
	ADD FOREIGN KEY (bno)
	REFERENCES board (bno)
;


ALTER TABLE reply
	ADD FOREIGN KEY (bno)
	REFERENCES board (bno)
;


ALTER TABLE board
	ADD FOREIGN KEY (id)
	REFERENCES member (id)
;


ALTER TABLE memberfriend
	ADD FOREIGN KEY (id)
	REFERENCES member (id)
;


ALTER TABLE reply
	ADD FOREIGN KEY (id)
	REFERENCES member (id)
;



