# Write your MySQL query statement below

select class as class from courses
group by class
having count(*) >= 5