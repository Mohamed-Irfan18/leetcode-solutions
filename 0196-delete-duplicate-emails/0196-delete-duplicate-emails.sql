/* Write your T-SQL query statement below */

delete p from person p join person t on p.email = t.email and p.id > t.id