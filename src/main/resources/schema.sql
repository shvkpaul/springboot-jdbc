--post
create table Post (
    id int auto_increment primary key ,
    version int,
    title varchar(255) not null,
    content text not null,
    published_on timestamp not null,
    updated_on timestamp
);