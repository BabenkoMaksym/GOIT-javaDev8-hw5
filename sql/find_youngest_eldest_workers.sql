select 'ELDEST' AS type,first_name, last_name, birthday from public.worker
where birthday = (select min(birthday) from public.worker)
union
select 'YOUNGEST' AS type,first_name, last_name, birthday from public.worker
where birthday = (select max(birthday) from public.worker)
;