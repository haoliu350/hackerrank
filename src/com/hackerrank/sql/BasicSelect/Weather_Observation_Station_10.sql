/*
Enter your query here.
Please append a semicolon ";" at the end of the query and enter your query in a single line to avoid error.
*/
SELECT distinct CITY 
FROM STATION 
WHERE not REGEXP_LIKE(lower(city) ,'(a|e|i|o|u)$');