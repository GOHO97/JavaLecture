insert into JUL06_LOCATION_HO
values(jul06_location_ho_seq.nextval, 1, 1, '��ǰ��');
insert into JUL06_LOCATION_HO
values(jul06_location_ho_seq.nextval, 1, 2, '�����Ƿ�');
insert into JUL06_LOCATION_HO
values(jul06_location_ho_seq.nextval, 2, 1, 'ȭ��ǰ');
insert into JUL06_LOCATION_HO
values(jul06_location_ho_seq.nextval, 2, 2, '�����Ƿ�');

insert into JUL06_SHOP_HO
values('����', '02-1234-5345', to_date('2012-04-05', 'YYYY-MM-DD'), 1);
insert into JUL06_SHOP_HO
values('�ѷ���', '02-2345-6447', to_date('2008-10-05', 'YYYY-MM-DD'), 1);
insert into JUL06_SHOP_HO
values('�躸��', '02-1234-5345', to_date('2020-07-05', 'YYYY-MM-DD'), 2);
insert into JUL06_SHOP_HO
values('������', '02-1245-5345', to_date('2016-01-30', 'YYYY-MM-DD'), 2);
insert into JUL06_SHOP_HO
values('�ø��꿵', '010-2345-5345', to_date('2022-07-01', 'YYYY-MM-DD'), 3);
insert into JUL06_SHOP_HO
values('�Ի��ζ�', '02-5678-5345', to_date('2018-10-05', 'YYYY-MM-DD'), 3);
insert into JUL06_SHOP_HO
values('�ݰ���ȭ', '010-3456-5345', to_date('2015-03-30', 'YYYY-MM-DD'), 4);
insert into JUL06_SHOP_HO
values('�ڶ�', '02-4567-5345', to_date('2013-07-23', 'YYYY-MM-DD'), 4);

insert into JUL06_PRODUCT_HO
values(jul06_product_ho_seq.nextval, '�����', 2000000, '����');
insert into JUL06_PRODUCT_HO
values(jul06_product_ho_seq.nextval, '��������', 800000, '����');
insert into JUL06_PRODUCT_HO
values(jul06_product_ho_seq.nextval, '��Ż�ð�', 9900000, '�ѷ���');
insert into JUL06_PRODUCT_HO
values(jul06_product_ho_seq.nextval, '���׽ð�', 8000000, '�ѷ���');
insert into JUL06_PRODUCT_HO
values(jul06_product_ho_seq.nextval, 'ġ��', 30000, '�躸��');
insert into JUL06_PRODUCT_HO
values(jul06_product_ho_seq.nextval, '���ȹ���', 25000, '�躸��');
insert into JUL06_PRODUCT_HO
values(jul06_product_ho_seq.nextval, '���̼���', 32000, '������');
insert into JUL06_PRODUCT_HO
values(jul06_product_ho_seq.nextval, '����Ƽ', 18000, '������');
insert into JUL06_PRODUCT_HO
values(jul06_product_ho_seq.nextval, '��Ÿ��', 45000, '�ø��꿵');
insert into JUL06_PRODUCT_HO
values(jul06_product_ho_seq.nextval, '���帧��ġ', 5000, '�ø��꿵');
insert into JUL06_PRODUCT_HO
values(jul06_product_ho_seq.nextval, 'ƾƮ', 80000, '�Ի��ζ�');
insert into JUL06_PRODUCT_HO
values(jul06_product_ho_seq.nextval, '�Ŀ�̼�', 150000, '�Ի��ζ�');
insert into JUL06_PRODUCT_HO
values(jul06_product_ho_seq.nextval, '���ױ���', 180000, '�ݰ���ȭ');
insert into JUL06_PRODUCT_HO
values(jul06_product_ho_seq.nextval, '���ϸ�����', 200000, '�ݰ���ȭ');
insert into JUL06_PRODUCT_HO
values(jul06_product_ho_seq.nextval, '�����', 150000, '�ڶ�');
insert into JUL06_PRODUCT_HO
values(jul06_product_ho_seq.nextval, '�������̼���', 50000, '�ڶ�');

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

--���� ������ ���� �̸�, ����ó
select s_name, s_call from JUL06_SHOP_HO where s_open = (select min(s_open) from JUL06_SHOP_HO);
--���� ��� ��ǰ[��ǰ��, ����, �����]
select p_name, p_price, p_shopName from JUL06_product_HO
where p_price = (select max(p_price) from JUL06_PRODUCT_HO);
--���� ��ü ����[�����, ����ó, ���, ����]
select l_hall, l_floor, s_name, s_call
from JUL06_LOCATION_HO, jul06_shop_ho
where s_locationNum = l_no;
--��/���� ��հ�
select l_hall, l_floor, avg(p_price)
from JUL06_LOCATION_HO, JUL06_SHOP_HO, jul06_product_ho
where l_no = s_locationNum and s_name = p_shopName
group by l_hall, l_floor;
--2�� ��ǰ 10% ����
update jul06_product_ho
set p_price = p_price * 0.9
where p_shopName in (select s_name from JUL06_SHOP_HO
where s_locationNum in (select l_hall from JUL06_LOCATION_HO 
where l_hall = 2));
--���� �Ѱ� ����
delete from JUL06_PRODUCT_HO
where p_price = (select min(p_price) from JUL06_PRODUCT_HO);
--2�� ���




