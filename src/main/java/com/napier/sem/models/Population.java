package com.napier.sem.models;

/**
 * The Population class is used to create a template layout for an object of type Population.
 * It takes in a String areaName, Long totalPopulation, Long populationInCities and Long populationOutCities.
 * It has its own toString which it overrides from the Object class.
 */
public class Population{
    private final String areaName;
    private final Long totalPopulation;
    private final Long populationInCities;
    private final Long populationOutCities;

    /**
     * Creates a new instance of the Population class passing in values:
     * @param areaName the name of the area (could be names of continents, regions, countries, districts)
     * @param totalPopulation the totalPopulation of that area
     */
    public Population(String areaName, Long totalPopulation) {
        this.areaName = areaName;
        this.totalPopulation = totalPopulation;
        this.populationInCities = null;
        this.populationOutCities = null;
    }

    /**
     * Creates a new instance of the Population class passing in values:
     * @param areaName the name of the area (could be names of continents, regions, countries, districts)
     * @param totalPopulation the totalPopulation of that area
     * @param populationInCities the total population of people who live in cities
     * @param populationOutCities the total population of people who don't live in cities
     */
    public Population(String areaName, Long totalPopulation,  Long populationInCities, Long populationOutCities) {
        this.areaName = areaName;
        this.totalPopulation = totalPopulation;
        this.populationInCities =  populationInCities;
        this.populationOutCities = populationOutCities;
    }

    /**
     * @return areaName (the name of the Population objects area)
     */
    public String getAreaName() {
        return areaName;
    }

    /**
     * @return totalPopulation (the total population in the area)
     */
    public Long getTotalPopulation() {
        return totalPopulation;
    }

    /**
     * @return populationInCities (the total population of people who live in cities in the area)
     */
    public Long getPopulationInCities() {
        return populationInCities;
    }

    /**
     * @return populationOutCities (the total population of people who live in the area but don't live in any cities)
     */
    public Long getPopulationOutCities() {
        return populationOutCities;
    }

    /**
     * Overrides Objects toString method to make it instead output the areaName, totalPopulation
     * populationInCities, and populationOutCities of the instance of the Population object
     * @return a string with info about the Population
     */
    @Override
    public String toString() {
        return "Population{" +
                "areaName='" + areaName + '\'' +
                ", totalPopulation='" + totalPopulation + '\'' +
                ", populationInCities='" + populationInCities + '\'' +
                ", populationOutCities='" + populationOutCities + '\'' +
                '}';
    }
}
