# Write your MySQL query statement below

select firstName, lastName, city, state from person e 
left join address d
on d.personId = e.personId;