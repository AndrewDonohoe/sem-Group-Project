package com.napier.sem.integrationTests;

import com.napier.sem.db.Database;
import com.napier.sem.reports.CapitalCityReport;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CapitalCityReportTest {

    static Database db;

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
