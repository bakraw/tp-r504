create database demosql;
use demosql;
create table myTable(id int auto_increment, name varchar(45) not null, primary key (id));
insert into myTable (id, name) values (null, 'bob');
insert into myTable (id, name) values (null, 'alice');
insert into myTable (id, name) values (null, 'john');

