package com.napier.sem.integrationTests;

import com.napier.sem.db.Database;
import com.napier.sem.db.DatabaseInterface;
import com.napier.sem.reports.CityReport;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * The CityReportTest class contains tests for each cityReport
 */
public class CityReportTest {

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
     * test to test if the citiesInWorldLargestToSmallest function works
     * we connect to the database, get the result of the function
     * and to test that this world we check if the result is not null
     * and that the result is not an empty string
     */
    @Test
    public void testCitiesInWorldLargestToSmallest() {
        CityReport cityReport = new CityReport(db);
        String result = cityReport.citiesInWorldLargestToSmallest();
        assertNotNull(result);
        assertNotEquals("", result);
    }

    /**
     * test to test if the citiesInContinentLargestToSmallest function works
     * we connect to the database, get the result of the function
     * and to test that this world we check if the result is not null
     * and that the result is not an empty string
     */
    @Test
    public void testCitiesInContinentLargestToSmallest() {
        CityReport cityReport = new CityReport(db);
        String result = cityReport.citiesInContinentLargestToSmallest();
        assertNotNull(result);
        assertNotEquals("", result);
    }

    /**
     * test to test if the citiesInRegionLargestToSmallest function works
     * we connect to the database, get the result of the function
     * and to test that this world we check if the result is not null
     * and that the result is not an empty string
     */
    @Test
    public void testCitiesInRegionLargestToSmallest() {
        CityReport cityReport = new CityReport(db);
        String result = cityReport.citiesInRegionLargestToSmallest();
        assertNotNull(result);
        assertNotEquals("", result);
    }

    /**
     * test to test if the citiesInCountryLargestToSmallest function works
     * we connect to the database, get the result of the function
     * and to test that this world we check if the result is not null
     * and that the result is not an empty string
     */
    @Test
    public void testCitiesInCountryLargestToSmallest() {
        CityReport cityReport = new CityReport(db);
        String result = cityReport.citiesInCountryLargestToSmallest();
        assertNotNull(result);
        assertNotEquals("", result);
    }

    /**
     * test to test if the citiesInDistrictLargestToSmallest function works
     * we connect to the database, get the result of the function
     * and to test that this world we check if the result is not null
     * and that the result is not an empty string
     */
    @Test
    public void testCitiesInDistrictLargestToSmallest() {
        CityReport cityReport = new CityReport(db);
        String result = cityReport.citiesInDistrictLargestToSmallest();
        assertNotNull(result);
        assertNotEquals("", result);
    }

    /**
     * test to test if the topPopulatedCitiesInWorld function works
     * we connect to the database, get the result of the function passing in 10 as an arbitrary number
     * and to test that this world we check if the result is not null
     * and that the result is not an empty string
     */
    @Test
    public void testTopPopulatedCitiesInWorld() {
        CityReport cityReport = new CityReport(db);
        String result = cityReport.topPopulatedCitiesInWorld(10);
        assertNotNull(result);
        assertNotEquals("", result);
    }

    /**
     * test to test if the topPopulatedCitiesInContinent function works
     * we connect to the database, get the result of the function passing in 10 as an arbitrary number
     * and to test that this world we check if the result is not null
     * and that the result is not an empty string
     */
    @Test
    public void testTopPopulatedCitiesInContinent() {
        CityReport cityReport = new CityReport(db);
        String result = cityReport.topPopulatedCitiesInContinent(10);
        assertNotNull(result);
        assertNotEquals("", result);
    }

    /**
     * test to test if the topPopulatedCitiesInRegion function works
     * we connect to the database, get the result of the function passing in 10 as an arbitrary number
     * and to test that this world we check if the result is not null
     * and that the result is not an empty string
     */
    @Test
    public void testTopPopulatedCitiesInRegion() {
        CityReport cityReport = new CityReport(db);
        String result = cityReport.topPopulatedCitiesInRegion(10);
        assertNotNull(result);
        assertNotEquals("", result);
    }

    /**
     * test to test if the topPopulatedCitiesInCountry function works
     * we connect to the database, get the result of the function passing in 10 as an arbitrary number
     * and to test that this world we check if the result is not null
     * and that the result is not an empty string
     */
    @Test
    public void testTopPopulatedCitiesInCountry() {
        CityReport cityReport = new CityReport(db);
        String result = cityReport.topPopulatedCitiesInCountry(10);
        assertNotNull(result);
        assertNotEquals("", result);
    }

    /**
     * test to test if the topPopulatedCitiesInCountry function works
     * we connect to the database, get the result of the function passing in 10 as an arbitrary number
     * and to test that this world we check if the result is not null
     * and that the result is not an empty string
     */
    @Test
    public void testTopPopulatedCitiesInDistrict() {
        CityReport cityReport = new CityReport(db);
        String result = cityReport.topPopulatedCitiesInDistrict(10);
        assertNotNull(result);
        assertNotEquals("", result);
    }

}
