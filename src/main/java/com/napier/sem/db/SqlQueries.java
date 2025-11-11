package com.napier.sem.db;

public class SqlQueries {
    // initialising query strings

    public static String exampleQuery = "SELECT * FROM city ORDER BY population DESC";

    // Queries linked with use-case 1
    public static String countryInWorldLargestToSmallestQuery = "SELECT * FROM country ORDER BY population DESC";
    public static String countryInContinentLargestToSmallestQuery = "SELECT * FROM country WHERE continent = 'Europe' ORDER BY population DESC";

}
