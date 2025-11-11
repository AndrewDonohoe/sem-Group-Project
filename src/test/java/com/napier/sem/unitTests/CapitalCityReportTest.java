package com.napier.sem.unitTests;

import com.napier.sem.db.Database;
import com.napier.sem.db.DatabaseInterface;
import com.napier.sem.reports.CapitalCityReport;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CapitalCityReportTest {

    static DatabaseInterface db;

    @BeforeAll
    static void init() {
        db = new CapitalCityDatabaseMock();
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

    }

    @Test
    public void testCapitalCitiesInRegionSmallestToLargest() {

    }

    @Test
    public void testTopPopulatedCapitalCitiesInWorld() {

    }
    @Test
    public void testTopPopulatedCapitalCitiesInContinent() {

    }

    @Test
    public void testTopPopulatedCapitalCitiesInRegion() {

    }

}
