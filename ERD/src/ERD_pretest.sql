
/* Drop Tables */

DROP TABLE CONTACTACTS CASCADE CONSTRAINTS;
DROP TABLE ORDERS CASCADE CONSTRAINTS;
DROP TABLE CUSTOMERS CASCADE CONSTRAINTS;




/* Create Tables */

CREATE TABLE CONTACTACTS
(
	CONTACT_ID varchar2(20) NOT NULL,
	FIRST_NAME varchar2(30),
	CUSTOMER_ID varchar2(20) NOT NULL,
	PRIMARY KEY (CONTACT_ID)
);


CREATE TABLE CUSTOMERS
(
	CUSTOMER_ID varchar2(20) NOT NULL,
	NAME varchar2(20),
	ADDRESS varchar2(50),
	WEBSITE varchar2(100),
	CREDIT_LIMIT varchar2(100),
	PRIMARY KEY (CUSTOMER_ID)
);


CREATE TABLE ORDERS
(
	STATUES varchar2(30),
	CUSTOMER_ID varchar2(20) NOT NULL,
	PRIMARY KEY (CUSTOMER_ID)
);



/* Create Foreign Keys */

ALTER TABLE CONTACTACTS
	ADD FOREIGN KEY (CUSTOMER_ID)
	REFERENCES CUSTOMERS (CUSTOMER_ID)
;


ALTER TABLE ORDERS
	ADD FOREIGN KEY (CUSTOMER_ID)
	REFERENCES CUSTOMERS (CUSTOMER_ID)
;



