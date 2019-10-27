DROP TABLE IF EXISTS t_media_brief;
DROP TABLE IF EXISTS t_ref_practices;
DROP TABLE IF EXISTS t_media_brief_practices;
drop table if exists t_ref_partner;


create table t_ref_partner(
                            id int auto_increment,
                            sys_name varchar(250) not null
);

CREATE TABLE t_ref_practices (
                                    id int  AUTO_INCREMENT,
                                    sys_name VARCHAR(250) NOT NULL
);

CREATE TABLE t_media_brief (
                              id INT AUTO_INCREMENT  PRIMARY KEY,
                              campaign VARCHAR(250) NOT NULL,
                              comment VARCHAR(250) NOT NULL,
                              id_client int DEFAULT NULL
);

CREATE TABLE t_media_brief_practices (
                            id_brief int not null,
                            id_practice int not null
);

insert into t_ref_partner(id, sys_name) values(1, 'Visa');
insert into t_ref_partner(id, sys_name) values(2, 'Electrolux');
insert into t_ref_partner(id, sys_name) values(3, 'Mail.ru');
insert into t_ref_partner(id, sys_name) values(4, 'Visa');
insert into t_ref_partner(id, sys_name) values(5, 'UFO');


insert into t_ref_practices(id, sys_name) values (1, 'Adops');
insert into t_ref_practices(id, sys_name) values (2, 'DAOR');
insert into t_ref_practices(id, sys_name) values (3, 'Programmatic');
insert into t_ref_practices(id, sys_name) values (4, 'Sem');

insert into t_media_brief( id, campaign, comment, id_client) values (1, 'Visa', 'Comment', 5 );
insert into t_media_brief( id, campaign, comment, id_client) values (2, 'Zoomba', 'my comment', 4 );
insert into t_media_brief( id, campaign, comment, id_client) values (3, 'Electrolux', 'Comment', 4 );
insert into t_media_brief( id, campaign, comment, id_client) values (4, 'Mail.ru', 'Comment', 2 );
insert into t_media_brief( id, campaign, comment, id_client) values (5, 'Yandex', 'Comment', 1 );
insert into t_media_brief( id, campaign, comment, id_client) values (6, 'McDonalds', 'Comment', 4 );

insert into t_media_brief_practices(id_brief, id_practice) values (1,4);
insert into t_media_brief_practices(id_brief, id_practice) values (1,3);
insert into t_media_brief_practices(id_brief, id_practice) values (1,2);
insert into t_media_brief_practices(id_brief, id_practice) values (1,1);
