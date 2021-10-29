SELECT DISTINCT city
FROM station
WHERE LEFT(CITY, 1) NOT IN ('a', 'e', 'i', 'o', 'u')
    AND RIGHT(CITY, 1) NOT IN ('a', 'e', 'i', 'o', 'u');