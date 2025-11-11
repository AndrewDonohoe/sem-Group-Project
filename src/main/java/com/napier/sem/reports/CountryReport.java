package com.napier.sem.reports;

import com.napier.sem.db.DatabaseInterface;

public class CountryReport {

    private final DatabaseInterface database;

    public CountryReport(DatabaseInterface database){
        this.database = database;
    }

    public String countriesInWorldLargestToSmallest() {
        return null;
    }

    public String countriesInContinentSmallestToLargest(String continent) {
        return null;
    }

    public String countriesInRegionSmallestToLargest() {
        return null;
    }

    public String topPopulatedCountriesInWorld(int n) {
        return null;
    }

    public String topPopulatedCountriesInContinent(int n) {
        return null;
    }

    public String topPopulatedCountriesInRegion(int n) {
        return null;
    }
}
