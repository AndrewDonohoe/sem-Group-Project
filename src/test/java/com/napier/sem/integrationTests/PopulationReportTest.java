package com.napier.sem.integrationTests;

import com.napier.sem.db.Database;
import com.napier.sem.db.DatabaseInterface;
import com.napier.sem.reports.PopulationReport;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * The PopulationReportTest class contains tests for each populationReport
 */
public class PopulationReportTest {

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
     * test to test if the populationOfPeopleInAndOutOfCitiesInEachContinent function works
     * we connect to the database, get the result of the function
     * and to test that this world we check if the result is not null
     * and that the result is not an empty string
     */
    @Test
    public void testPopulationOfPeopleInAndOutOfCitiesInEachContinent() {
        PopulationReport populationReport = new PopulationReport(db);
        String result = populationReport.populationOfPeopleInAndOutOfCitiesInEachContinent();
        assertNotNull(result);
        assertNotEquals("", result);
    }

    /**
     * test to test if the populationOfPeopleInAndOutOfCitiesInEachRegion function works
     * we connect to the database, get the result of the function
     * and to test that this world we check if the result is not null
     * and that the result is not an empty string
     */
    @Test
    public void testPopulationOfPeopleInAndOutOfCitiesInEachRegion() {
        PopulationReport populationReport = new PopulationReport(db);
        String result =  populationReport.populationOfPeopleInAndOutOfCitiesInEachRegion();
        assertNotNull(result);
        assertNotEquals("", result);
    }

    /**
     * test to test if the populationOfPeopleInAndOutOfCitiesInEachCountry function works
     * we connect to the database, get the result of the function
     * and to test that this world we check if the result is not null
     * and that the result is not an empty string
     */
    @Test
    public void testPopulationOfPeopleInAndOutOfCitiesInEachCountry() {
        PopulationReport populationReport = new PopulationReport(db);
        String result = populationReport.populationOfPeopleInAndOutOfCitiesInEachCountry();
        assertNotNull(result);
        assertNotEquals("", result);
    }

    /**
     * test to test if the populationOfArea function works
     * we connect to the database, get the result of the function passing in World
     * and to test that this world we check if the result is not null
     * and that the result is not an empty string
     */
    @Test
    public void testPopulationOfWorld() {
        PopulationReport populationReport = new PopulationReport(db);
        String result = populationReport.populationOfArea("World");
        assertNotNull(result);
        assertNotEquals("", result);
    }

    /**
     * test to further test if the populationOfArea function works
     * we connect to the database, get the result of the function passing in Continent
     * and to test that this world we check if the result is not null
     * and that the result is not an empty string
     */
    @Test
    public void testPopulationOfContinent() {
        PopulationReport populationReport = new PopulationReport(db);
        String result  = populationReport.populationOfArea("Continent");
        assertNotNull(result);
        assertNotEquals("", result);
    }

    /**
     * test to further test if the populationOfArea function works
     * we connect to the database, get the result of the function passing in Region
     * and to test that this world we check if the result is not null
     * and that the result is not an empty string
     */
    @Test
    public void testPopulationOfRegion() {
        PopulationReport populationReport = new PopulationReport(db);
        String result = populationReport.populationOfArea("Region");
        assertNotNull(result);
        assertNotEquals("", result);
    }

    /**
     * test to further test if the populationOfArea function works
     * we connect to the database, get the result of the function passing in Country
     * and to test that this world we check if the result is not null
     * and that the result is not an empty string
     */
    @Test
    public void testPopulationOfCountry() {
        PopulationReport populationReport = new PopulationReport(db);
        String result = populationReport.populationOfArea("Country");
        assertNotNull(result);
        assertNotEquals("", result);
    }

    /**
     * test to further test if the populationOfArea function works
     * we connect to the database, get the result of the function passing in District
     * and to test that this world we check if the result is not null
     * and that the result is not an empty string
     */
    @Test
    public void testPopulationOfDistrict() {
        PopulationReport populationReport = new PopulationReport(db);
        String result = populationReport.populationOfArea("District");
        assertNotNull(result);
        assertNotEquals("", result);
    }

    /**
     * test to further test if the populationOfArea function works
     * we connect to the database, get the result of the function passing in City
     * and to test that this world we check if the result is not null
     * and that the result is not an empty string
     */
    @Test
    public void testPopulationOfCity() {
        PopulationReport populationReport = new PopulationReport(db);
        String result = populationReport.populationOfArea("City");
        assertNotNull(result);
        assertNotEquals("", result);
    }

    /**
     * test to test if the populationOfPeopleWhoSpeakDifferentLanguages function works
     * we connect to the database, get the result of the function
     * and to test that this world we check if the result is not null
     * and that the result is not an empty string
     */
    @Test
    public void testPopulationOfPeopleWhoSpeakDifferentLanguages() {
        PopulationReport populationReport = new PopulationReport(db);
        String result = populationReport.populationOfPeopleWhoSpeakDifferentLanguages();
        assertNotNull(result);
        assertNotEquals("", result);
    }
}
