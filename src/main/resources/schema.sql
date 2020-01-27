create table if not exists  product (
  id varchar(255) not null,
  name varchar(255) not null,
  price varchar(255) default null,
  primary key (id)
) engine=innodb ;