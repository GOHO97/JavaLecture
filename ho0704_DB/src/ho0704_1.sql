create table JUL04_student_ho(
	r_no number(2) primary key,
	r_name varchar2(10 char),
	r_kor number(3),
	r_eng number(3),
	r_math number(3)
);

insert into JUL04_STUDENT_HO values(jul04_student_ho_seq.nextval, '홍길동', 80, 70, 90);
insert into JUL04_STUDENT_HO values(jul04_student_ho_seq.nextval, '김길동', 75, 66, 54);
insert into JUL04_STUDENT_HO values(jul04_student_ho_seq.nextval, '최길동', 42, 62, 80);
insert into JUL04_STUDENT_HO values(jul04_student_ho_seq.nextval, '이길동', 34, 87, 100);
insert into JUL04_STUDENT_HO values(jul04_student_ho_seq.nextval, '양길동', 21, 96, 58);
select * from JUL04_STUDENT_HO;

create table jul04_menu_ho(
	m_name varchar2(10 char) primary key,
	m_price number(5) not null
);

insert into JUL04_MENU_HO values('양꼬치', 35000);
select * from JUL04_MENU_HO;
insert into JUL04_MENU_HO values('꿔바로우', 72000);

drop table JUL04_menu_ho cascade constraint purge;
drop table JUL04_student_ho cascade constraint purge;

create sequence jul04_student_ho_seq;



