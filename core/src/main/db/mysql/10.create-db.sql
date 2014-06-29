
    drop table if exists Employee;

    create table Employee (
        id bigint not null auto_increment,
        age integer,
        description TEXT,
        experience TEXT,
        firstName varchar(255),
        lastName varchar(255),
        secondName varchar(255),
        primary key (id)
    );
