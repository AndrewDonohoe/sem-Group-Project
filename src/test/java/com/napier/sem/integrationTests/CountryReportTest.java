package com.napier.sem.integrationTests;

import com.napier.sem.db.Database;
import com.napier.sem.db.DatabaseInterface;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

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
