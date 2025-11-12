package com.napier.sem.reports;

import com.napier.sem.db.DatabaseInterface;

/**
 * The CapitalCityReport class is responsible for creating different types
 * of capitalCity-related reports by getting data from the database.
 */
public class CapitalCityReport {

    private final DatabaseInterface database;

    /**
     * Constructor that receives a database connection (or mock database).
     * This allows the class to fetch data without knowing how the database works.
     */
    public CapitalCityReport(DatabaseInterface database){
        this.database = database;
    }

    /**
     * Gets a list of all capital cities in the world from largest to smallest
     * (currently not implemented)
     */
    public String capitalCitiesInWorldLargestToSmallest() {
        return null;
    }

    /**
     * Gets a list of all capital cities in a continent which is inputted from largest to smallest
     * (currently not implemented)
     */
    public String capitalCitiesInContinentLargestToSmallest() {
        return null;
    }

    /**
     * Gets a list of all capital cities in a region which is inputted from largest to smallest
     * (currently not implemented)
     */
    public String capitalCitiesInRegionLargestToSmallest() {
        return null;
    }

    /**
     * Gets a list of n capital cities in the world
     * @param n is the number of capital cities which are to be displayed
     * (currently not implemented)
     */
    public String topPopulatedCapitalCitiesInWorld(int n) {
        return null;
    }

    /**
     * Gets a list of n capital cities in a continent which is inputted
     * @param n is the number of capital cities which are to be displayed
     * (currently not implemented)
     */
    public String topPopulatedCapitalCitiesInContinent(int n) {
        return null;
    }

    /**
     * Gets a list of n capital cities in a region which is inputted
     * @param n is the number of capital cities which are to be displayed
     * (currently not implemented)
     */
    public String topPopulatedCapitalCitiesInRegion(int n) {
        return null;
    }
}
