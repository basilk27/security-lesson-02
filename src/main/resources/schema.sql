-- users
CREATE TABLE IF NOT EXISTS users(
    id serial primary key,
    username varchar(50),
    password varchar(50)
);

-- authorities
CREATE TABLE IF NOT EXISTS authorities(
    id serial primary key,
    name varchar(45)
);

-- user_authorities
CREATE TABLE IF NOT EXISTS user_authorities(
    userId int not null,
    authId int not null
)