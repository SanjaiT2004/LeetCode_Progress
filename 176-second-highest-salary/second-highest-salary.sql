# Write your MySQL query statement below
-- select case 
--     when (select count(distinct id) from Employee ) >1 then salary order by desc limit 1 offset 1
--     else
--     'NONE'
--     as SecondHighestSalary
select (select distinct salary from Employee order by salary desc limit 1 offset 1) as SecondHighestSalary;



    -- SELECT
    -- CASE
    --     WHEN (SELECT COUNT(DISTINCT salary) FROM Employee) > 1 THEN (
    --         SELECT distinct salary
    --         FROM Employee
    --         ORDER BY salary DESC
    --         LIMIT 1 OFFSET 1
    --     )
    --     ELSE 'null'
    -- END AS SecondHighestSalary;
