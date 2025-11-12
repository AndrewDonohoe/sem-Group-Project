package com.napier.sem.integrationTests;

import com.napier.sem.db.Database;
import com.napier.sem.db.DatabaseInterface;
import com.napier.sem.reports.CapitalCityReport;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * The CapitalCityReportTest class contains tests for each capitalCityReport
 */
public class CapitalCityReportTest {

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
     * test to test if the capitalCitiesInWorldLargestToSmallest function works
     * we connect to the database, get the result of the function
     * and to test that this world we check if the result is not null
     * and that the result is not an empty string
     */
    @Test
    public void testCapitalCitiesInWorldLargestToSmallest() {
        CapitalCityReport capitalCityReport = new CapitalCityReport(db);
        String result = capitalCityReport.capitalCitiesInWorldLargestToSmallest();
        assertNotNull(result);
        assertNotEquals("", result);
    }

    /**
     * test to test if the capitalCitiesInContinentLargestToSmallest function works
     * we connect to the database, get the result of the function
     * and to test that this world we check if the result is not null
     * and that the result is not an empty string
     */
    @Test
    public void testCapitalCitiesInContinentLargestToSmallest() {
        CapitalCityReport capitalCityReport = new CapitalCityReport(db);
        String result = capitalCityReport.capitalCitiesInContinentLargestToSmallest();
        assertNotNull(result);
        assertNotEquals("", result);
    }

    /**
     * test to test if the capitalCitiesInRegionLargestToSmallest function works
     * we connect to the database, get the result of the function
     * and to test that this world we check if the result is not null
     * and that the result is not an empty string
     */
    @Test
    public void testCapitalCitiesInRegionLargestToSmallest() {
        CapitalCityReport capitalCityReport = new CapitalCityReport(db);
        String result = capitalCityReport.capitalCitiesInRegionLargestToSmallest();
        assertNotNull(result);
        assertNotEquals("", result);
    }

    /**
     * test to test if the topPopulatedCapitalCitiesInWorld function works
     * we connect to the database, get the result of the function passing in 10 as an arbitrary number
     * and to test that this world we check if the result is not null
     * and that the result is not an empty string
     */
    @Test
    public void testTopPopulatedCapitalCitiesInWorld() {
        CapitalCityReport capitalCityReport = new CapitalCityReport(db);
        String result = capitalCityReport.topPopulatedCapitalCitiesInWorld(10);
        assertNotNull(result);
        assertNotEquals("", result);
    }

    /**
     * test to test if the topPopulatedCapitalCitiesInContinent function works
     * we connect to the database, get the result of the function passing in 10 as an arbitrary number
     * and to test that this world we check if the result is not null
     * and that the result is not an empty string
     */
    @Test
    public void testTopPopulatedCapitalCitiesInContinent() {
        CapitalCityReport capitalCityReport = new CapitalCityReport(db);
        String result = capitalCityReport.topPopulatedCapitalCitiesInContinent(10);
        assertNotNull(result);
        assertNotEquals("", result);
    }

    /**
     * test to test if the topPopulatedCapitalCitiesInRegion function works
     * we connect to the database, get the result of the function passing in 10 as an arbitrary number
     * and to test that this world we check if the result is not null
     * and that the result is not an empty string
     */
    @Test
    public void testTopPopulatedCapitalCitiesInRegion() {
        CapitalCityReport capitalCityReport = new CapitalCityReport(db);
        String result = capitalCityReport.topPopulatedCapitalCitiesInRegion(10);
        assertNotNull(result);
        assertNotEquals("", result);
    }

}
