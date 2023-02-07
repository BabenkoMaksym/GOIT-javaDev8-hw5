select id, first_name,last_name, birthday, level, salary from public.worker
where salary = (select max(salary) from public.worker);