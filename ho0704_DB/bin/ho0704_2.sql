create table jul04_snack_ho(
	s_no number(2) primary key,
	s_name varchar2(10 char) not null,
	s_price number(5) not null,
	s_weight number(6, 2) not null,
	s_exp date not null
);

create sequence jul04_snack_ho_seq;

insert into jul04_snack_ho
values(jul04_snack_ho_seq.nextval, '��������', 5000, 500.12, sysdate);
insert into jul04_snack_ho
values(jul04_snack_ho_seq.nextval, '���ĸ�', 2000, 350.24, to_date('2022-08-01 13', 'YYYY-MM-DD HH24'));


select * from jul04_snack_ho;

--��ü �����̸��� ���ݸ�
select s_name, s_price from JUL04_SNACK_HO;
-- ��ü �����̸��� �������
select s_name, s_exp as exp_date from JUL04_SNACK_HO;

-- ��ü �����̸�, ����, g�� ����
select s_name, s_price, s_price / s_weight from jul04_snack_ho;

-- ��ü �����̸�, ����, �������, VAT
select s_name, s_price, s_exp as exp_date, s_price * 0.1 as VAT from JUL04_SNACK_HO;
-- ��ü ���� ��հ�
select avg(s_price) from JUL04_SNACK_HO;

-- �ְ�, ������
select max(s_price), min(s_price) from JUL04_SNACK_HO;
-- ���� �� �� ����
select count(s_no) from JUL04_SNACK_HO;
-- g�� ������ ���
select avg(s_price / s_weight)  as avg_price_g from jul04_snack_ho; 

-- ������ 2000�� �̻��� �����̸�, ����
select s_name, s_price from JUL04_SNACK_HO where s_price >= 3000;

-- ������ 3000�� �̸��� �� �� ����
select count(s_no) from JUL04_SNACK_HO where s_price < 3000; 
-- ���������� �̸�, ����, �������
select s_name, s_price, s_exp as exp_date from JUL04_SNACK_HO where s_name = '��������';

--�Ծ ����� ���� ���� ���� �̸�, ����, �������
select s_name, s_price, s_exp from JUL04_SNACK_HO where s_exp >= sysdate;
--���ڽø��� ��հ�
select avg(s_price) from JUL04_SNACK_HO where s_name like '%����%';
-- ~�� �� ����
select count(s_no) from jul04_snack_ho where s_name like '%��%';

insert into JUL04_SNACK_HO
values(JUL04_SNACK_HO_seq.nextval, '�����佺', 300, 10, sysdate);

insert into JUL04_SNACK_HO
values(JUL04_SNACK_HO_seq.nextval, '������', 1300, 110, to_date('20220704 17', 'YYYYMMDD HH24'));

--���� ���� �Ծ�� �ϴ� ���� �̸�, ����, �������
select s_name, s_price, to_char(s_exp, 'MM/DD') from JUL04_SNACK_HO where s_exp <= sysdate;

--���� ������ �״� ���� �̸�, ����, �������
select s_name, s_price, to_char(s_exp, 'MM/DD') from JUL04_SNACK_HO where s_exp <= to_char(sysdate, 'YYYY/MM/DD'), '23:59:59'), 'YYYY/MM/DD HH24:MI:SS'

-- 1000 < ���� < 5000�� ���� �̸�, ����
select s_name, s_price from jul04_snack_ho where s_price > 1000 and s_price < 5000;

-- ~~���̳� �� g�� ������ ���
select avg(s_price / s_weight) from jul04_snack_ho where s_name like '%����' or s_name like'%��';
-- 5000�� �̻��̰ų� 1000�� ���� �� ����
select count(*) from jul04_snack_ho where s_price >= 5000 or s_price <= 1000;
-- �ְ� ���� �̸�, ����
select s_name, s_price from jul04_snack_ho 
where s_price = (select max(s_price) from jul04_snack_ho);

--��պ��� �� ���� �̸�, ����
select s_name, s_price from jul04_snack_ho 
where s_price < (select avg(s_price) from jul04_snack_ho);
--��պ��� ��� ���ڴ� �� ��
select count(s_no)from jul04_snack_ho 
where s_price > (select avg(s_price) from jul04_snack_ho);
-- �����κ��� ��� ���� �̸�, ����
select s_name, s_price from jul04_snack_ho 
where s_price > (select s_price from jul04_snack_ho where s_name = '������');


