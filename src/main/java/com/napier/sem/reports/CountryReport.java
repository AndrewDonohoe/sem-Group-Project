package com.napier.sem.reports;

import com.napier.sem.db.DatabaseInterface;
import com.napier.sem.db.SqlQueries;
import com.napier.sem.models.Country;

import java.util.ArrayList;

public class CountryReport {

    private final DatabaseInterface database;

    public CountryReport(DatabaseInterface database){
        this.database = database;
    }

    public String countriesInWorldLargestToSmallest() {
        return null;
    }

    public String countriesInContinentSmallestToLargest(String continent) {

        ArrayList<Country> countriesInContinent = database.executeQuery(SqlQueries.countryInContinentLargestToSmallestQuery(continent),
            resultSet -> {
                ArrayList<Country> countryList = new ArrayList<>();
                try {
                    while (resultSet.next()){
                        countryList.add(
                            new Country(
                                    resultSet.getString("Code"),
                                    resultSet.getString("Name"),
                                    resultSet.getString("Continent"),
                                    resultSet.getString("Region"),
                                    resultSet.getInt("Population"),
                                    resultSet.getInt("Capital")
                            )
                        );
                    }
                } catch (Exception e) {
                    System.out.println("Error: " + e.getMessage());
                }
                return countryList;
            }
        );
        return countriesInContinent.toString();
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
