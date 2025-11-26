package com.napier.sem.unitTests;

import com.napier.sem.reports.CountryReport;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountryReportTest {
    @Test
    public void testCountriesInWorldLargestToSmallest() {
        final CountryDatabaseMock db = new CountryDatabaseMock();
        CountryReport countryReport = new CountryReport(db);
        String result = countryReport.countriesInWorldLargestToSmallest();
        assertEquals("[Country{code='CHN', name='China', continent='Asia', region='Eastern Asia', population=1277558000, capital=1891}]", result);
    }

    @Test
    public void testCountriesInContinentSmallestToLargest() {

    }

    @Test
    public void testCountriesInRegionSmallestToLargest() {

    }

    @Test
    public void testTopPopulatedCountriesInWorld() {

    }

    @Test
    public void testTopPopulatedCountriesInContinent() {

    }

    @Test
    public void testTopPopulatedCountriesInRegion() {

    }
}
