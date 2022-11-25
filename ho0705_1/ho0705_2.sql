create table jul05_owner_ho (
	o_no number(3) primary key,
	o_name varchar2(10 char) not null,
	o_birth date not null,
	o_addr varchar2(10 char) not null
);
create sequence jul05_owner_ho_seq;
drop table jul05_owner_ho cascade constraint purge;

insert into JUL05_OWNER_HO 
values(jul05_owner_ho_seq.nextval, '�ֱ浿', to_date('19850101', 'YYYYMMDD'), '����');
insert into JUL05_OWNER_HO 
values(jul05_owner_ho_seq.nextval, 'ȫ�浿', to_date('19800101', 'YYYYMMDD'), '�д�');
insert into JUL05_OWNER_HO 
values(jul05_owner_ho_seq.nextval, '��浿', to_date('19750101', 'YYYYMMDD'), '������');
insert into JUL05_OWNER_HO 
values(jul05_owner_ho_seq.nextval, '�̱浿', to_date('19830101', 'YYYYMMDD'), '��');
insert into JUL05_OWNER_HO 
values(jul05_owner_ho_seq.nextval, '�ڱ浿', to_date('19870101', 'YYYYMMDD'), '��ġ��');
-------------------------------------------------------------------------------------------------------
create table jul05_store_ho (
	s_no number(3) primary key,
	s_name_name varchar2(10 char) not null,
	s_jijum_name varchar2(10 char) not null
);
create sequence jul05_store_ho_seq;
drop table jul05_store_ho cascade constraint purge;

insert into JUL05_STORE_HO
values(jul05_store_ho_seq.nextval, '�����Ϸ���', '������');
insert into JUL05_STORE_HO
values(jul05_store_ho_seq.nextval, 'cu', '������');
insert into JUL05_STORE_HO
values(jul05_store_ho_seq.nextval, 'cu', '������');
insert into JUL05_STORE_HO
values(jul05_store_ho_seq.nextval, 'GS25', '������');
insert into JUL05_STORE_HO
values(jul05_store_ho_seq.nextval, 'GS25', '������');
insert into JUL05_STORE_HO
values(jul05_store_ho_seq.nextval, 'GS25', '����');
insert into JUL05_STORE_HO
values(jul05_store_ho_seq.nextval, '�����Ϸ���', '����');
insert into JUL05_STORE_HO
values(jul05_store_ho_seq.nextval, 'CU', '����');
insert into JUL05_STORE_HO
values(jul05_store_ho_seq.nextval, '�����Ϸ���', '������');
insert into JUL05_STORE_HO
values(jul05_store_ho_seq.nextval, '�̴Ͻ���', '������');
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
values(jul05_product_ho_seq.nextval, '��������', '����', 1500, 2);
insert into JUL05_PRODUCT_HO
values(jul05_product_ho_seq.nextval, '�ڵ�����', '����', 1700, 2);
insert into JUL05_PRODUCT_HO
values(jul05_product_ho_seq.nextval, '��������', '����', 1600, 3);
insert into JUL05_PRODUCT_HO
values(jul05_product_ho_seq.nextval, '����ũ', '����ǰ', 1000, 4);
insert into JUL05_PRODUCT_HO
values(jul05_product_ho_seq.nextval, '��', '����', 500, 1);
insert into JUL05_PRODUCT_HO
values(jul05_product_ho_seq.nextval, '�̰�����', '��', 4000, 1);
insert into JUL05_PRODUCT_HO
values(jul05_product_ho_seq.nextval, '���̽�', '��', 1800, 4);
insert into JUL05_PRODUCT_HO
values(jul05_product_ho_seq.nextval, '���̽�', '��', 1900, 5);
insert into JUL05_PRODUCT_HO
values(jul05_product_ho_seq.nextval, 'ó��ó��', '��', 2000, 6);
insert into JUL05_PRODUCT_HO
values(jul05_product_ho_seq.nextval, 'ġ�佺', '����', 1600, 7);
insert into JUL05_PRODUCT_HO
values(jul05_product_ho_seq.nextval, '����ƽ', '����', 1550, 7);
insert into JUL05_PRODUCT_HO
values(jul05_product_ho_seq.nextval, '��Ĩ', '����', 1750, 6);
insert into JUL05_PRODUCT_HO
values(jul05_product_ho_seq.nextval, '����', '��ǰ', 12000, 5);
insert into JUL05_PRODUCT_HO
values(jul05_product_ho_seq.nextval, '��â', '��ǰ', 7500, 8);
insert into JUL05_PRODUCT_HO
values(jul05_product_ho_seq.nextval, '����', '��ǰ', 13000, 8);
insert into JUL05_PRODUCT_HO
values(jul05_product_ho_seq.nextval, '���ں�', '����', 900, 9);
insert into JUL05_PRODUCT_HO
values(jul05_product_ho_seq.nextval, '�Ϳ청', '����', 500, 10);
insert into JUL05_PRODUCT_HO
values(jul05_product_ho_seq.nextval, '���', '��', 3500, 9);
insert into JUL05_PRODUCT_HO
values(jul05_product_ho_seq.nextval, 'ī��', '��', 2900, 10);
insert into JUL05_PRODUCT_HO
values(jul05_product_ho_seq.nextval, '�׶�', '��', 3000, 5);
insert into JUL05_PRODUCT_HO
values(jul05_product_ho_seq.nextval, '����', '��', 2000, 5);
insert into JUL05_PRODUCT_HO
values(jul05_product_ho_seq.nextval, '��׽�', '��', 3700, 6);
insert into JUL05_PRODUCT_HO
values(jul05_product_ho_seq.nextval, '���̳���', '��', 4000, 7);
insert into JUL05_PRODUCT_HO
values(jul05_product_ho_seq.nextval, 'ĩ��', '����ǰ', 2200, 8);
insert into JUL05_PRODUCT_HO
values(jul05_product_ho_seq.nextval, 'ġ��', '����ǰ', 2300, 7);
insert into JUL05_PRODUCT_HO
values(jul05_product_ho_seq.nextval, '��Ǫ', '����ǰ', 4200, 6);
insert into JUL05_PRODUCT_HO
values(jul05_product_ho_seq.nextval, '����', '����ǰ', 4300, 8);
insert into JUL05_PRODUCT_HO
values(jul05_product_ho_seq.nextval, '��Ƽ��', '����ǰ', 1200, 6);
insert into JUL05_PRODUCT_HO
values(jul05_product_ho_seq.nextval, 'ĩ��', '����ǰ', 1700, 7);
insert into JUL05_PRODUCT_HO
values(jul05_product_ho_seq.nextval, 'ġ��', '����ǰ', 2000, 4);


--cu ��ü ��ǰ���[������, ��ǰ��, ����]
select s_jijum_name, p_name, p_price 
from JUL05_STORE_HO, JUL05_PRODUCT_HO
where s_no = p_s_no and s_name_name = 'CU' or s_no = p_s_no and s_name_name = 'cu';

--����հ�
select avg(p_price) from JUL05_PRODUCT_HO where p_cate = '��';
--���� ��� ��ǰ�Ĵ� ����� ��
select 
--���� � ����� ��ϴ� ����[�����]

--������̸�, ����, �����, ������, ��ǰ��, ����
--����� �̸������ټ� -> ���������->���ݺ�Ѽ�
-- 2~6������

--����Ŀ�� ��հ�
select s_name_name, avg(p_price)
from jul05_store_ho, jul05_product_ho
where s_no = p_s_no
group by s_name_name;
--����Ŀ��/ī�װ��� ��հ�
select s_name_name, p_cate, avg(p_price)
from JUL05_STORE_HO, JUL05_PRODUCT_HO
where s_no = p_s_no
group by s_name_name, p_cate
order by s_name_name, p_cate;

--����Ŀ�� ī�װ��� ��ü ��ǰ��, ����
select s_name_name, p_cate, p_name, p_price
from JUL05_STORE_HO, JUL05_PRODUCT_HO
where s_no = p_s_no
order by s_name_name, p_cate;

-- ����� ��/ī�װ��� �� ����, �ְ�
select o_name, p_cate, 

--����Ŀ��/ī�׺� �� ����, ��հ�
--������ 1000�� �̻��ΰ͸� �������
select s_name_name, p_cate, count(*), avg(p_price)
from jul05_store_ho, jul05_product_ho
where s_no = p_s_no
group by s_name_name, p_cate
having avg(p_price) >= 1000
order by s_name_name, p_cate;

--����Ժ�/����Ŀ�� ��հ�, �ְ�, �ּҰ�
--1000�� �̸��ΰŴ� ���� ���
--��հ��� 1500�� �̻��� �׸� ���ô�
select o_name, s_name_name, avg(p_price), max(p_price), min(p_price)
from JUL05_OWNER_HO, jul05_run_ho, jul05_store_ho, JUL05_PRODUCT_HO
where o_no = r_c_no and s_no = r_s_no and s_no = p_s_no and p_price >= 1000
group by o_name, s_name_name
having avg(p_price) >= 1500
order by o_name, s_name_name;


update JUL05_PRODUCT_HO
set p_price = 5000
where p_name = '�̰�����';

-- CU ��ǰ 10%�� ����
update JUL05_PRODUCT_HO
set p_price = p_price * 0.9
where p_s_no in (
	select s_no
	from jul05_store_ho
	where s_name_name = 'cu' or s_name_name = 'CU'
);


select * from JUL05_PRODUCT_HO;

--�ְ� ��ǰ ����
delete from JUL05_PRODUCT_HO
where p_price = (select max(p_price) from JUL05_PRODUCT_HO);

