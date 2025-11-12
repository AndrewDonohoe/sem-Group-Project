package com.napier.sem.models;

/**
 * The City class is used to create a template layout for an object of type City.
 * It takes in a String name, String countryCode, String district, and int population.
 * It has its own toString which it overrides from the Object class.
 */
public class City {

    private final String name;
    private final String countryCode;
    public final String district;
    public final Integer population;

    /**
     * Creates a new instance of the City class passing in the values:
     * @param name city name
     * @param countryCode the 3-letter code to identify the country the city is in
     * @param district the name of the district the city is in
     * @param population the total population of the city
     */
    public City(String name, String countryCode, String district, Integer population) {
        this.name = name;
        this.countryCode = countryCode;
        this.district = district;
        this.population = population;
    }

    /**
     * Getter for the property name
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Getter for the property countryCode
     * @return countryCode
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Overrides Objects toString method to make it instead output the name, countryCode,
     * district and population of the instance of the City object
     * @return a string with info about the city
     */
    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", countryCode='" + countryCode + '\'' +
                ", district='" + district + '\'' +
                ", population=" + population +
                '}';
    }

}
