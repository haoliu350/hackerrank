SELECT distinct CITY FROM STATION WHERE LOWER(SUBSTR(CITY,1,1)) not in ('a','e','i','o','u');