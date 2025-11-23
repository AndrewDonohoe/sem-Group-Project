-- WORLD POPULATION
SELECT SUM(country.Population)
FROM country;

-- CONTINENT POPULATION
SELECT SUM(country.Population)
FROM country
WHERE Continent = 'South America';

-- REGION POPULATION
SELECT SUM(country.Population)
FROM country
WHERE Region = 'Middle East';

-- COUNTRY POPULATION
SELECT SUM(country.Population)
FROM country
WHERE Name = 'South Africa';

-- DISTRICT POPULATION
SELECT SUM(country.Population)
FROM country
JOIN world.city c on country.Code = c.CountryCode
WHERE District = 'Midlands';

-- CITY POPULATION
SELECT SUM(country.Population)
FROM country
JOIN world.city c on country.Code = c.CountryCode
WHERE c.Name = 'Edinburgh';