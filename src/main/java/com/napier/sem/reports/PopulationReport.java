package com.napier.sem.reports;

import com.napier.sem.db.DatabaseInterface;
import com.napier.sem.db.SqlQueries;
import com.napier.sem.models.Population;

import java.util.ArrayList;

/**
 * The PopulationReport class is responsible for creating different types
 * of population-related reports by getting data from the database.
 * <p>
 * It uses a DatabaseInterface so that it doesn’t depend on the real
 * database directly — which makes it easier to test with mock data.
 */
public class PopulationReport {

    // This is the database connection, but it's stored as an interface
    // That means we can pass in either the real database or a mock one for testing
    private final DatabaseInterface database;

    /**
     * Constructor that receives a database connection (or mock database).
     * This allows the class to fetch data without knowing how the database works.
     */
    public PopulationReport(DatabaseInterface database){
        this.database = database;
    }

    /**
     * Gets the population of people who live inside and outside cities
     * for each continent.
     *
     * <p>Here’s what this method does step-by-step:
     * <ol>
     *   <li>It sends an SQL query (stored in SqlQueries.populationOfPeoplePeopleLivingInCitiesAndPeopleNotLivingInCitiesInEachContinent)
     *       to the database.</li>
     *   <li>The query returns data with columns like "Continent", "total_population",
     *       "population_in_cities", and "population_not_in_cities".</li>
     *   <li>The database’s executeQuery() method runs the SQL and gives the results
     *       (in a ResultSet) to the mapper function defined here.</li>
     *   <li>Inside the mapper function, we loop through each row of the ResultSet
     *       and create a new Population object for each continent.</li>
     *   <li>Each Population object stores the name of the continent and its population
     *       numbers (total, in cities, and not in cities).</li>
     *   <li>All Population objects are added to an ArrayList, which is returned
     *       back to this method.</li>
     *   <li>Finally, the method returns the list as a string (using .toString()).</li>
     * </ol>
     *
     * <p>In short: this method asks the database for population data by continent
     * and converts the raw query results into a list of Population objects
     * that are easy to work with in Java.
     *
     * @return A string version of the list of Population objects,
     *         each representing one continent.
     */
    public String populationOfPeopleInAndOutOfCitiesInEachContinent() {

        // Run the SQL query using the database object
        // The result is processed by the "mapper" function we pass in
        ArrayList<Population> populationInCities = database.executeQuery(SqlQueries.populationOfPeoplePeopleLivingInCitiesAndPeopleNotLivingInCitiesInEachContinent,
                resultSet -> {
                    // Create a list to hold the Population objects we’ll build
                    ArrayList<Population> populationList = new ArrayList<>();
                    try {
                        // Go through each row of the query result
                        while (resultSet.next()) {
                            populationList.add(
                                    // Create a Population object for this continent
                                    // using the data from the current row
                                    new Population(
                                            resultSet.getString("Continent"),
                                            resultSet.getLong("total_population"),
                                            resultSet.getLong("population_in_cities"),
                                            resultSet.getLong("population_not_in_cities")
                                    )
                            );
                        }
                    } catch (Exception e) {
                        // If something goes wrong while reading the data,
                        // print an error message
                        System.out.println("Error: " + e.getMessage());
                    }
                    // Return the list of Population objects to executeQuery(
                    return populationList;
        });

        // Convert the list to a string (for now) and return it.
        // Later, this could be replaced with proper report formatting
        return populationInCities.toString();

    }

    /**
     * Gets the population of people who live inside and outside cities
     * for each region.
     * (currently not implemented)
     */
    public String populationOfPeopleInAndOutOfCitiesInEachRegion() {

        // Run the SQL query using the database object
        // The result is processed by the "mapper" function we pass in
        ArrayList<Population> populationInCities = database.executeQuery(SqlQueries.populationOfPeoplePeopleLivingInCitiesAndPeopleNotLivingInCitiesInEachRegion,
                resultSet -> {
                    // Create a list to hold the Population objects we’ll build
                    ArrayList<Population> populationList = new ArrayList<>();
                    try {
                        // Go through each row of the query result
                        while (resultSet.next()) {
                            populationList.add(
                                    // Create a Population object for this continent
                                    // using the data from the current row
                                    new Population(
                                            resultSet.getString("Region"),
                                            resultSet.getLong("total_population"),
                                            resultSet.getLong("population_in_cities"),
                                            resultSet.getLong("population_not_in_cities")
                                    )
                            );
                        }
                    } catch (Exception e) {
                        // If something goes wrong while reading the data,
                        // print an error message
                        System.out.println("Error: " + e.getMessage());
                    }
                    // Return the list of Population objects to executeQuery(
                    return populationList;
                });

        // Convert the list to a string (for now) and return it.
        // Later, this could be replaced with proper report formatting
        return populationInCities.toString();

    }

    /**
     * Gets the population of people who live inside and outside cities
     * for each country.
     * (currently not implemented)
     */
    public String populationOfPeopleInAndOutOfCitiesInEachCountry() {

        // Run the SQL query using the database object
        // The result is processed by the "mapper" function we pass in
        ArrayList<Population> populationInCities = database.executeQuery(SqlQueries.populationOfPeoplePeopleLivingInCitiesAndPeopleNotLivingInCitiesInEachCountry,
                resultSet -> {
                    // Create a list to hold the Population objects we’ll build
                    ArrayList<Population> populationList = new ArrayList<>();
                    try {
                        // Go through each row of the query result
                        while (resultSet.next()) {
                            populationList.add(
                                    // Create a Population object for this continent
                                    // using the data from the current row
                                    new Population(
                                            resultSet.getString("country"),
                                            resultSet.getLong("total_population"),
                                            resultSet.getLong("population_in_cities"),
                                            resultSet.getLong("population_not_in_cities")
                                    )
                            );
                        }
                    } catch (Exception e) {
                        // If something goes wrong while reading the data,
                        // print an error message
                        System.out.println("Error: " + e.getMessage());
                    }
                    // Return the list of Population objects to executeQuery(
                    return populationList;
                });

        // Convert the list to a string (for now) and return it.
        // Later, this could be replaced with proper report formatting
        return populationInCities.toString();

    }

    /**
     * Gets the population of the given area
     * If the area is anything other than world they then need to enter the name of the area
     * (i.e., Africa for Continent)
     * (currently not implemented)
     * @param area name of area to check (World, Continent, Region, Country, District, City)
     */
    public String populationOfArea(String area) {
        if (area.equals("World")) {

        } else if (area.equals("Continent")) {

        } else if (area.equals("Region")) {

        } else if (area.equals("Country")) {

        } else if (area.equals("District")) {

        } else if (area.equals("City")) {

        }
        return null;
    }

    /**
     * Displays the population of people who speak different languages
     * from largest to smallest
     * (currently not implemented)
     */
    public String populationOfPeopleWhoSpeakDifferentLanguages() {
        return null;
    }
}
