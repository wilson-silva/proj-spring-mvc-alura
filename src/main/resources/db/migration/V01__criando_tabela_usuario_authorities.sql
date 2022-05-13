create table users(
	username varchar(50) not null primary key,
	password varchar(500) not null,
	enabled boolean not null
);

create table authorities (
	username varchar(50) not null,
	authority varchar(50) not null,
	constraint fk_authorities_users foreign key(username) references users(username)
);
create unique index ix_auth_username on authorities (username,authority);

INSERT INTO users(username, password, enabled) VALUES('joao','$2a$12$Y/LiehSaxBJdPo3lMDfvdeVZMuprPtVAmrv6GHSQDMkw/6IzoCK0K',1);
INSERT INTO users(username, password, enabled) VALUES('maria','$2a$12$O8OOITGfsnSdoo5J5yLdaOk0zPXiH6HpKfjRaU4dLjoOmT6ULJ.cu',1);

INSERT INTO authorities(username, authority) VALUES('joao','ROLE_ADM');
INSERT INTO authorities(username, authority) VALUES('maria','ROLE_USER');