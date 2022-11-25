create table jul04_restaurent_ho(
	r_name varchar2(10 char) primary key,
	r_location varchar2(20 char) not null
);

insert into JUL04_RESTAURENT_HO values('송포갈비', '학원 뒷뒷블럭');
insert into JUL04_RESTAURENT_HO values('세광양대창', '나가서 오른쪽 꺾어서 두블럭');
insert into JUL04_RESTAURENT_HO values('리북집', '영동시장 다 가면 있는');

create table jul04_menu_ho(
	m_no number(2) primary key,
	m_name varchar2(6 char) not null,
	m_price number(5) not null,
	m_r_name varchar2(10 char) not null
);

create sequence jul04_menu_ho_seq;

insert into JUL04_MENU_HO values(jul04_menu_ho_seq.nextval, '양념갈비', 10000, '송포갈비');
insert into JUL04_MENU_HO values(jul04_menu_ho_seq.nextval, '생갈비', 10000, '송포갈비');
insert into JUL04_MENU_HO values(jul04_menu_ho_seq.nextval, '소주', 7000, '송포갈비');
insert into JUL04_MENU_HO values(jul04_menu_ho_seq.nextval, '된장찌개', 8000, '송포갈비');
insert into JUL04_MENU_HO values(jul04_menu_ho_seq.nextval, '모듬구이', 12000, '세광양대창');
insert into JUL04_MENU_HO values(jul04_menu_ho_seq.nextval, '대창구이', 11000, '세광양대창');
insert into JUL04_MENU_HO values(jul04_menu_ho_seq.nextval, '우동', 9000, '세광양대창');
insert into JUL04_MENU_HO values(jul04_menu_ho_seq.nextval, '소주', 8000, '세광양대창');
insert into JUL04_MENU_HO values(jul04_menu_ho_seq.nextval, '족발', 30000, '리북집');
insert into JUL04_MENU_HO values(jul04_menu_ho_seq.nextval, '막국수', 15000, '리북집');
insert into JUL04_MENU_HO values(jul04_menu_ho_seq.nextval, '소주', 7000, '리북집');
insert into JUL04_MENU_HO values(jul04_menu_ho_seq.nextval, '맥주', 8000, '리북집');

select * from JUL04_RESTAURENT_HO;
select * from JUL04_MENU_HO;

drop table JUL04_RESTAURENT_HO cascade constraint purge;
drop table JUL04_MENU_HO cascade constraint purge;

-- 전체 식당명, 위치
select r_name, r_location from JUL04_RESTAURENT_HO;
--or
select * from JUL04_RESTAURENT_HO;
-- 송포갈비 메뉴판
select m_name, m_price from JUL04_MENU_HO where m_r_name = '송포갈비';
--메뉴 평균가[회비 얼마씩 걷어야]
select avg(m_price) from JUL04_MENU_HO;
--맥주 평균가
select avg(m_price) from JUL04_MENU_HO where m_name = '맥주';
--평균가 보다 비싼 메뉴명, 가격
select m_name, m_price from JUL04_MENU_HO 
where m_price > (select avg(m_price) from JUL04_MENU_HO);
-- 최고가 메뉴명, 가격 [앞으로 회식비를 또 지원해준다면 뭐 먹나]
select m_name, m_price from JUL04_MENU_HO
where m_price = (select max(m_price) from JUL04_MENU_HO);
-- 최고가 메뉴는 어디가면 먹을 수 있나
select r_location 
from JUL04_RESTAURENT_HO 
where r_name = (
	select m_r_name 
	from JUL04_MENU_HO 
	where m_price = (
		select max(m_price) 
		from JUL04_MENU_HO)
		);

-- 평균보다 싼 메뉴는 어디가면 먹을 수 있나
select r_location 
from JUL04_RESTAURENT_HO 
where r_name in (
	select m_r_name 
	from JUL04_MENU_HO 
	where m_price < (
		select avg(m_price) 
		from JUL04_MENU_HO)
		);

-- 소주 어디가면 먹을 수 있나[매장명, 위치]
select r_name, r_location from JUL04_RESTAURENT_HO
where r_name in (select m_r_name from JUL04_MENU_HO 
where m_name = '소주');
--뒷뒷골목 메뉴판[메뉴명, 가격]
select m_name, m_price from JUL04_MENU_HO
where m_r_name in (select r_name from JUL04_RESTAURENT_HO 
where r_location like '%뒷뒷블럭%');
-- 제일 싼 메뉴를 파는 매장명, 위치
select r_name, r_location 
from JUL04_RESTAURENT_HO
where r_name in (
	select m_r_name 
	from JUL04_MENU_HO 
	where m_price = (
	select min(m_price) 
	from JUL04_MENU_HO));

-- 제일 싼 메뉴를 파는 매장명, 위치, 메뉴명, 가격

select r_name, r_location, m_name, m_price
from JUL04_RESTAURENT_HO, JUL04_MENU_HO
where r_name = m_r_name 
and m_price = (select min(m_price) from JUL04_MENU_HO);

--갈비시리즈 메뉴명, 가격, 위치
select m_name, m_price, r_location
from JUL04_MENU_HO, JUL04_RESTAURENT_HO
where r_name = m_r_name 
and m_name like '%갈비%';
--꺾어서 가면 먹을 수 있는 메뉴명, 가격, 매장명
select m_name, m_price, r_name
from JUL04_MENU_HO, JUL04_RESTAURENT_HO
where r_name = m_r_name
and r_location like '%꺾어서%';

select m_name, m_price, m_r_name
from JUL04_MENU_HO
where m_r_name in (
	select r_name
	from JUL04_RESTAURENT_HO
	where r_location like '%꺾어서%'
);



