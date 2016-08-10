-- Query the list of CITY names from STATION that do not start with vowels and do not end with vowels. Your result cannot contain duplicates.



/*
Enter your query here.
Please append a semicolon ";" at the end of the query and enter your query in a single line to avoid error.
*/
SELECT distinct CITY 
FROM STATION 
WHERE not REGEXP_LIKE(lower(city) ,'^(a|e|i|o|u)')
and not REGEXP_LIKE(lower(city) ,'(a|e|i|o|u)$') ;



