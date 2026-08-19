# Write your MySQL query statement below

select c.name as Customers from customers c left join orders t on c.id = t.customerId where t.customerId is NuLL