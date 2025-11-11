package com.napier.sem.integrationTests;

import com.napier.sem.db.Database;
import com.napier.sem.db.DatabaseInterface;
import com.napier.sem.reports.CapitalCityReport;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CapitalCityReportTest {

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
    public void testCapitalCitiesInWorldLargestToSmallest() {
        CapitalCityReport capitalCityReport = new CapitalCityReport(db);
        String result = capitalCityReport.capitalCitiesInWorldLargestToSmallest();
        assertNotNull(result);
        assertNotEquals("", result);
    }

    @Test
    public void testCapitalCitiesInContinentSmallestToLargest() {
        CapitalCityReport capitalCityReport = new CapitalCityReport(db);
        String result = capitalCityReport.capitalCitiesInContinentSmallestToLargest();
        assertNotNull(result);
        assertNotEquals("", result);
    }

    @Test
    public void testCapitalCitiesInRegionSmallestToLargest() {
        CapitalCityReport capitalCityReport = new CapitalCityReport(db);
        String result = capitalCityReport.capitalCitiesInRegionSmallestToLargest();
        assertNotNull(result);
        assertNotEquals("", result);
    }

    @Test
    public void testTopPopulatedCapitalCitiesInWorld() {
        CapitalCityReport capitalCityReport = new CapitalCityReport(db);
        String result = capitalCityReport.topPopulatedCapitalCitiesInWorld(10);
        assertNotNull(result);
        assertNotEquals("", result);
    }

    @Test
    public void testTopPopulatedCapitalCitiesInContinent() {
        CapitalCityReport capitalCityReport = new CapitalCityReport(db);
        String result = capitalCityReport.topPopulatedCapitalCitiesInContinent(10);
        assertNotNull(result);
        assertNotEquals("", result);
    }

    @Test
    public void testTopPopulatedCapitalCitiesInRegion() {
        CapitalCityReport capitalCityReport = new CapitalCityReport(db);
        String result = capitalCityReport.topPopulatedCapitalCitiesInRegion(10);
        assertNotNull(result);
        assertNotEquals("", result);
    }

}
