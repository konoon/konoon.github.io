-- 이클립스에서 오라클 DB 연동 쿼리문 
create table student(
	num NUMBER(4) PRIMARY KEY,
	name VARCHAR2(10),
	phone VARCHAR2(15),
	addr VARCHAR2(20));
	
select * from tab;

INSERT INTO student VALUES(1,'홍길동','010-111-1234','영등포');
INSERT INTO student VALUES(2,'김다미','010-222-2222','이태원');
INSERT INTO student VALUES(3,'장나라','010-333-3333','건대');
INSERT INTO student VALUES(4,'임꺽정','010-444-4444','잠실');
INSERT INTO student VALUES(5,'이순신','010-555-5555','역삼동');
INSERT INTO student VALUES(6,'김국진','010-666-6666','서초동');

-- COMMIT 적용은 ; 뺴야함
COMMIT

select * from student;

SELECT NUM, NAME, PHONE, ADDR FROM student;

INSERT INTO student VALUES(10, '김희태', '010-55441-4444', '독도');

DROP TABLE student;



INSERT INTO student VALUES(1,'홍길동','010-111-1234','영등포');
INSERT INTO student VALUES(2,'김다미','010-222-2222','이태원');
INSERT INTO student VALUES(3,'장나라','010-333-3333','건대');
INSERT INTO student VALUES(4,'임꺽정','010-444-4444','잠실');
INSERT INTO student VALUES(5,'이순신','010-555-5555','역삼동');
INSERT INTO student VALUES(6,'김국진','010-666-6666','서초동');

-- COMMIT 적용은 ; 뺴야함
COMMIT

UPDATE student SET NAME = '이영자', PHONE = '010-1237-5465' WHERE NUM = '4';

DELETE from student WHERE NUM = '10';

SELECT FROM student where num = '1';
