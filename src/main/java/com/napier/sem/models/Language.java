package com.napier.sem.models;

/**
 * The Population class is used to create a template layout for an object of type Population.
 * It takes in a String areaName, Long totalPopulation, Long populationInCities and Long populationOutCities.
 * It has its own toString which it overrides from the Object class.
 */
public class Language{
    private final String language;
    private final Long speakers;
    private final Double percentage;

    /**
     * Creates a new instance of the Population class passing in values:
     * @param language the name of the area (could be names of continents, regions, countries, districts)
     * @param speakers the totalPopulation of that area
     */
    public Language(String language, Long speakers, Double percentage ) {
        this.language = language;
        this.speakers = speakers;
        this.percentage = percentage;
    }


    /**
     * @return areaName (the name of the Population objects area)
     */
    public String geLanguage() {
        return language;
    }

    /**
     * @return totalPopulation (the total population in the area)
     */
    public Long getSpeakers() {
        return speakers;
    }

    /**
     * @return populationInCities (the total population of people who live in cities in the area)
     */
    public Double getPercentage() {
        return percentage;
    }

    /**
     * @return populationOutCities (the total population of people who live in the area but don't live in any cities)
     */


    /**
     * Overrides Objects toString method to make it instead output the areaName, totalPopulation
     * populationInCities, and populationOutCities of the instance of the Population object
     * @return a string with info about the Population
     */
    @Override
    public String toString() {
        return "Language{" +
                "language='" + language + '\'' +
                ", speakers='" + speakers + '\'' +
                ", percentage='" + percentage + '\'' + '}';
    }
}
