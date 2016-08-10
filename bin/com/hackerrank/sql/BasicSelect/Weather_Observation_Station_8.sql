SELECT distinct CITY 
FROM STATION 
WHERE REGEXP_LIKE(city ,'^(A|E|I|O|U)(\S+|\S+\s+\S+)(a|e|i|o|u)$');