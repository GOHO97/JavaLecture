create table JUL04_student_ho(
	r_no number(2) primary key,
	r_name varchar2(10 char),
	r_kor number(3),
	r_eng number(3),
	r_math number(3)
);

insert into JUL04_STUDENT_HO values(jul04_student_ho_seq.nextval, 'ȫ�浿', 80, 70, 90);
insert into JUL04_STUDENT_HO values(jul04_student_ho_seq.nextval, '��浿', 75, 66, 54);
insert into JUL04_STUDENT_HO values(jul04_student_ho_seq.nextval, '�ֱ浿', 42, 62, 80);
insert into JUL04_STUDENT_HO values(jul04_student_ho_seq.nextval, '�̱浿', 34, 87, 100);
insert into JUL04_STUDENT_HO values(jul04_student_ho_seq.nextval, '��浿', 21, 96, 58);
select * from JUL04_STUDENT_HO;

create table jul04_menu_ho(
	m_name varchar2(10 char) primary key,
	m_price number(5) not null
);

insert into JUL04_MENU_HO values('�粿ġ', 35000);
select * from JUL04_MENU_HO;
insert into JUL04_MENU_HO values('��ٷο�', 72000);

drop table JUL04_menu_ho cascade constraint purge;
drop table JUL04_student_ho cascade constraint purge;

create sequence jul04_student_ho_seq;



