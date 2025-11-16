package com.napier.sem.db;

/**
 * A class which contains a bunch of public variable strings or public functions for each SQL query
 */
public class SqlQueries {

    public static String exampleQuery = "SELECT * FROM city ORDER BY population DESC";

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
