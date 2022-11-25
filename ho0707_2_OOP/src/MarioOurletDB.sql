select * from JUL06_PRODUCT_HO;
select * from JUL06_SHOP_HO;
select * from JUL06_Location_HO;

select l_hall, l_floor, s_name 
from jul06_location_ho, jul06_shop_ho
where l_no = s_locationNum
order by l_hall, l_floor
