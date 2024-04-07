-- criando base de dados
create database database_name;
-- criando usuario
create user user_name with encrypted password 'user_password';
-- dando permissoes ao usuário
grant all privileges on database user_name to database_name;