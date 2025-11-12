package com.napier.sem.models;

/**
 * The CountryLanguage class is used to create a template layout for an object of type CountryLanguage.
 * It takes in a String countryCode, String language, Boolean isOfficial, Float percentage.
 * It has its own toString which it overrides from the Object class.
 */
public class CountryLanguage {

    private final String countyCode;
    private final String language;
    private final Boolean isOfficial;
    private final Float percentage;

    /**
     * Creates a new instance of the Country class passing in values:
     * @param countryCode the unique 3-letter code to identify a country
     * @param language the name of a language used
     * @param isOfficial a boolean value whether the language is the official language or not
     * @param percentage the percentage of the countries population which use this language
     */
    public CountryLanguage(String countryCode, String language, Boolean isOfficial, Float percentage) {
        this.countyCode = countryCode;
        this.language = language;
        this.isOfficial = isOfficial;
        this.percentage = percentage;
    }

    /**
     * @return countryCode (The 3-letter unique code for the country)
     */
    public String getCountyCode() {
        return countyCode;
    }

    /**
     * @return language (the name of a language used by in the country)
     */
    public String getLanguage() {
        return language;
    }

    /**
     * @return isOfficial (boolean value, whether the language is the countries official)
     */
    public Boolean getIsOfficial() {
        return isOfficial;
    }

    /**
     * @return percentage (the percentage of people in the country who speak this language)
     */
    public Float getPercentage() {
        return percentage;
    }

    /**
     * Overrides Objects toString method to make it instead output the countryCode, language
     * isOfficial, and percentage of the instance of the CountryLanguage object
     * @return a string with info about the CountryLanguage
     */
    @Override
    public String toString() {
        return "CountryLanguage{" +
                "countryCode='" + countyCode + '\'' +
                ", language='" + language + '\'' +
                ", isOfficial=" + isOfficial +
                ", percentage=" + percentage +
                '}';
    }

}
