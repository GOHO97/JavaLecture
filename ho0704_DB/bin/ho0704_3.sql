create table jul04_restaurent_ho(
	r_name varchar2(10 char) primary key,
	r_location varchar2(20 char) not null
);

insert into JUL04_RESTAURENT_HO values('��������', '�п� �޵޺�');
insert into JUL04_RESTAURENT_HO values('�������â', '������ ������ ��� �κ�');
insert into JUL04_RESTAURENT_HO values('������', '�������� �� ���� �ִ�');

create table jul04_menu_ho(
	m_no number(2) primary key,
	m_name varchar2(6 char) not null,
	m_price number(5) not null,
	m_r_name varchar2(10 char) not null
);

create sequence jul04_menu_ho_seq;

insert into JUL04_MENU_HO values(jul04_menu_ho_seq.nextval, '��䰥��', 10000, '��������');
insert into JUL04_MENU_HO values(jul04_menu_ho_seq.nextval, '������', 10000, '��������');
insert into JUL04_MENU_HO values(jul04_menu_ho_seq.nextval, '����', 7000, '��������');
insert into JUL04_MENU_HO values(jul04_menu_ho_seq.nextval, '�����', 8000, '��������');
insert into JUL04_MENU_HO values(jul04_menu_ho_seq.nextval, '��뱸��', 12000, '�������â');
insert into JUL04_MENU_HO values(jul04_menu_ho_seq.nextval, '��â����', 11000, '�������â');
insert into JUL04_MENU_HO values(jul04_menu_ho_seq.nextval, '�쵿', 9000, '�������â');
insert into JUL04_MENU_HO values(jul04_menu_ho_seq.nextval, '����', 8000, '�������â');
insert into JUL04_MENU_HO values(jul04_menu_ho_seq.nextval, '����', 30000, '������');
insert into JUL04_MENU_HO values(jul04_menu_ho_seq.nextval, '������', 15000, '������');
insert into JUL04_MENU_HO values(jul04_menu_ho_seq.nextval, '����', 7000, '������');
insert into JUL04_MENU_HO values(jul04_menu_ho_seq.nextval, '����', 8000, '������');

select * from JUL04_RESTAURENT_HO;
select * from JUL04_MENU_HO;

drop table JUL04_RESTAURENT_HO cascade constraint purge;
drop table JUL04_MENU_HO cascade constraint purge;

-- ��ü �Ĵ��, ��ġ
select r_name, r_location from JUL04_RESTAURENT_HO;
--or
select * from JUL04_RESTAURENT_HO;
-- �������� �޴���
select m_name, m_price from JUL04_MENU_HO where m_r_name = '��������';
--�޴� ��հ�[ȸ�� �󸶾� �Ⱦ��]
select avg(m_price) from JUL04_MENU_HO;
--���� ��հ�
select avg(m_price) from JUL04_MENU_HO where m_name = '����';
--��հ� ���� ��� �޴���, ����
select m_name, m_price from JUL04_MENU_HO 
where m_price > (select avg(m_price) from JUL04_MENU_HO);
-- �ְ� �޴���, ���� [������ ȸ�ĺ� �� �������شٸ� �� �Գ�]
select m_name, m_price from JUL04_MENU_HO
where m_price = (select max(m_price) from JUL04_MENU_HO);
-- �ְ� �޴��� ��𰡸� ���� �� �ֳ�
select r_location 
from JUL04_RESTAURENT_HO 
where r_name = (
	select m_r_name 
	from JUL04_MENU_HO 
	where m_price = (
		select max(m_price) 
		from JUL04_MENU_HO)
		);

-- ��պ��� �� �޴��� ��𰡸� ���� �� �ֳ�
select r_location 
from JUL04_RESTAURENT_HO 
where r_name in (
	select m_r_name 
	from JUL04_MENU_HO 
	where m_price < (
		select avg(m_price) 
		from JUL04_MENU_HO)
		);

-- ���� ��𰡸� ���� �� �ֳ�[�����, ��ġ]
select r_name, r_location from JUL04_RESTAURENT_HO
where r_name in (select m_r_name from JUL04_MENU_HO 
where m_name = '����');
--�޵ް�� �޴���[�޴���, ����]
select m_name, m_price from JUL04_MENU_HO
where m_r_name in (select r_name from JUL04_RESTAURENT_HO 
where r_location like '%�޵޺�%');
-- ���� �� �޴��� �Ĵ� �����, ��ġ
select r_name, r_location 
from JUL04_RESTAURENT_HO
where r_name in (
	select m_r_name 
	from JUL04_MENU_HO 
	where m_price = (
	select min(m_price) 
	from JUL04_MENU_HO));

-- ���� �� �޴��� �Ĵ� �����, ��ġ, �޴���, ����

select r_name, r_location, m_name, m_price
from JUL04_RESTAURENT_HO, JUL04_MENU_HO
where r_name = m_r_name 
and m_price = (select min(m_price) from JUL04_MENU_HO);

--����ø��� �޴���, ����, ��ġ
select m_name, m_price, r_location
from JUL04_MENU_HO, JUL04_RESTAURENT_HO
where r_name = m_r_name 
and m_name like '%����%';
--��� ���� ���� �� �ִ� �޴���, ����, �����
select m_name, m_price, r_name
from JUL04_MENU_HO, JUL04_RESTAURENT_HO
where r_name = m_r_name
and r_location like '%���%';

select m_name, m_price, m_r_name
from JUL04_MENU_HO
where m_r_name in (
	select r_name
	from JUL04_RESTAURENT_HO
	where r_location like '%���%'
);



