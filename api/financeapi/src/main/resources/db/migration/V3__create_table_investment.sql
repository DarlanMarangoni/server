alter index expense_pk rename to bank_statement_pk;

CREATE TABLE tb_expense
(
    id           int8         NOT NULL,
    name         varchar(50)  NOT NULL,
    description  varchar(100) NOT NULL,
    due_date     date,
    pay_day      date,
    note         varchar(255),
    created_date timestamp,
    updated_date timestamp,
    constraint expense_pk primary key (id)
);

CREATE TABLE tb_investment
(
    id           int8        NOT NULL,
    code         varchar(6)  NOT NULL,
    amount       int  NOT NULL,
    name         varchar(50) NOT NULL,
    created_date timestamp,
    updated_date timestamp,
    constraint investment_pk primary key (id)
);