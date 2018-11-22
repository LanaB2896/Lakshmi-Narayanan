create table cart(
item_id char(5),
product_name char(25),
product_description char(50),
price number(10,2)
);

drop table cart;
select * from cart;
select max(item_id) from cart;