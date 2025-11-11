package com.napier.sem.reports;

import com.napier.sem.db.DatabaseInterface;

public class PopulationReport {

    private final DatabaseInterface database;

    public PopulationReport(DatabaseInterface database){
        this.database = database;
    }

    public String populationOfPeopleInAndOutOfCitiesInEachContinent() {
        return null;
    }

    public String populationOfPeopleInAndOutOfCitiesInEachRegion() {
        return null;
    }

    public String populationOfPeopleInAndOutOfCitiesInEachCountry() {
        return null;
    }

    public String populationOfArea(String area) {
        if (area.equals("World")) {
            System.out.println("Area is World");
        } else if (area.equals("Continent")) {

        } else if (area.equals("Region")) {

        } else if (area.equals("Country")) {

        } else if (area.equals("District")) {

        } else if (area.equals("City")) {

        }
        return null;
    }

    public String populationOfPeopleWhoSpeakDifferentLanguages() {
        return null;
    }
}
