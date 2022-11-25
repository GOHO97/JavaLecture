create table jul05_owner_ho (
	o_no number(3) primary key,
	o_name varchar2(10 char) not null,
	o_birth date not null,
	o_addr varchar2(10 char) not null
);
create sequence jul05_owner_ho_seq;
drop table jul05_owner_ho cascade constraint purge;

insert into JUL05_OWNER_HO 
values(jul05_owner_ho_seq.nextval, '최길동', to_date('19850101', 'YYYYMMDD'), '수원');
insert into JUL05_OWNER_HO 
values(jul05_owner_ho_seq.nextval, '홍길동', to_date('19800101', 'YYYYMMDD'), '분당');
insert into JUL05_OWNER_HO 
values(jul05_owner_ho_seq.nextval, '김길동', to_date('19750101', 'YYYYMMDD'), '영등포');
insert into JUL05_OWNER_HO 
values(jul05_owner_ho_seq.nextval, '이길동', to_date('19830101', 'YYYYMMDD'), '목동');
insert into JUL05_OWNER_HO 
values(jul05_owner_ho_seq.nextval, '박길동', to_date('19870101', 'YYYYMMDD'), '까치산');
-------------------------------------------------------------------------------------------------------
create table jul05_store_ho (
	s_no number(3) primary key,
	s_name_name varchar2(10 char) not null,
	s_jijum_name varchar2(10 char) not null
);
create sequence jul05_store_ho_seq;
drop table jul05_store_ho cascade constraint purge;

insert into JUL05_STORE_HO
values(jul05_store_ho_seq.nextval, '세븐일레븐', '교대점');
insert into JUL05_STORE_HO
values(jul05_store_ho_seq.nextval, 'cu', '서초점');
insert into JUL05_STORE_HO
values(jul05_store_ho_seq.nextval, 'cu', '강남점');
insert into JUL05_STORE_HO
values(jul05_store_ho_seq.nextval, 'GS25', '서초점');
insert into JUL05_STORE_HO
values(jul05_store_ho_seq.nextval, 'GS25', '강남점');
insert into JUL05_STORE_HO
values(jul05_store_ho_seq.nextval, 'GS25', '목동점');
insert into JUL05_STORE_HO
values(jul05_store_ho_seq.nextval, '세븐일레븐', '목동점');
insert into JUL05_STORE_HO
values(jul05_store_ho_seq.nextval, 'CU', '목동점');
insert into JUL05_STORE_HO
values(jul05_store_ho_seq.nextval, '세븐일레븐', '강남점');
insert into JUL05_STORE_HO
values(jul05_store_ho_seq.nextval, '미니스톱', '교대점');
-------------------------------------------------------------------------------------------------------
create table jul05_run_ho (
	r_no number(3) primary key,
	r_c_no number(3) not null,
	r_s_no number(3) not null
);
create sequence jul05_run_ho_seq;
drop table jul05_run_ho cascade constraint purge;

insert into JUL05_RUN_HO 
values(jul05_run_ho_seq.nextval, 2, 2);
insert into JUL05_RUN_HO 
values(jul05_run_ho_seq.nextval, 1, 3);
insert into JUL05_RUN_HO 
values(jul05_run_ho_seq.nextval, 1, 4);
insert into JUL05_RUN_HO 
values(jul05_run_ho_seq.nextval, 2, 1);
insert into JUL05_RUN_HO 
values(jul05_run_ho_seq.nextval, 1, 1);
insert into JUL05_RUN_HO 
values(jul05_run_ho_seq.nextval, 3, 7);
insert into JUL05_RUN_HO 
values(jul05_run_ho_seq.nextval, 4, 10);
insert into JUL05_RUN_HO 
values(jul05_run_ho_seq.nextval, 3, 8);
insert into JUL05_RUN_HO 
values(jul05_run_ho_seq.nextval, 5, 9);
insert into JUL05_RUN_HO 
values(jul05_run_ho_seq.nextval, 2, 8);
insert into JUL05_RUN_HO 
values(jul05_run_ho_seq.nextval, 4, 6);
insert into JUL05_RUN_HO 
values(jul05_run_ho_seq.nextval, 4, 5);
insert into JUL05_RUN_HO 
values(jul05_run_ho_seq.nextval, 5, 8);
insert into JUL05_RUN_HO 
values(jul05_run_ho_seq.nextval, 3, 6);
insert into JUL05_RUN_HO 
values(jul05_run_ho_seq.nextval, 5, 10);
insert into JUL05_RUN_HO 
values(jul05_run_ho_seq.nextval, 4, 8);

-------------------------------------------------------------------------------------------------------
create table jul05_product_ho (
	p_no number(3) primary key,
	p_name varchar2(10 char) not null,
	p_cate varchar2(10 char) not null,
	p_price number(5) not null,
	p_s_no number(3) not null
);
create sequence jul05_product_ho_seq;
drop table jul05_product_ho cascade constraint purge;

insert into JUL05_PRODUCT_HO
values(jul05_product_ho_seq.nextval, '포도젤리', '과자', 1500, 2);
insert into JUL05_PRODUCT_HO
values(jul05_product_ho_seq.nextval, '자두젤리', '과자', 1700, 2);
insert into JUL05_PRODUCT_HO
values(jul05_product_ho_seq.nextval, '포도젤리', '과자', 1600, 3);
insert into JUL05_PRODUCT_HO
values(jul05_product_ho_seq.nextval, '마스크', '생필품', 1000, 4);
insert into JUL05_PRODUCT_HO
values(jul05_product_ho_seq.nextval, '펜', '문구', 500, 1);
insert into JUL05_PRODUCT_HO
values(jul05_product_ho_seq.nextval, '이과두주', '술', 4000, 1);
insert into JUL05_PRODUCT_HO
values(jul05_product_ho_seq.nextval, '참이슬', '술', 1800, 4);
insert into JUL05_PRODUCT_HO
values(jul05_product_ho_seq.nextval, '참이슬', '술', 1900, 5);
insert into JUL05_PRODUCT_HO
values(jul05_product_ho_seq.nextval, '처음처럼', '술', 2000, 6);
insert into JUL05_PRODUCT_HO
values(jul05_product_ho_seq.nextval, '치토스', '과자', 1600, 7);
insert into JUL05_PRODUCT_HO
values(jul05_product_ho_seq.nextval, '포스틱', '과자', 1550, 7);
insert into JUL05_PRODUCT_HO
values(jul05_product_ho_seq.nextval, '썬칩', '과자', 1750, 6);
insert into JUL05_PRODUCT_HO
values(jul05_product_ho_seq.nextval, '족발', '식품', 12000, 5);
insert into JUL05_PRODUCT_HO
values(jul05_product_ho_seq.nextval, '곱창', '식품', 7500, 8);
insert into JUL05_PRODUCT_HO
values(jul05_product_ho_seq.nextval, '편육', '식품', 13000, 8);
insert into JUL05_PRODUCT_HO
values(jul05_product_ho_seq.nextval, '초코빅', '과자', 900, 9);
insert into JUL05_PRODUCT_HO
values(jul05_product_ho_seq.nextval, '와우껌', '과자', 500, 10);
insert into JUL05_PRODUCT_HO
values(jul05_product_ho_seq.nextval, '블랑', '술', 3500, 9);
insert into JUL05_PRODUCT_HO
values(jul05_product_ho_seq.nextval, '카스', '술', 2900, 10);
insert into JUL05_PRODUCT_HO
values(jul05_product_ho_seq.nextval, '테라', '술', 3000, 5);
insert into JUL05_PRODUCT_HO
values(jul05_product_ho_seq.nextval, '진로', '술', 2000, 5);
insert into JUL05_PRODUCT_HO
values(jul05_product_ho_seq.nextval, '기네스', '술', 3700, 6);
insert into JUL05_PRODUCT_HO
values(jul05_product_ho_seq.nextval, '하이네켄', '술', 4000, 7);
insert into JUL05_PRODUCT_HO
values(jul05_product_ho_seq.nextval, '칫솔', '생필품', 2200, 8);
insert into JUL05_PRODUCT_HO
values(jul05_product_ho_seq.nextval, '치약', '생필품', 2300, 7);
insert into JUL05_PRODUCT_HO
values(jul05_product_ho_seq.nextval, '샴푸', '생필품', 4200, 6);
insert into JUL05_PRODUCT_HO
values(jul05_product_ho_seq.nextval, '린스', '생필품', 4300, 8);
insert into JUL05_PRODUCT_HO
values(jul05_product_ho_seq.nextval, '물티슈', '생필품', 1200, 6);
insert into JUL05_PRODUCT_HO
values(jul05_product_ho_seq.nextval, '칫솔', '생필품', 1700, 7);
insert into JUL05_PRODUCT_HO
values(jul05_product_ho_seq.nextval, '치약', '생필품', 2000, 4);


--cu 전체 상품목록[지점명, 상품명, 가격]
select s_jijum_name, p_name, p_price 
from JUL05_STORE_HO, JUL05_PRODUCT_HO
where s_no = p_s_no and s_name_name = 'CU' or s_no = p_s_no and s_name_name = 'cu';

--술평균가
select avg(p_price) from JUL05_PRODUCT_HO where p_cate = '술';
--제일 비싼 상품파는 사장님 집
select 
--제일 어린 사장님 운영하는 매장[매장명]

--사장님이름, 생일, 매장명, 지점명, 상품명, 가격
--사장님 이름가나다순 -> 매장명가나다->가격비싼순
-- 2~6번까지

--메이커별 평균가
select s_name_name, avg(p_price)
from jul05_store_ho, jul05_product_ho
where s_no = p_s_no
group by s_name_name;
--메이커별/카테고리별 평균가
select s_name_name, p_cate, avg(p_price)
from JUL05_STORE_HO, JUL05_PRODUCT_HO
where s_no = p_s_no
group by s_name_name, p_cate
order by s_name_name, p_cate;

--메이커별 카테고리별 전체 상품명, 가격
select s_name_name, p_cate, p_name, p_price
from JUL05_STORE_HO, JUL05_PRODUCT_HO
where s_no = p_s_no
order by s_name_name, p_cate;

-- 사장님 별/카테고리별 몇 종류, 최고가
select o_name, p_cate, 

--메이커별/카테별 몇 종류, 평균가
--가격이 1000원 이상인것만 대상으로
select s_name_name, p_cate, count(*), avg(p_price)
from jul05_store_ho, jul05_product_ho
where s_no = p_s_no
group by s_name_name, p_cate
having avg(p_price) >= 1000
order by s_name_name, p_cate;

--사장님별/메이커별 평균가, 최고가, 최소가
--1000원 미만인거는 빼고 통계
--평균가가 1500원 이상인 항목만 봅시다
select o_name, s_name_name, avg(p_price), max(p_price), min(p_price)
from JUL05_OWNER_HO, jul05_run_ho, jul05_store_ho, JUL05_PRODUCT_HO
where o_no = r_c_no and s_no = r_s_no and s_no = p_s_no and p_price >= 1000
group by o_name, s_name_name
having avg(p_price) >= 1500
order by o_name, s_name_name;


update JUL05_PRODUCT_HO
set p_price = 5000
where p_name = '이과두주';

-- CU 상품 10%로 할인
update JUL05_PRODUCT_HO
set p_price = p_price * 0.9
where p_s_no in (
	select s_no
	from jul05_store_ho
	where s_name_name = 'cu' or s_name_name = 'CU'
);


select * from JUL05_PRODUCT_HO;

--최고가 상품 삭제
delete from JUL05_PRODUCT_HO
where p_price = (select max(p_price) from JUL05_PRODUCT_HO);

