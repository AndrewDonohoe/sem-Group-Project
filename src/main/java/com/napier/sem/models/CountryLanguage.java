package com.napier.sem.models;

public class CountryLanguage {

    private final String countyCode;
    private final String language;
    private final Boolean isOfficial;
    private final Float percentage;

    public CountryLanguage(String countryCode, String language, Boolean isOfficial, Float percentage) {
        this.countyCode = countryCode;
        this.language = language;
        this.isOfficial = isOfficial;
        this.percentage = percentage;
    }

    public String getCountyCode() {
        return countyCode;
    }

    public String getLanguage() {
        return language;
    }

    public Boolean getIsOfficial() {
        return isOfficial;
    }

    public Float getPercentage() {
        return percentage;
    }

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
