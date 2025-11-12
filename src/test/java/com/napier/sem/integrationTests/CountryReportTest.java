package com.napier.sem.integrationTests;

import com.napier.sem.db.Database;
import com.napier.sem.db.DatabaseInterface;
import com.napier.sem.reports.CountryReport;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * The CountryReportTest class contains tests for each countryReport
 */
public class CountryReportTest {

    // This is the database connection, but it's stored as an interface
    // That means we can pass in either the real database or a mock one for testing
    static DatabaseInterface db;

    /**
     * before all the other tests happen this will run
     * Initialises the database connection
     */
    @BeforeAll
    static void init() {
        db = new Database(
                "jdbc:mysql://db:3306/world?useSSL=false&allowPublicKeyRetrieval=true",
                "root",
                "example"
        );
    }

    /**
     * test to test if the countriesInWorldLargestToSmallest function works
     * we connect to the database, get the result of the function
     * and to test that this world we check if the result is not null
     * and that the result is not an empty string
     */
    @Test
    public void testCountriesInWorldLargestToSmallest() {
        CountryReport countryReport = new CountryReport(db);
        String result = countryReport.countriesInWorldLargestToSmallest();
        assertNotNull(result);
        assertNotEquals("", result);
    }

    /**
     * test to test if the countriesInContinentLargestToSmallest function works
     * we connect to the database, get the result of the function passing in South America as an example
     * and to test that this world we check if the result is not null
     * and that the result is not an empty string
     */
    @Test
    public void testCountriesInContinentLargestToSmallest() {
        CountryReport countryReport = new CountryReport(db);
        String result = countryReport.countriesInContinentLargestToSmallest("South America");
        assertNotNull(result);
        assertNotEquals("", result);
    }

    /**
     * test to test if the countriesInRegionLargestToSmallest function works
     * we connect to the database, get the result of the function
     * and to test that this world we check if the result is not null
     * and that the result is not an empty string
     */
    @Test
    public void testCountriesInRegionLargestToSmallest() {
        CountryReport countryReport = new CountryReport(db);
        String result = countryReport.countriesInRegionLargestToSmallest();
        assertNotNull(result);
        assertNotEquals("", result);
    }

    /**
     * test to test if the topPopulatedCountriesInWorld function works
     * we connect to the database, get the result of the function passing in 10 as an arbitrary number
     * and to test that this world we check if the result is not null
     * and that the result is not an empty string
     */
    @Test
    public void testTopPopulatedCountriesInWorld() {
        CountryReport countryReport = new CountryReport(db);
        String result = countryReport.topPopulatedCountriesInWorld(10);
        assertNotNull(result);
        assertNotEquals("", result);
    }

    /**
     * test to test if the topPopulatedCountriesInContinent function works
     * we connect to the database, get the result of the function passing in 10 as an arbitrary number
     * and to test that this world we check if the result is not null
     * and that the result is not an empty string
     */
    @Test
    public void testTopPopulatedCountriesInContinent() {
        CountryReport countryReport = new CountryReport(db);
        String result = countryReport.topPopulatedCountriesInContinent(10);
        assertNotNull(result);
        assertNotEquals("", result);
    }

    /**
     * test to test if the topPopulatedCountriesInRegion function works
     * we connect to the database, get the result of the function passing in 10 as an arbitrary number
     * and to test that this world we check if the result is not null
     * and that the result is not an empty string
     */
    @Test
    public void testTopPopulatedCountriesInRegion() {
        CountryReport countryReport = new CountryReport(db);
        String result = countryReport.topPopulatedCountriesInRegion(10);
        assertNotNull(result);
        assertNotEquals("", result);
    }
}
