 create sequence hibernate_sequence start 1 increment 1;

    create table Actor (
       id int8 not null,
        name varchar(255),
        primary key (id)
    );

    create table Address (
       id int8 not null,
        street_and_number varchar(255),
        zip_code_and_city varchar(255),
        primary key (id)
    );

    create table c03_entity (
       id int8 not null,
        name varchar(255),
        primary key (id)
    );

    create table Client (
       id int8 not null,
        client_number varchar(255),
        primary key (id)
    );

    create table Company (
       id int8 not null,
        primary key (id)
    );

    create table customer (
       id int8 not null,
        primary key (id)
    );

    create table customer_analytics (
       id int8 not null,
        created_date date,
        primary key (id)
    );

    create table DemoEntity (
       id int8 not null,
        primary key (id)
    );

    create table DemoEntityWithName (
       id int8 not null,
        name varchar(255),
        primary key (id)
    );

    create table FavouriteColor (
       id int8 not null,
        name varchar(255),
        primary key (id)
    );

    create table G03DemoEntity (
       id int8 not null,
        cardType varchar(255),
        secondCardType int4,
        startDate date,
        primary key (id)
    );

    create table postgres_demo (
       id int8 not null,
        number_of_restarts int8,
        primary key (id)
    );

    create table TransactionScopeCounter (
       id int8 not null,
        count int8 not null,
        primary key (id)
    );
