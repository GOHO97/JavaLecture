insert into JUL06_LOCATION_HO
values(jul06_location_ho_seq.nextval, 1, 1, '명품관');
insert into JUL06_LOCATION_HO
values(jul06_location_ho_seq.nextval, 1, 2, '여성의류');
insert into JUL06_LOCATION_HO
values(jul06_location_ho_seq.nextval, 2, 1, '화장품');
insert into JUL06_LOCATION_HO
values(jul06_location_ho_seq.nextval, 2, 2, '남성의류');

insert into JUL06_SHOP_HO
values('구찌', '02-1234-5345', to_date('2012-04-05', 'YYYY-MM-DD'), 1);
insert into JUL06_SHOP_HO
values('롤렉스', '02-2345-6447', to_date('2008-10-05', 'YYYY-MM-DD'), 1);
insert into JUL06_SHOP_HO
values('톰보이', '02-1234-5345', to_date('2020-07-05', 'YYYY-MM-DD'), 2);
insert into JUL06_SHOP_HO
values('베네통', '02-1245-5345', to_date('2016-01-30', 'YYYY-MM-DD'), 2);
insert into JUL06_SHOP_HO
values('올리브영', '010-2345-5345', to_date('2022-07-01', 'YYYY-MM-DD'), 3);
insert into JUL06_SHOP_HO
values('입생로랑', '02-5678-5345', to_date('2018-10-05', 'YYYY-MM-DD'), 3);
insert into JUL06_SHOP_HO
values('금강제화', '010-3456-5345', to_date('2015-03-30', 'YYYY-MM-DD'), 4);
insert into JUL06_SHOP_HO
values('자라', '02-4567-5345', to_date('2013-07-23', 'YYYY-MM-DD'), 4);

insert into JUL06_PRODUCT_HO
values(jul06_product_ho_seq.nextval, '구찌가방', 2000000, '구찌');
insert into JUL06_PRODUCT_HO
values(jul06_product_ho_seq.nextval, '구찌지갑', 800000, '구찌');
insert into JUL06_PRODUCT_HO
values(jul06_product_ho_seq.nextval, '메탈시계', 9900000, '롤렉스');
insert into JUL06_PRODUCT_HO
values(jul06_product_ho_seq.nextval, '가죽시계', 8000000, '롤렉스');
insert into JUL06_PRODUCT_HO
values(jul06_product_ho_seq.nextval, '치마', 30000, '톰보이');
insert into JUL06_PRODUCT_HO
values(jul06_product_ho_seq.nextval, '나팔바지', 25000, '톰보이');
insert into JUL06_PRODUCT_HO
values(jul06_product_ho_seq.nextval, '와이셔츠', 32000, '베네통');
insert into JUL06_PRODUCT_HO
values(jul06_product_ho_seq.nextval, '반팔티', 18000, '베네통');
insert into JUL06_PRODUCT_HO
values(jul06_product_ho_seq.nextval, '비타민', 45000, '올리브영');
insert into JUL06_PRODUCT_HO
values(jul06_product_ho_seq.nextval, '여드름패치', 5000, '올리브영');
insert into JUL06_PRODUCT_HO
values(jul06_product_ho_seq.nextval, '틴트', 80000, '입생로랑');
insert into JUL06_PRODUCT_HO
values(jul06_product_ho_seq.nextval, '파운데이션', 150000, '입생로랑');
insert into JUL06_PRODUCT_HO
values(jul06_product_ho_seq.nextval, '가죽구두', 180000, '금강제화');
insert into JUL06_PRODUCT_HO
values(jul06_product_ho_seq.nextval, '데일리구두', 200000, '금강제화');
insert into JUL06_PRODUCT_HO
values(jul06_product_ho_seq.nextval, '가디건', 150000, '자라');
insert into JUL06_PRODUCT_HO
values(jul06_product_ho_seq.nextval, '남성와이셔츠', 50000, '자라');

create table jul06_location_ho (
	l_no number(3) primary key,
	l_hall number(1) not null,
	l_floor number(2) not null,
	l_cate varchar2(7 char) not null 
);
create sequence jul06_location_ho_seq;

create table jul06_shop_ho(
	s_name varchar2(10 char) primary key,
	s_call varchar2(13 char) not null,
	s_open date not null,
	s_locationNum number(3) not null 
);
create sequence jul06_shop_ho_seq;

create table jul06_product_ho (
	p_no number(3) primary key	,
	p_name varchar2(15 char) not null,
	p_price number(7) not null,
	p_shopName varchar2(10 char) not null
);
create sequence jul06_product_ho_seq;

select * from JUL06_LOCATION_HO;
select * from JUL06_shop_HO;
select * from JUL06_PRODUCT_HO;

drop table JUL06_LOCATION_HO cascade constraint purge;
drop table JUL06_SHOP_HO cascade constraint purge;
drop table JUL06_PRODUCT_HO cascade constraint purge;

--제일 오래된 매장 이름, 연락처
select s_name, s_call from JUL06_SHOP_HO where s_open = (select min(s_open) from JUL06_SHOP_HO);
--제일 비싼 상품[상품명, 가격, 매장명]
select p_name, p_price, p_shopName from JUL06_product_HO
where p_price = (select max(p_price) from JUL06_PRODUCT_HO);
--매장 전체 정보[매장명, 연락처, 몇관, 몇층]
select l_hall, l_floor, s_name, s_call
from JUL06_LOCATION_HO, jul06_shop_ho
where s_locationNum = l_no;
--관/층별 평균가
select l_hall, l_floor, avg(p_price)
from JUL06_LOCATION_HO, JUL06_SHOP_HO, jul06_product_ho
where l_no = s_locationNum and s_name = p_shopName
group by l_hall, l_floor;
--2관 상품 10% 할인
update jul06_product_ho
set p_price = p_price * 0.9
where p_shopName in (select s_name from JUL06_SHOP_HO
where s_locationNum in (select l_hall from JUL06_LOCATION_HO 
where l_hall = 2));
--제일 싼거 삭제
delete from JUL06_PRODUCT_HO
where p_price = (select min(p_price) from JUL06_PRODUCT_HO);
--2관 폐쇄




