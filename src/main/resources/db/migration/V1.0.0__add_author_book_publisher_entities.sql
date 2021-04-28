create table if not exists hibernate_sequence (next_val bigint);
insert into hibernate_sequence values (1);

create table if not exists author (
    id bigint not null,
    first_name varchar(255),
    last_name varchar(255),
    primary key (id)
);
create table if not exists book (
    id bigint not null,
    isbn varchar(255),
    title varchar(255),
    publisher_id bigint,
    primary key (id)
);
create table if not exists author_book (
    book_id bigint not null,
    author_id bigint not null,
    primary key (book_id, author_id)
);
create table if not exists publisher (
    id bigint not null,
    address_line varchar(255),
    city varchar(255),
    name varchar(255),
    state varchar(255),
    zip_code varchar(255),
    primary key (id)
);
