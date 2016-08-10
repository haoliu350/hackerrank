-- Query the list of CITY names from STATION that either do not start with vowels or do not end with vowels. Your result cannot contain duplicates.



/*
Enter your query here.
Please append a semicolon ";" at the end of the query and enter your query in a single line to avoid error.
*/
SELECT distinct CITY 
FROM STATION 
WHERE not REGEXP_LIKE(city ,'^(A|E|I|O|U)(\S+|\S+\s+\S+)(a|e|i|o|u)$');