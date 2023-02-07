with proj_client as (
    select public.project.client_id, count(public.project.id) as project_count from public.project
    group by client_id
    order by client_id
),
client_proj as (
select proj_client.client_id, public.client.client_name as name, proj_client.project_count
from proj_client
join public.client ON proj_client.client_id = public.client.id
)
select name, project_count from client_proj
where project_count = (select max(project_count) from client_proj) ;


