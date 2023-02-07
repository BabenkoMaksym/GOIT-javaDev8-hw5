with proj_time AS (select  id, (date_part('year', justify_days(((select finish_date )::timestamp without time zone) -
        ((select start_date)::timestamp without time zone))) * 12 +
        date_part('month', justify_days(((select finish_date)::timestamp without time zone) -
        ((select start_date)::timestamp without time zone)))) AS month_count
        from public.project where id in (select public.project.id
                                        from public.project)
        ),
        table_1 AS (
select project_id, worker_id, salary, month_count from public.project_worker
join public.worker on worker_id = "public".worker."id"
join proj_time on project_id = proj_time.id)
select project_id, sum(salary * month_count) AS proj_cost from table_1
group by project_id
order by project_id;