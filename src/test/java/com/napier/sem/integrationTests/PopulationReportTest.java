package com.napier.sem.integrationTests;

import com.napier.sem.db.Database;
import com.napier.sem.db.DatabaseInterface;
import com.napier.sem.reports.PopulationReport;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class PopulationReportTest {

    static DatabaseInterface db;

    @BeforeAll
    static void init() {
        db = new Database(
                "jdbc:mysql://db:3306/world?useSSL=false&allowPublicKeyRetrieval=true",
                "root",
                "example"
        );
    }

    @Test
    public void testPopulationOfPeopleInAndOutOfCitiesInEachContinent() {
        PopulationReport populationReport = new PopulationReport(db);
        String result = populationReport.populationOfPeopleInAndOutOfCitiesInEachContinent();
        assertNotNull(result);
        assertNotEquals("", result);
    }

    @Test
    public void testPopulationOfPeopleInAndOutOfCitiesInEachRegion() {
        PopulationReport populationReport = new PopulationReport(db);
        String result =  populationReport.populationOfPeopleInAndOutOfCitiesInEachRegion();
        assertNotNull(result);
        assertNotEquals("", result);
    }

    @Test
    public void testPopulationOfPeopleInAndOutOfCitiesInEachCountry() {
        PopulationReport populationReport = new PopulationReport(db);
        String result = populationReport.populationOfPeopleInAndOutOfCitiesInEachCountry();
        assertNotNull(result);
        assertNotEquals("", result);
    }

    @Test
    public void testPopulationOfWorld() {
        PopulationReport populationReport = new PopulationReport(db);
        String result = populationReport.populationOfArea("World");
        assertNotNull(result);
        assertNotEquals("", result);
    }

    @Test
    public void testPopulationOfContinent() {
        PopulationReport populationReport = new PopulationReport(db);
        String result  = populationReport.populationOfArea("Continent");
        assertNotNull(result);
        assertNotEquals("", result);
    }

    @Test
    public void testPopulationOfRegion() {
        PopulationReport populationReport = new PopulationReport(db);
        String result = populationReport.populationOfArea("Region");
        assertNotNull(result);
        assertNotEquals("", result);
    }

    @Test
    public void testPopulationOfCountry() {
        PopulationReport populationReport = new PopulationReport(db);
        String result = populationReport.populationOfArea("Country");
        assertNotNull(result);
        assertNotEquals("", result);
    }

    @Test
    public void testPopulationOfDistrict() {
        PopulationReport populationReport = new PopulationReport(db);
        String result = populationReport.populationOfArea("District");
        assertNotNull(result);
        assertNotEquals("", result);
    }

    @Test
    public void testPopulationOfCity() {
        PopulationReport populationReport = new PopulationReport(db);
        String result = populationReport.populationOfArea("City");
        assertNotNull(result);
        assertNotEquals("", result);
    }

    @Test
    public void testPopulationOfPeopleWhoSpeakDifferentLanguages() {
        PopulationReport populationReport = new PopulationReport(db);
        String result = populationReport.populationOfPeopleWhoSpeakDifferentLanguages();
        assertNotNull(result);
        assertNotEquals("", result);
    }
}
