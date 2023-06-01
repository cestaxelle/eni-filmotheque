-- Reset auto-increment
alter table genre AUTO_INCREMENT = 1;
-- Insérer les genres
insert into genre (id, label) values (1, 'Crime|Drama');
insert into genre (id, label) values (2, 'Drama');
insert into genre (id, label) values (3, 'Action|Crime|Thriller');
insert into genre (id, label) values (4, 'Drama');
insert into genre (id, label) values (5, 'Adventure|Comedy');
insert into genre (id, label) values (6, 'Action|Horror|Sci-Fi');
insert into genre (id, label) values (7, 'Children|Comedy');
insert into genre (id, label) values (8, 'Drama');
insert into genre (id, label) values (9, 'Drama|War');
insert into genre (id, label) values (10, 'Drama');
-- Insérer les participants
alter table participant AUTO_INCREMENT = 1;
insert into participant (id, last_name, first_name) values (1, 'Banasevich', 'Adélaïde');
insert into participant (id, last_name, first_name) values (2, 'Dukelow', 'Amélie');
insert into participant (id, last_name, first_name) values (3, 'Dikle', 'Mélanie');
insert into participant (id, last_name, first_name) values (4, 'Lewknor', 'Noëlla');
insert into participant (id, last_name, first_name) values (5, 'Hulson', 'Anaé');
insert into participant (id, last_name, first_name) values (6, 'Boatwright', 'Nadège');
insert into participant (id, last_name, first_name) values (7, 'Geist', 'Régine');
insert into participant (id, last_name, first_name) values (8, 'O''Hdirscoll', 'Océanne');
insert into participant (id, last_name, first_name) values (9, 'Le feuvre', 'Estève');
insert into participant (id, last_name, first_name) values (10, 'Dadswell', 'Mà');
-- Insérer les membres
alter table member AUTO_INCREMENT = 1;
insert into member (id, last_name, first_name, login, password, is_admin) values (1, 'Faltin', 'Mahélie', 'Méline', 'Xn2BUWq', 1);
insert into member (id, last_name, first_name, login, password, is_admin) values (2, 'Gawthrope', 'Gérald', 'Edmée', 'ePOmiGG3nXD', 0);
insert into member (id, last_name, first_name, login, password, is_admin) values (3, 'Blumson', 'Annotée', 'Intéressant', 'RCXOr0x', 0);
insert into member (id, last_name, first_name, login, password, is_admin) values (4, 'Hoffmann', 'Torbjörn', 'Maëlyss', 'MwF4pYDEtC8E', 1);
insert into member (id, last_name, first_name, login, password, is_admin) values (5, 'Wanklin', 'Intéressant', 'Estée', 'Ji57nF', 1);
-- Insérer les films
alter table movie AUTO_INCREMENT = 1;
insert into movie (id, title, year, duration, synopsis, genre_id, director_id) values (1, 'Undercover Brother', 1941, 150, 'Fluoroscopy of Left Pulmonary Vein using Other Contrast', 7, 2);
insert into movie (id, title, year, duration, synopsis, genre_id, director_id) values (2, 'No Direction Home: Bob Dylan', 1918, 33, 'Transfer Optic Nerve to Optic Nerve, Open Approach', 1, 2);
insert into movie (id, title, year, duration, synopsis, genre_id, director_id) values (3, 'Little Night Music, A', 1915, 198, 'Bypass Left Kidney Pelvis to Right Kidney Pelvis with Autologous Tissue Substitute, Percutaneous Endoscopic Approach', 8, 6);
insert into movie (id, title, year, duration, synopsis, genre_id, director_id) values (4, 'Dog Run', 1989, 115, 'Removal of Radioactive Element from Gastrointestinal Tract, Percutaneous Approach', 2, 2);
insert into movie (id, title, year, duration, synopsis, genre_id, director_id) values (5, 'Big Day, The (We Met on the Vineyard)', 1919, 121, 'Drainage of Right Parotid Gland, Open Approach', 2, 1);
insert into movie (id, title, year, duration, synopsis, genre_id, director_id) values (6, 'Clay Pigeons', 1987, 101, 'Bypass Right External Iliac Artery to Lower Extremity Artery with Autologous Venous Tissue, Percutaneous Endoscopic Approach', 10, 5);
insert into movie (id, title, year, duration, synopsis, genre_id, director_id) values (7, 'At Berkeley', 1975, 66, 'Revision of Monitoring Device in Lower Artery, Percutaneous Approach', 10, 1);
-- Insérer les reviews
alter table opinion AUTO_INCREMENT = 1;
insert into opinion (id, note, comment, author_id, movie_id) values (1, 5, 'Etiam justo. Etiam pretium iaculis justo.', 3, 1);
insert into opinion (id, note, comment, author_id, movie_id) values (2, 2, 'Vestibulum quam sapien, varius ut, blandit non, interdum in, ante. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Duis faucibus accumsan odio. Curabitur convallis.', 2, 1);
insert into opinion (id, note, comment, author_id, movie_id) values (3, 0, 'Mauris sit amet eros. Suspendisse accumsan tortor quis turpis. Sed ante.', 4, 1);
insert into opinion (id, note, comment, author_id, movie_id) values (4, 0, 'Nulla neque libero, convallis eget, eleifend luctus, ultricies eu, nibh. Quisque id justo sit amet sapien dignissim vestibulum.', 5, 1);
insert into opinion (id, note, comment, author_id, movie_id) values (5, 4, 'Nunc purus. Phasellus in felis. Donec semper sapien a libero.', 1, 1);
-- Insérer les valeurs de la table d'association (2 acteurs par film)
insert into movie_actors (actors_id, actor_movies_id) values (10, 1);
insert into movie_actors (actors_id, actor_movies_id) values (9, 2);
insert into movie_actors (actors_id, actor_movies_id) values (6, 3);
insert into movie_actors (actors_id, actor_movies_id) values (3, 4);
insert into movie_actors (actors_id, actor_movies_id) values (1, 5);
insert into movie_actors (actors_id, actor_movies_id) values (1, 6);
insert into movie_actors (actors_id, actor_movies_id) values (1, 7);
insert into movie_actors (actors_id, actor_movies_id) values (4, 1);
insert into movie_actors (actors_id, actor_movies_id) values (5, 2);
insert into movie_actors (actors_id, actor_movies_id) values (3, 3);
insert into movie_actors (actors_id, actor_movies_id) values (1, 4);
insert into movie_actors (actors_id, actor_movies_id) values (8, 5);
insert into movie_actors (actors_id, actor_movies_id) values (10, 6);
insert into movie_actors (actors_id, actor_movies_id) values (7, 7);
