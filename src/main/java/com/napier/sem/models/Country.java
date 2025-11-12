package com.napier.sem.models;

/**
 * The Country class is used to create a template layout for an object of type Country.
 * It takes in a String code, String name, String continent, String region, int population and int capital.
 * It has its own toString which it overrides from the Object class.
 */
public class Country {

    private final String code;
    private final String name;
    private final String continent;
    private final String region;
    private final Integer population;
    private final Integer capital;

    /**
     * Creates a new instance of the Country class passing in values:
     * @param code the unique 3-letter code to identify a country
     * @param name country name
     * @param continent name of the continent that the country is in
     * @param region name of the region that the country is in
     * @param population total population of the country
     * @param capital a number representing the capital city's name
     */
    public Country(String code, String name, String continent, String region, Integer population, Integer capital) {
        this.code = code;
        this.name = name;
        this.continent = continent;
        this.region = region;
        this.population = population;
        this.capital = capital;
    }

    /**
     * @return code (3-letter country code)
     */
    public String getCode() {
        return code;
    }

    /**
     * @return name (countries name)
     */
    public String getName() {
        return name;
    }

    /**
     * @return continent (the continent name where the country is located)
     */
    public String getContinent() {
        return continent;
    }

    /**
     * @return region (the region name where the country is located)
     */
    public String getRegion() {
        return region;
    }

    /**
     * @return population (the total population of the country)
     */
    public Integer getPopulation() {
        return population;
    }

    /**
     * @return capital (an int representing the capital city)
     */
    public Integer getCapital() {
        return capital;
    }

    /**
     * Overrides Objects toString method to make it instead output the code, name, continent
     * region, population and capital of the instance of the Country object
     * @return a string with info about the country
     */
    @Override
    public String toString() {
        return "Country{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", continent='" + continent + '\'' +
                ", region='" + region + '\'' +
                ", population=" + population +
                ", capital=" + capital +
                '}';
    }
}
