INSERT INTO public.worker (first_name, last_name, birthday, level, salary) VALUES ('Maksym', 'Babenko', '1993-12-14', 'Junior', 700);
INSERT INTO public.worker (first_name, last_name, birthday, level, salary) VALUES ('Ilon', '"Mask"', '1970-11-05', 'Senior', 70000);
INSERT INTO public.worker (first_name, last_name, birthday, level, salary) VALUES ('Mark', 'Ivanov', '1985-03-29', 'Middle', 2350);
INSERT INTO public.worker (first_name, last_name, birthday, level, salary) VALUES ('Victor', 'Pupkin', '1990-09-03', 'Trainee', 500);
INSERT INTO public.worker (first_name, last_name, birthday, level, salary) VALUES ('Valera', 'Ostapchuk', '1987-11-23', 'Middle', 3000);
INSERT INTO public.worker (first_name, last_name, birthday, level, salary) VALUES ('Anna', 'Tokareva', '1991-02-23', 'Senior', 5200);
INSERT INTO public.worker (first_name, last_name, birthday, level, salary) VALUES ('Mary', 'Boyko', '1998-07-18', 'Junior', 800);

INSERT into public.client (client_name) values ('Petro Rocket');
INSERT into public.client (client_name) values ('Petro Bumper');
INSERT into public.client (client_name) values ('Valeriy Repin');
INSERT into public.client (client_name) values ('Olga Komarova');
INSERT into public.client (client_name) values ('Anna Milevskaya');

insert into public.project (client_id, start_date, finish_date) values 
(1, '2020-02-01', '2021-02-01'),
(2, '2020-02-01', '2022-04-01'),
(2, '2020-02-01', '2025-03-01'),
(2, '2020-02-01', '2023-11-01'),
(3, '2020-02-01', '2022-12-01'),
(4, '2020-02-01', '2024-07-01'),
(5, '2020-02-01', '2022-08-01'),
(3, '2020-02-01', '2021-10-01'),
(1, '2020-02-01', '2024-11-01'),
(1, '2020-02-01', '2026-07-01');

insert into public.project_worker (project_id, worker_id) values 
(1, 1),
(1, 2),
(1, 4),
(1, 5),
(1, 7),
(2, 6),
(2, 3),
(2, 2),
(2, 1),
(3, 1),
(3, 2),
(3, 3),
(3, 4),
(3, 5),
(4, 1),
(4, 3),
(4, 5),
(4, 7),
(5, 5),
(5, 1),
(5, 6),
(5, 7),
(6, 1),
(7, 4),
(7, 2),
(8, 2),
(8, 1),
(8, 6),
(8, 4),
(9, 5),
(9, 1),
(9, 3),
(9, 7),
(9, 2),
(9, 2),
(10, 7);



