create table jul04_snack_ho(
	s_no number(2) primary key,
	s_name varchar2(10 char) not null,
	s_price number(5) not null,
	s_weight number(6, 2) not null,
	s_exp date not null
);

create sequence jul04_snack_ho_seq;

insert into jul04_snack_ho
values(jul04_snack_ho_seq.nextval, '초코파이', 5000, 500.12, sysdate);
insert into jul04_snack_ho
values(jul04_snack_ho_seq.nextval, '양파링', 2000, 350.24, to_date('2022-08-01 13', 'YYYY-MM-DD HH24'));


select * from jul04_snack_ho;

--전체 과자이름과 가격만
select s_name, s_price from JUL04_SNACK_HO;
-- 전체 과자이름과 유통기한
select s_name, s_exp as exp_date from JUL04_SNACK_HO;

-- 전체 과자이름, 가격, g당 가격
select s_name, s_price, s_price / s_weight from jul04_snack_ho;

-- 전체 과자이름, 가격, 유통기한, VAT
select s_name, s_price, s_exp as exp_date, s_price * 0.1 as VAT from JUL04_SNACK_HO;
-- 전체 과자 평균가
select avg(s_price) from JUL04_SNACK_HO;

-- 최고가, 최저가
select max(s_price), min(s_price) from JUL04_SNACK_HO;
-- 과자 총 몇 종류
select count(s_no) from JUL04_SNACK_HO;
-- g당 가격의 평균
select avg(s_price / s_weight)  as avg_price_g from jul04_snack_ho; 

-- 가격이 2000원 이상인 과자이름, 가격
select s_name, s_price from JUL04_SNACK_HO where s_price >= 3000;

-- 가격이 3000원 미만인 것 몇 종류
select count(s_no) from JUL04_SNACK_HO where s_price < 3000; 
-- 초코파이의 이름, 가격, 유통기한
select s_name, s_price, s_exp as exp_date from JUL04_SNACK_HO where s_name = '초코파이';

--먹어도 목숨에 지장 없는 과자 이름, 가격, 유통기한
select s_name, s_price, s_exp from JUL04_SNACK_HO where s_exp >= sysdate;
--초코시리즈 평균가
select avg(s_price) from JUL04_SNACK_HO where s_name like '%초코%';
-- ~깡 몇 종류
select count(s_no) from jul04_snack_ho where s_name like '%깡%';

insert into JUL04_SNACK_HO
values(JUL04_SNACK_HO_seq.nextval, '츄파춥스', 300, 10, sysdate);

insert into JUL04_SNACK_HO
values(JUL04_SNACK_HO_seq.nextval, '빼빼로', 1300, 110, to_date('20220704 17', 'YYYYMMDD HH24'));

--오늘 내로 먹어야 하는 과자 이름, 가격, 유통기한
select s_name, s_price, to_char(s_exp, 'MM/DD') from JUL04_SNACK_HO where s_exp <= sysdate;

--내일 먹으면 죽는 과자 이름, 가격, 유통기한
select s_name, s_price, to_char(s_exp, 'MM/DD') from JUL04_SNACK_HO where s_exp <= to_char(sysdate, 'YYYY/MM/DD'), '23:59:59'), 'YYYY/MM/DD HH24:MI:SS'

-- 1000 < 가격 < 5000인 과자 이름, 가격
select s_name, s_price from jul04_snack_ho where s_price > 1000 and s_price < 5000;

-- ~~파이나 깡 g당 가격의 평균
select avg(s_price / s_weight) from jul04_snack_ho where s_name like '%파이' or s_name like'%깡';
-- 5000원 이상이거나 1000원 이하 몇 종류
select count(*) from jul04_snack_ho where s_price >= 5000 or s_price <= 1000;
-- 최고가 과자 이름, 가격
select s_name, s_price from jul04_snack_ho 
where s_price = (select max(s_price) from jul04_snack_ho);

--평균보다 싼 과자 이름, 가격
select s_name, s_price from jul04_snack_ho 
where s_price < (select avg(s_price) from jul04_snack_ho);
--평균보다 비싼 과자는 몇 개
select count(s_no)from jul04_snack_ho 
where s_price > (select avg(s_price) from jul04_snack_ho);
-- 빼빼로보다 비싼 과자 이름, 가격
select s_name, s_price from jul04_snack_ho 
where s_price > (select s_price from jul04_snack_ho where s_name = '빼빼로');


