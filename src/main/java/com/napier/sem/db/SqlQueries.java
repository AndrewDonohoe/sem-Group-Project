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
     *
     * @param continent the continent which you want to filter by
     * @return queryString
     */
    public static String countryInContinentLargestToSmallestQuery(String continent) {
        String queryString = "SELECT * FROM country WHERE continent = '" + continent + "' ORDER BY population DESC";
        return queryString;
    }


    /**
     * Tyler's sql query1
     * small function to create a query string to get all the capital cities in the world
     * ordered by largest to smallest
     * filtering through the world
     *
     * @param world what were searching through
     * @return queryString
     */
    public static String allCapitalCitiesInWorldLargestToSmallestQuery(String world) {
        String queryString = "SELECT * FROM capitalCities WHERE world = '" + world + "' ORDER BY population DESC";
        return queryString;
    }


    /**
     * Tyler's sql query2
     * small function to create a query string to get all the capital cities in a specific continent
     * ordered by largest to smallest
     * filtering through continents
     *
     * @param continent what were searching through
     * @return queryString
     */
    public static String capitalCitiesInContinentLargestToSmallestQuery(String continent) {
        String queryString = "SELECT * FROM capitalCities WHERE continent = '" + continent + "' ORDER BY population DESC";
        return queryString;
    }


    /**
     * Tyler's sql query3
     * small function to create a query string to get all the capital cities in a specific region
     * ordered by largest to smallest
     * filtering through continents
     *
     * @param region what were searching through
     * @return queryString
     */
    public static String capitalCitiesInRegionLargestToSmallestQuery(String region) {
        String queryString = "SELECT * FROM capitalCities WHERE region = '" + region + "'ORDER BY population DESC";
        return queryString;
    }


    /**
     * Tyler's sql query4
     * searching for top n populated cities in the world
     * n being inputted by the user
     * ordered from largest to smallest
     *
     * @param n the input from the user
     * @return queryString
     */
    public static String topNPopulatedCapitalCitiesInWorldWhereNIsFromUser(int n) {
        return "SELECT * FROM capitalCities ORDER BY population DESC LIMIT " + n;
    }


    /**
     * Tyler's sql query5
     * searching for top n populated cities in a specific continent
     * n being inputted by the user
     * ordered from largest to smallest
     *
     * @param continent what were searching through
     * @param n the input from the user
     * @return queryString
     */
    public static String topNPopulatedCapitalCitiesInContinentWhereNIsFromUser(String continent, int n) {
        return "SELECT * FROM capitalCities WHERE continent  = '" + continent + "' ORDER BY population DESC LIMIT " + n;
    }


    /**
     * Tyler's sql query5
     * searching for top n populated cities in a specific region
     * n being inputted by the user
     * ordered from largest to smallest
     *
     * @param region what were searching through
     * @param n the input from the user
     * @return queryString
     */
    public static String topNPopulatedCapitalCitiesInRegionWhereNIsFromUser(String region, int n) {
        return "SELECT * FROM capitalCities WHERE region = '" + region + "'ORDER BY population DESC LIMIT " + n;
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
