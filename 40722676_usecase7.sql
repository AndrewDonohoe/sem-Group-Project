SELECT ci.CountryCode,
       SUM(ci.Population) AS sum_city_pop
FROM city AS ci
GROUP BY ci.CountryCode;

