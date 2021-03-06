SELECT CONCAT(Name, '(', SUBSTR(Occupation,1,1), ')') AS N
FROM OCCUPATIONS
ORDER BY N;

SELECT CONCAT('There are a total of ', COUNT(Occupation), ' ', LOWER(Occupation), 's.')
FROM OCCUPATIONS
GROUP BY Occupation
ORDER BY COUNT(Occupation), Occupation;