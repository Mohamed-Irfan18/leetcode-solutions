# Write your MySQL query statement below

select max(Salary) as SecondHighestSalary from Employee where salary < (Select max(Salary) from employee)