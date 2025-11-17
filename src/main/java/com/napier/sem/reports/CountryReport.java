package com.napier.sem.reports;

import com.napier.sem.db.DatabaseInterface;
import com.napier.sem.db.SqlQueries;
import com.napier.sem.models.Country;

import java.util.ArrayList;

/**
 * The CountryReport class is responsible for creating different types
 * of country-related reports by getting data from the database.
 */
public class CountryReport {

    private final DatabaseInterface database;

    /**
     * Constructor that receives a database connection (or mock database).
     * This allows the class to fetch data without knowing how the database works.
     */
    public CountryReport(DatabaseInterface database){
        this.database = database;
    }

    /**
     * Gets a list of all countries in the world from largest to smallest
     * (currently not implemented)
     */
    public String countriesInWorldLargestToSmallest() {

        ArrayList<Country> countriesInContinent = database.executeQuery(SqlQueries.countryInWorldLargestToSmallestQuery,
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

    /**
     * Gets the countries in the inputted continent from largest to smallest
     * @param continent the name of the continent which we are getting countries from
     * @return A string version of the list of Country objects
     */
    public String countriesInContinentLargestToSmallest(String continent) {

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

    /**
     * Gets a list of all countries in a region which is inputted from largest to smallest
     * (currently not implemented)
     */
    public String countriesInRegionLargestToSmallest(String region) {

        ArrayList<Country> countriesInContinent = database.executeQuery(SqlQueries.countryInRegionLargestToSmallestQuery(region),
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

    /**
     * Gets a list of n countries in the world
     * @param n is the number of countries which are to be displayed
     * (currently not implemented)
     */
    public String topPopulatedCountriesInWorld(int n) {

        ArrayList<Country> countriesInContinent = database.executeQuery(SqlQueries.topPopulatedCountriesInWorldQuery(n),
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

    /**
     * Gets a list of n countries in a continent which is inputted
     * @param n is the number of countries which are to be displayed
     * (currently not implemented)
     */
    public String topPopulatedCountriesInContinent(String continent, int n) {

        ArrayList<Country> countriesInContinent = database.executeQuery(SqlQueries.topPopulatedCountriesInContinentQuery(continent, n),
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

    /**
     * Gets a list of n countries in a region which is inputted
     * @param n is the number of countries which are to be displayed
     * (currently not implemented)
     */
    public String topPopulatedCountriesInRegion(String region, int n) {

        ArrayList<Country> countriesInContinent = database.executeQuery(SqlQueries.topPopulatedCountriesInRegionQuery(region, n),
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

}
