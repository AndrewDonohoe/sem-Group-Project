package com.napier.sem.models;

public class City {

    private final String name;
    private final String countryCode;
    public final String district;
    public final Integer population;

    public City(String name, String countryCode, String district, Integer population) {
        this.name = name;
        this.countryCode = countryCode;
        this.district = district;
        this.population = population;
    }

    public String getName() {
        return name;
    }
    public String getCountryCode() {
        return countryCode;
    }

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
