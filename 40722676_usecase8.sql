SELECT  cl.Language,
        ROUND (SUM(c.Population * (cl.Percentage / 100.0))) AS speakers,
        ROUND(100.0 * SUM(c.Population * (cl.Percentage / 100.0)) /
              (SELECT SUM(Population)
               FROM country),2) AS pct_of_world
FROM countrylanguage cl
         JOIN country c  ON c.Code = cl.CountryCode
WHERE cl.Language IN ('Chinese','English','Hindi','Spanish','Arabic')
GROUP BY cl.Language
ORDER BY speakers DESC;