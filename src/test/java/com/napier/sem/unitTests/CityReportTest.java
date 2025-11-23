package com.napier.sem.unitTests;

import com.napier.sem.models.City;
import com.napier.sem.reports.CityReport;
import org.junit.jupiter.api.Test;

public class CityReportTest {
    @Test
    public void testCitiesInWorldLargestToSmallest() {
        CityReport cityReport = new CityReport(db);
        String result = cityReport.citiesInWorldLargestToSmallest();
        assertNotNull(result);
        assertNotEquals("", result);
    }

    @Test
    public void testCitiesInContinentLargestToSmallest() {
        CityReport = cityReport = new CityReport(db);
        String result = cityReport.citiesInContinentLargestToSmallest();
        assertNotNull(result);
        assertNotEquals("", result);
    }

    @Test
    public void testCitiesInRegionLargestToSmallest() {
        {
            CityReport = cityReport = new CityReport(db);
            String result = cityReport.citiesInRegionLargestToSmallest();
            assertNotNull(result);
            assertNotEquals("", result);
        }
    }

    @Test
    public void testCitiesInCountryLargestToSmallest() {
        {
            CityReport = cityReport = new CityReport(db);
            String result = cityReport.citiesInCountryLargestToSmallest();
            assertNotNull(result);
            assertNotEquals("", result);
        }
    }

    @Test
    public void testCitiesInDistrictLargestToSmallest() {
        {
            CityReport = cityReport = new CityReport(db);
            String result = cityReport.citiesInDistrictLargestToSmallest();
            assertNotNull(result);
            assertNotEquals("", result);
        }
    }

    @Test
    public void testTopPopulatedCitiesInWorld() {
    }

    @Test
    public void testTopPopulatedCitiesInContinent() {

    }

    @Test
    public void testTopPopulatedCitiesInRegion() {
    }

    @Test
    public void testTopPopulatedCitiesInCountry() {
    }

    @Test
    public void testTopPopulatedCitiesInDistrict() {
    }

}
