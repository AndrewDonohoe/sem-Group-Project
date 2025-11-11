package com.napier.sem.models;

public class Population{
    private final String areaName;
    private final Integer totalPopulation;
    private final Integer populationInCities;
    private final Integer populationOutCities;

    public Population(String areaName, Integer totalPopulation) {
        this.areaName = areaName;
        this.totalPopulation = totalPopulation;
        this.populationInCities = null;
        this.populationOutCities = null;
    }

    public Population(String areaName, Integer totalPopulation,  Integer populationInCities, Integer populationOutCities) {
        this.areaName = areaName;
        this.totalPopulation = totalPopulation;
        this.populationInCities =  populationInCities;
        this.populationOutCities = populationOutCities;
    }

    public String getAreaName() {
        return areaName;
    }

    public Integer getTotalPopulation() {
        return totalPopulation;
    }

    public Integer getPopulationInCities() {
        return populationInCities;
    }

    public Integer getPopulationOutCities() {
        return populationOutCities;
    }

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
