select  id, (date_part('year', justify_days(((select finish_date )::timestamp without time zone) -
        ((select start_date)::timestamp without time zone))) * 12 +
        date_part('month', justify_days(((select finish_date)::timestamp without time zone) -
        ((select start_date)::timestamp without time zone)))) AS month_count
        from public.project where id in (select public.project.id
                                        from public.project);