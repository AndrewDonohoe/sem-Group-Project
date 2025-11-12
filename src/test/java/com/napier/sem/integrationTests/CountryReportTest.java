package com.napier.sem.integrationTests;

import com.napier.sem.db.Database;
import com.napier.sem.db.DatabaseInterface;
import com.napier.sem.reports.CountryReport;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CountryReportTest {

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
    public void testCountriesInWorldLargestToSmallest() {
        CountryReport countryReport = new CountryReport(db);
        String result = countryReport.countriesInWorldLargestToSmallest();
        assertNotNull(result);
        assertNotEquals("", result);
    }

    @Test
    public void testCountriesInContinentLargestToSmallest() {
        CountryReport countryReport = new CountryReport(db);
        String result = countryReport.countriesInContinentLargestToSmallest("South America");
        assertNotNull(result);
        assertNotEquals("", result);
    }

    @Test
    public void testCountriesInRegionLargestToSmallest() {
        CountryReport countryReport = new CountryReport(db);
        String result = countryReport.countriesInRegionLargestToSmallest();
        assertNotNull(result);
        assertNotEquals("", result);
    }

    @Test
    public void testTopPopulatedCountriesInWorld() {
        CountryReport countryReport = new CountryReport(db);
        String result = countryReport.topPopulatedCountriesInWorld(10);
        assertNotNull(result);
        assertNotEquals("", result);
    }

    @Test
    public void testTopPopulatedCountriesInContinent() {
        CountryReport countryReport = new CountryReport(db);
        String result = countryReport.topPopulatedCountriesInContinent(10);
        assertNotNull(result);
        assertNotEquals("", result);
    }

    @Test
    public void testTopPopulatedCountriesInRegion() {
        CountryReport countryReport = new CountryReport(db);
        String result = countryReport.topPopulatedCountriesInRegion(10);
        assertNotNull(result);
        assertNotEquals("", result);
    }
}
