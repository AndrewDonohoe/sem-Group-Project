package com.napier.sem.unitTests;

import com.napier.sem.models.City;
import com.napier.sem.reports.CityReport;
import org.junit.jupiter.api.Test;


/**
 *Tests the citiesInWorldLargestToSmallest() method to ensure it returns
 * a non-null and non-empty result
 * This checks that the method successfully produces output and does not fail
 * when interacting with the inputs
 */
public class CityReportTest {
    @Test
    public void testCitiesInWorldLargestToSmallest() {
        CityReport cityReport = new CityReport(db);
        String result = cityReport.citiesInWorldLargestToSmallest();
        assertNotNull(result);
        assertNotEquals("", result);
    }


    /**
     *Tests the citiesInContinentLargestToSmallest() method to ensure it returns
     * a non-null and non-empty result.
     * This checks that the method successfully produces output and does not fail
     * when interacting with the inputs.
     */
    @Test
    public void testCitiesInContinentLargestToSmallest() {
        CityReport = cityReport = new CityReport(db);
        String result = cityReport.citiesInContinentLargestToSmallest();
        assertNotNull(result);
        assertNotEquals("", result);
    }

    /**
     *Tests the citiesInRegionLargestToSmallest() method to ensure it returns
     * a non-null and non-empty result.
     * This checks that the method successfully produces output and does not fail
     * when interacting with the inputs.
     */
    @Test
    public void testCitiesInRegionLargestToSmallest() {
        {
            CityReport = cityReport = new CityReport(db);
            String result = cityReport.citiesInRegionLargestToSmallest();
            assertNotNull(result);
            assertNotEquals("", result);
        }
    }


    /**
     *Tests the citiesInCountryLargestToSmallest() method to ensure it returns
     * a non-null and non-empty result
     * This checks that the method successfully produces output and does not fail
     * when interacting with the inputs
     */
    @Test
    public void testCitiesInCountryLargestToSmallest() {
        {
            CityReport = cityReport = new CityReport(db);
            String result = cityReport.citiesInCountryLargestToSmallest();
            assertNotNull(result);
            assertNotEquals("", result);
        }
    }

    /**
     *Tests the citiesInDistrictLargestToSmallest() method to ensure it returns
     * a non-null and non-empty result
     * This checks that the method successfully produces output and does not fail
     * when interacting with the inputs
     */
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
