SELECT DISTINCT city
FROM station
WHERE CITY RLIKE '^[^aeiouAEIOU]|[^aeiouAEIOU]$'