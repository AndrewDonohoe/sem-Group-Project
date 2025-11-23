package com.napier.sem.reports;

import com.napier.sem.db.DatabaseInterface;
import com.napier.sem.db.SqlQueries;
import com.napier.sem.models.City;
import com.napier.sem.models.Country;

import java.util.ArrayList;

/**
 * The CityReport class is responsible for creating different types
 * of city-related reports by getting data from the database.
 */
public class CityReport {

    private final DatabaseInterface database;

    /**
     * Constructor that receives a database connection (or mock database).
     * This allows the class to fetch data without knowing how the database works.
     */
    public CityReport(DatabaseInterface database){
        this.database = database;
    }

    /**
     * Gets a list of all cities in the world from largest to smallest
     * (currently not implemented)
     */
    public String citiesInWorldLargestToSmallest() {
        ArrayList<City> citiesInWorld = database.executeQuery(SqlQueries.citiesInWorldLargestToSmallestQuery,
                resultSet -> {
                    ArrayList<City> citiesList = new ArrayList<>();
                    try {
                        while (resultSet.next()){
                            citiesList.add(
                                    new City(
                                            resultSet.getString("Madrid"),
                                            resultSet.getString("Europe"),
                                            resultSet.getString("southwestern Europe"),
                                            resultSet.getInt("3,422,416")
                                    )
                            );
                        }
                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    return citiesList;
                }
        );
        return citiesInWorld.toString();
    }

    /**
     * Gets a list of all cities in a continent which is inputted from largest to smallest
     * (currently not implemented)
     */
    public String citiesInContinentLargestToSmallest() {
        return null;
    }

    /**
     * Gets a list of all cities in a region which is inputted from largest to smallest
     * (currently not implemented)
     */
    public String citiesInRegionLargestToSmallest() {
        return null;
    }

    /**
     * Gets a list of all cities in a country which is inputted from largest to smallest
     * (currently not implemented)
     */
    public String citiesInCountryLargestToSmallest() {
        return null;
    }

    /**
     * Gets a list of all cities in a district which is inputted from largest to smallest
     * (currently not implemented)
     */
    public String citiesInDistrictLargestToSmallest() {
        return null;
    }

    /**
     * Gets a list of n cities in the world
     * (currently not implemented)
     * @param n is the number of cities which are to be displayed
     */
    public String topPopulatedCitiesInWorld(int n) {
        return null;
    }

    /**
     * Gets a list of n cities in a continent which is inputted
     * (currently not implemented)
     * @param n is the number of cities which are to be displayed
     */
    public String topPopulatedCitiesInContinent(int n) {
        return null;

    }

    /**
     * Gets a list of n cities in a region which is inputted
     * (currently not implemented)
     * @param n is the number of cities which are to be displayed
     */
    public String topPopulatedCitiesInRegion(int n) {
        return null;
    }

    /**
     * Gets a list of n cities in a country which is inputted
     * (currently not implemented)
     * @param n is the number of cities which are to be displayed
     */
    public String topPopulatedCitiesInCountry(int n) {
        return null;
    }

    /**
     * Gets a list of n cities in a district which is inputted
     * (currently not implemented)
     * @param n is the number of cities which are to be displayed
     */
    public String topPopulatedCitiesInDistrict(int n) {
        return null;
    }
}
