create table jul05_student_ho (
	s_no number(2) primary key,
	s_name varchar2(5 char) not null, 
	s_birth date not null
);
create sequence jul05_student_ho_seq;

insert into jul05_student_ho
values(jul05_student_ho_seq.nextval, '홍길동', to_date('2000-01-01', 'YYYY-MM-DD'));
insert into jul05_student_ho
values(jul05_student_ho_seq.nextval, '김길동', to_date('2001-05-21', 'YYYY-MM-DD'));
insert into jul05_student_ho
values(jul05_student_ho_seq.nextval, '최길동', to_date('2002-10-15', 'YYYY-MM-DD'));

create table jul05_computer_ho (
	c_no number(2) primary key,
	c_cpu varchar2(10 char) not null,
	c_ram number(2) not null,
	c_hdd number(3) not null
);
create sequence jul05_computer_ho_seq;

insert into jul05_computer_ho
values(jul05_computer_ho_seq.nextval, 'i7-1234', 16, 500);
insert into jul05_computer_ho
values(jul05_computer_ho_seq.nextval, 'i7-2234', 8, 250);
insert into jul05_computer_ho
values(jul05_computer_ho_seq.nextval, 'i7-3234', 32, 500);
insert into jul05_computer_ho
values(jul05_computer_ho_seq.nextval, 'i7-3524', 16, 250);
insert into jul05_computer_ho
values(jul05_computer_ho_seq.nextval, 'i7-1364', 16, 500);
insert into jul05_computer_ho
values(jul05_computer_ho_seq.nextval, 'i7-4214', 8, 250);
insert into jul05_computer_ho
values(jul05_computer_ho_seq.nextval, 'i7-3241', 32, 500);
insert into jul05_computer_ho
values(jul05_computer_ho_seq.nextval, 'i7-3221', 16, 250);

create table jul05_usecom_ho (
	u_no number(2) primary key,
	u_s_no number(2) not null,
	u_c_no number(2) not null
);
create sequence jul05_usecom_ho_seq;

insert into jul05_usecom_ho
values(jul05_usecom_ho_seq.nextval, 1, 1);
insert into jul05_usecom_ho
values(jul05_usecom_ho_seq.nextval, 2, 2);
insert into jul05_usecom_ho
values(jul05_usecom_ho_seq.nextval, 3, 3);
insert into jul05_usecom_ho
values(jul05_usecom_ho_seq.nextval, 3, 1);


select * from jul05_computer_ho;
select * from jul05_student_ho;
select * from jul05_usecom_ho;

--강의실 컴퓨터 전체 사양
select * from JUL05_COMPUTER_HO;
--평균 hdd 용량
select avg(c_hdd) from JUL05_COMPUTER_HO;
--학생들 전체 정보
select * from jul05_student_ho;
--평균 ram용량 보다 구린 컴퓨터 쓰는 학생 이름, 생일
select s_name, s_birth from JUL05_STUDENT_HO
where s_no in (select u_s_no from JUL05_USECOM_HO 
where u_c_no in (select c_no from JUL05_COMPUTER_HO
where c_ram < (select avg(c_ram) from JUL05_COMPUTER_HO)));
--최길동이 쓰는 모든 컴퓨터 전체 사양
select * from JUL05_COMPUTER_HO 
where c_no in (select u_c_no from JUL05_USECOM_HO 
where u_s_no in (select s_no from JUL05_STUDENT_HO
where s_name = '최길동'));
--hdd용량 제일 작은 컴퓨터 쓰는 학생은 언제 얼굴에 케잌 던지면 되나[이름/월/일]
select s_name, to_char(s_birth, 'MM/DD') from JUL05_STUDENT_HO
where s_no in (select u_s_no from JUL05_USECOM_HO 
where u_c_no in (select c_no from JUL05_COMPUTER_HO
where c_hdd = (select min(c_hdd) from JUL05_COMPUTER_HO)));
--최연장자 학생이 쓰는 컴퓨터 정보
select * from JUL05_COMPUTER_HO where c_no in(
	select u_c_no from JUL05_USECOM_HO where u_s_no in (
		select s_no from JUL05_STUDENT_HO where s_birth = (
			select min(s_birth) from JUL05_STUDENT_HO
		)
	)
);
--강의실 서버 현황[이름, 컴번호, cpu, ram, hdd]를 학생 이름 순으로
select s_name, c_no, c_cpu, c_ram, c_hdd 
from JUL05_STUDENT_HO, JUL05_COMPUTER_HO, JUL05_USECOM_HO
where c_no = u_c_no and s_no = u_s_no;

--학생 전체 정보를 이름 가나다순으로
select * from JUL05_STUDENT_HO
order by s_name;

--컴 정보를 cpu좋은순, 같을 때는 ram 좋은순, 같을 때는 hdd 좋은순
select * from JUL05_COMPUTER_HO
order by c_cpu desc, c_ram desc, c_hdd desc;

--평균보다 좋은 ram 쓰는 사람
select s_name, s_birth from JUL05_STUDENT_HO
where s_no in (select u_s_no from JUL05_USECOM_HO 
where u_c_no in (select c_no from JUL05_COMPUTER_HO
where c_ram > (select avg(c_ram) from JUL05_COMPUTER_HO))); 
-- 서버사용정보[학생이름, 생일, 컴번호, cpu, ram, hdd]
select s_name, s_birth, c_no, c_cpu, c_ram, c_hdd 
from JUL05_STUDENT_HO, JUL05_COMPUTER_HO, JUL05_USECOM_HO
where s_no = u_s_no and c_no = u_c_no
order by s_name;
--cpu구린순, 이름가나다순
select s_name, c_cpu 
from JUL05_STUDENT_HO, JUL05_COMPUTER_HO, JUL05_COMPUTER_HO
where s_no = u_s_no and c_no = u_c_no
order by c_cpu, s_name; 

select *
from(
	select rownum as rn, c_no, c_cpu, c_ram, c_hdd 
	from (
		select * from jul05_computer_ho
		order by c_cpu desc, c_ram desc, c_hdd desc
		)
)
where rn >= 6 and rn <= 10;

-- 이름에 길동 들어가는 사람이 쓰는 서버 정보
-- 이름, 생일, 컴번호, cpu, ram, hdd
-- 학생이름 가나다순 -> 컴번호 오름차순
-- 2~ 3번만 꺼내기

select *
from(
	select rownum as rn, s_name, s_birth, c_no, c_cpu, c_ram, c_hdd
	from(
		select s_name, s_birth, c_no, c_cpu, c_ram, c_hdd
		from JUL05_STUDENT_HO, JUL05_COMPUTER_HO, JUL05_USECOM_HO
		where s_no = u_s_no and c_no = u_c_no and s_name like '%길동%'
		order by s_name, c_no
		)
)
where rn >= 2 and rn <= 3;
