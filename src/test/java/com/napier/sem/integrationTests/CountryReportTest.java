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
    public void testCountriesInContinentSmallestToLargest() {
        CountryReport countryReport = new CountryReport(db);
        String result = countryReport.countriesInContinentSmallestToLargest("South America");
        assertNotNull(result);
        assertNotEquals("", result);
    }

    @Test
    public void testCountriesInRegionSmallestToLargest() {
        CountryReport countryReport = new CountryReport(db);
        String result = countryReport.countriesInRegionSmallestToLargest();
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
