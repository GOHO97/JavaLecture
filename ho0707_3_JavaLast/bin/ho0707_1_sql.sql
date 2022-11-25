create table jul07_shop_ho (
	s_name varchar2(20 char) primary key,
	s_call varchar2(13 char) not null
);

create table jul07_menu_ho (
	m_no number(3) primary key,
	m_name varchar2(15 char) not null,
	m_price number(6) not null,
	m_s_name varchar2(20 char) not null
);
create sequence jul07_menu_ho_seq;

select * from jul07_shop_ho;
select * from jul07_menu_ho;

drop table jul07_shop_ho cascade constraint purge;
drop table jul07_menu_ho cascade constraint purge;

select count(*) from JUL07_MENU_HO;

select *
from(
	select rownum as rn, m_name, m_price, m_s_name
	from(
		select m_name, m_price, m_s_name
		from JUL07_MENU_HO 
		order by m_name, m_price
	)
)
where rn >= 10 and rn <= 12;