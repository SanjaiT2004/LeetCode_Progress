-- select d.name as "Department" , e.name as Employee , max(e.salary) as Salary from employee e join department d on e.departmentId = d.id group by d.id;

select d.name Department, e.name Employee, salary as Salary from 
employee e join department d on d.id = e.departmentId
where salary = (select max(salary) from employee t where t.departmentId = e.departmentId)