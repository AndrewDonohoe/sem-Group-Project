package com.napier.sem.db;

/**
 * A class which contains a bunch of public variable strings or public functions for each SQL query
 */
public class SqlQueries {

    public static String exampleQuery = "SELECT * FROM city ORDER BY population DESC";

    /*
    Selecting
    Show results grouped by continent
    Total population of all countries in the continent
    Total population living in cities (use 0 if a country has no cities)
    Total population living outside cities
    Using LEFT JOIN to SUM the population of all cities within each country
    from city as ci
    Match each country to its total city population
    GROUP BY, aggregate results per continent
    ORDER BY, show continents with highest population first
     */
    public static String populationOfPeoplePeopleLivingInCitiesAndPeopleNotLivingInCitiesInEachContinent = """
    SELECT
    c.Continent,
    SUM(c.Population) AS total_population,
    SUM(COALESCE(city_pop.sum_city_pop, 0)) AS population_in_cities,
    SUM(c.Population) - SUM(COALESCE(city_pop.sum_city_pop, 0)) AS population_not_in_cities
    FROM country AS c
    LEFT JOIN (
            SELECT ci.CountryCode,
            SUM(ci.Population) AS sum_city_pop
    FROM city AS ci
    GROUP BY ci.CountryCode) AS city_pop
    ON city_pop.CountryCode = c.Code
    GROUP BY c.Continent
    ORDER BY total_population DESC;
    """;

    /*
    Selecting
    Show results grouped by region
    Total population of all countries in the region
    Total population living in cities (use 0 if a country has no cities)
    Total population living outside cities
    Using LEFT JOIN to find the total population of all cities within each country
    GROUP BY, one row per country with its total city population
    Matching country to its summed city population
    GROUP BY, aggregate results for each region
    ORDER BY, shows regions with highest population first
     */

    public static String populationOfPeoplePeopleLivingInCitiesAndPeopleNotLivingInCitiesInEachRegion = """
    SELECT
    c.Region,
    SUM(c.Population) AS total_population,
    SUM(COALESCE(city_pop.sum_city_pop,0)) AS population_in_cities,
    SUM(c.Population) - SUM(COALESCE(city_pop.sum_city_pop, 0)) AS population_not_in_cities
    FROM country AS c
    LEFT JOIN(
            SELECT
                    ci.CountryCode, SUM(ci.Population) AS sum_city_pop
    FROM city AS ci
    GROUP BY ci.CountryCode
) AS city_pop
    ON city_pop.CountryCode = c.Code
    GROUP BY c.Region
    ORDER BY total_population DESC;
    """;

    /*
    Selecting
    Country code (primary key of the country table)
    Country name
    Continent the country belongs to
    Region within the continent
    Total population of the country
    Total people living in all cities of the country (0 if no cities recorded)
    People who live outside cities
    Using LEFT JOIN to find the sum of population of all cities per country
    GROUP BY, one row per country with its total city population
    Link each country to its city population total
    ORDER BY, shows the biggest countries at the top
     */


    public static String populationOfPeoplePeopleLivingInCitiesAndPeopleNotLivingInCitiesInEachCountry = """
    SELECT c.Code,
    c.Name AS country,
    c.Continent,
    c.Region,
    c.Population AS total_population,
    COALESCE(city_pop.sum_city_pop,0) AS population_in_cities,
    c.Population - COALESCE(city_pop.sum_city_pop, 0) AS population_not_in_cities
    FROM country AS c
    LEFT JOIN(
            SELECT ci.CountryCode, SUM(ci.Population) AS sum_city_pop
    FROM city AS ci
    GROUP BY ci.CountryCode
) AS city_pop
    ON city_pop.CountryCode = c.Code
    ORDER BY total_population DESC;
    """;

    /*
    Selecting
    The language we are analysing
    Estimated number of speakers for that language
    and the country population × % of population speaking the language
    Percentage of the world's total population that speaks this language (2 decimals)
    Using JOIN to match each language entry with its country population
    Only analyse these five major global languages
    GROUP BY, aggregate totals per language
    ORDER BY, show the most widely spoken languages first
     */

    public static String populationOfPeopleWhoSpeakDifferentLanguagesQuery = """
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
    """;




    // ----------------------------------------
    // Queries linked with use-case 1
    // ----------------------------------------
    public static String countryInWorldLargestToSmallestQuery = "SELECT * FROM country ORDER BY population DESC";

    /**
     * small function to create a query string to get all the countries in a specific continent
     * ordered by largest to smallest population
     * with the continent to filter by being inputted
     * @param continent the continent which you want to filter by
     * @return queryString
     */
    public static String countryInContinentLargestToSmallestQuery(String continent){
         String queryString = "SELECT * FROM country WHERE continent = '" + continent + "' ORDER BY population DESC";
         return queryString;
    }

    public static String countryInRegionLargestToSmallestQuery(String region){
        String queryString = "SELECT * FROM country WHERE region = '" + region + "' ORDER BY population DESC";
        return queryString;
    }

    // ----------------------------------------
    // Queries linked with use-case 2
    // ----------------------------------------
    public static String topPopulatedCountriesInWorldQuery(int n) {
        String queryString = "SELECT * FROM country ORDER BY population DESC LIMIT " + n;
        return queryString;
    }

    public static String topPopulatedCountriesInContinentQuery(String continent, int n) {
        String queryString = "SELECT * FROM country WHERE continent = '" +  continent + "' ORDER BY population DESC LIMIT " + n;
        return queryString;
    }

    public static String topPopulatedCountriesInRegionQuery(String region, int n) {
        String queryString = "SELECT * FROM country WHERE region = '" + region + "' ORDER BY population DESC LIMIT " + n;
        return queryString;
    }
}
