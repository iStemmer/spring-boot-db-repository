DROP TABLE IF EXISTS t_media_brief;

CREATE TABLE t_media_brief (
                              id INT AUTO_INCREMENT  PRIMARY KEY,
                              campaign VARCHAR(250) NOT NULL,
                              comment VARCHAR(250) NOT NULL,
                              id_client int DEFAULT NULL
);

insert into t_media_brief( campaign, comment, id_client) values ('Visa', 'Comment', 5 );
insert into t_media_brief( campaign, comment, id_client) values ('Zoomba', 'my comment', 4 );
insert into t_media_brief( campaign, comment, id_client) values ('Electrolux', 'Comment', 4 );
insert into t_media_brief( campaign, comment, id_client) values ('Mail.ru', 'Comment', 2 );
insert into t_media_brief( campaign, comment, id_client) values ('Yandex', 'Comment', 1 );
insert into t_media_brief( campaign, comment, id_client) values ('McDonalds', 'Comment', 4 );
