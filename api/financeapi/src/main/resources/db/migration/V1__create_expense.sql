CREATE TABLE tb_category
(
    id           int8         NOT NULL,
    name         varchar(50) NOT NULL,
    created_date timestamp,
    updated_date timestamp,
    constraint category_pk primary key (id)
);

CREATE TABLE tb_expense
(
    id           int8         NOT NULL,
    name         varchar(100) NOT NULL,
    description  varchar(255)      NOT NULL,
    value double precision NOT NULL,
    category int8 not null,
    created_date timestamp,
    updated_date timestamp,
    constraint expense_pk primary key (id),
    constraint category_fk foreign key (category) references tb_category
);

INSERT INTO TB_CATEGORY (id, name, created_date, updated_date) VALUES (1, 'Alimentação', now(), now());
INSERT INTO TB_CATEGORY (id, name, created_date, updated_date) VALUES (2, 'Benefícios', now(), now());
INSERT INTO TB_CATEGORY (id, name, created_date, updated_date) VALUES (3, 'Bônus e PLR', now(), now());
INSERT INTO TB_CATEGORY (id, name, created_date, updated_date) VALUES (4, 'Alimentação', now(), now());
INSERT INTO TB_CATEGORY (id, name, created_date, updated_date) VALUES (5, 'Casa', now(), now());
INSERT INTO TB_CATEGORY (id, name, created_date, updated_date) VALUES (6, 'Compras', now(), now());
INSERT INTO TB_CATEGORY (id, name, created_date, updated_date) VALUES (7, 'Contas', now(), now());
INSERT INTO TB_CATEGORY (id, name, created_date, updated_date) VALUES (8, 'Crédito e Financiamento', now(), now());
INSERT INTO TB_CATEGORY (id, name, created_date, updated_date) VALUES (9, 'Cuidados Pessoais', now(), now());
INSERT INTO TB_CATEGORY (id, name, created_date, updated_date) VALUES (10, 'Doações', now(), now());
INSERT INTO TB_CATEGORY (id, name, created_date, updated_date) VALUES (11, 'Educação', now(), now());
INSERT INTO TB_CATEGORY (id, name, created_date, updated_date) VALUES (12, 'Impostos e Tributos', now(), now());
INSERT INTO TB_CATEGORY (id, name, created_date, updated_date) VALUES (13, 'Investimentos', now(), now());
INSERT INTO TB_CATEGORY (id, name, created_date, updated_date) VALUES (14, 'Lazer e Entretenimento', now(), now());
INSERT INTO TB_CATEGORY (id, name, created_date, updated_date) VALUES (15, 'Outra Categoria', now(), now());
INSERT INTO TB_CATEGORY (id, name, created_date, updated_date) VALUES (16, 'Pets', now(), now());
INSERT INTO TB_CATEGORY (id, name, created_date, updated_date) VALUES (17, 'Receita de Aluguel', now(), now());
INSERT INTO TB_CATEGORY (id, name, created_date, updated_date) VALUES (18, 'Reembolso', now(), now());
INSERT INTO TB_CATEGORY (id, name, created_date, updated_date) VALUES (19, 'Salário', now(), now());
INSERT INTO TB_CATEGORY (id, name, created_date, updated_date) VALUES (20, 'Saque', now(), now());
INSERT INTO TB_CATEGORY (id, name, created_date, updated_date) VALUES (21, 'Seguro', now(), now());
INSERT INTO TB_CATEGORY (id, name, created_date, updated_date) VALUES (22, 'Supermercado', now(), now());
INSERT INTO TB_CATEGORY (id, name, created_date, updated_date) VALUES (23, 'Tarifas', now(), now());
INSERT INTO TB_CATEGORY (id, name, created_date, updated_date) VALUES (24, 'Transferência', now(), now());
INSERT INTO TB_CATEGORY (id, name, created_date, updated_date) VALUES (25, 'Transporte', now(), now());
INSERT INTO TB_CATEGORY (id, name, created_date, updated_date) VALUES (26, 'Viagem', now(), now());