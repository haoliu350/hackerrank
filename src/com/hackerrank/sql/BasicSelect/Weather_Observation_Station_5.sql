/*
Enter your query here.
Please append a semicolon ";" at the end of the query and enter your query in a single line to avoid error.
*/
select city, LENGTHB(city)
from(
    select distinct city from station order by LENGTH(city) asc, city asc
) where rownum = 1;

select city, LENGTHB(city)
from(
    select distinct city from station order by LENGTH(city) desc, city asc
) where rownum = 1;