package com.napier.sem.models;

public class Population{
    private final String areaName;
    private final Long totalPopulation;
    private final Long populationInCities;
    private final Long populationOutCities;

    public Population(String areaName, Long totalPopulation) {
        this.areaName = areaName;
        this.totalPopulation = totalPopulation;
        this.populationInCities = null;
        this.populationOutCities = null;
    }

    public Population(String areaName, Long totalPopulation,  Long populationInCities, Long populationOutCities) {
        this.areaName = areaName;
        this.totalPopulation = totalPopulation;
        this.populationInCities =  populationInCities;
        this.populationOutCities = populationOutCities;
    }

    public String getAreaName() {
        return areaName;
    }

    public Long getTotalPopulation() {
        return totalPopulation;
    }

    public Long getPopulationInCities() {
        return populationInCities;
    }

    public Long getPopulationOutCities() {
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
