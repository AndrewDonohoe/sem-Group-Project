package com.napier.sem.models;

public class Country {

    private final String code;
    private final String name;
    private final String continent;
    private final String region;
    private final Integer population;
    private final Integer capital;

    public Country(String code, String name, String continent, String region, Integer population, Integer capital) {
        this.code = code;
        this.name = name;
        this.continent = continent;
        this.region = region;
        this.population = population;
        this.capital = capital;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getContinent() {
        return continent;
    }

    public String getRegion() {
        return region;
    }

    public Integer getPopulation() {
        return population;
    }

    public Integer getCapital() {
        return capital;
    }
}
