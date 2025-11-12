package com.napier.sem.integrationTests;

import com.napier.sem.db.Database;
import com.napier.sem.db.DatabaseInterface;
import com.napier.sem.reports.CityReport;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CityReportTest {

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
    public void testCitiesInWorldLargestToSmallest() {
        CityReport cityReport = new CityReport(db);
        String result = cityReport.citiesInWorldLargestToSmallest();
        assertNotNull(result);
        assertNotEquals("", result);
    }

    @Test
    public void testCitiesInContinentLargestToSmallest() {
        CityReport cityReport = new CityReport(db);
        String result = cityReport.citiesInContinentLargestToSmallest();
        assertNotNull(result);
        assertNotEquals("", result);
    }

    @Test
    public void testCitiesInRegionLargestToSmallest() {
        CityReport cityReport = new CityReport(db);
        String result = cityReport.citiesInRegionLargestToSmallest();
        assertNotNull(result);
        assertNotEquals("", result);
    }

    @Test
    public void testCitiesInCountryLargestToSmallest() {
        CityReport cityReport = new CityReport(db);
        String result = cityReport.citiesInCountryLargestToSmallest();
        assertNotNull(result);
        assertNotEquals("", result);
    }

    @Test
    public void testCitiesInDistrictLargestToSmallest() {
        CityReport cityReport = new CityReport(db);
        String result = cityReport.citiesInDistrictLargestToSmallest();
        assertNotNull(result);
        assertNotEquals("", result);
    }

    @Test
    public void testTopPopulatedCitiesInWorld() {
        CityReport cityReport = new CityReport(db);
        String result = cityReport.topPopulatedCitiesInWorld(10);
        assertNotNull(result);
        assertNotEquals("", result);
    }

    @Test
    public void testTopPopulatedCitiesInContinent() {
        CityReport cityReport = new CityReport(db);
        String result = cityReport.topPopulatedCitiesInContinent(10);
        assertNotNull(result);
        assertNotEquals("", result);
    }

    @Test
    public void testTopPopulatedCitiesInRegion() {
        CityReport cityReport = new CityReport(db);
        String result = cityReport.topPopulatedCitiesInRegion(10);
        assertNotNull(result);
        assertNotEquals("", result);
    }

    @Test
    public void testTopPopulatedCitiesInCountry() {
        CityReport cityReport = new CityReport(db);
        String result = cityReport.topPopulatedCitiesInCountry(10);
        assertNotNull(result);
        assertNotEquals("", result);
    }

    @Test
    public void testTopPopulatedCitiesInDistrict() {
        CityReport cityReport = new CityReport(db);
        String result = cityReport.topPopulatedCitiesInDistrict(10);
        assertNotNull(result);
        assertNotEquals("", result);
    }

}
