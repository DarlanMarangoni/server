CREATE TABLE tb_user (
    id int8 NOT NULL,
    name varchar(255) NOT NULL,
    age integer NOT NULL,
    cpf varchar(13) NULL,
    constraint user_pk primary key (id)
);

insert into tb_user(id, name, age, cpf) values ('1', 'Darlan', 33, '35919484896');