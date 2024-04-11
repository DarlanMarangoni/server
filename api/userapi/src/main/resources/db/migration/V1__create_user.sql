CREATE TABLE tb_user (
    id int8 NOT NULL,
    name varchar(255) NOT NULL,
    age integer NOT NULL,
    constraint user_pk primary key (id)
);

insert into tb_user(id, name, age) values ('1', 'Darlan', 33);