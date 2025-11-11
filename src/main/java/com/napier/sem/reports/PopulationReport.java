package com.napier.sem.reports;

import com.napier.sem.db.DatabaseInterface;
import com.napier.sem.db.SqlQueries;
import com.napier.sem.models.Population;

import java.util.ArrayList;

public class PopulationReport {

    private final DatabaseInterface database;

    public PopulationReport(DatabaseInterface database){
        this.database = database;
    }

    public String populationOfPeopleInAndOutOfCitiesInEachContinent() {

        ArrayList<Population> populationInCities = database.executeQuery(SqlQueries.populationOfPeoplePeopleLivingInCitiesAndPeopleNotLivingInCitiesInEachContinent,
                resultSet -> {
                    ArrayList<Population> populationList = new ArrayList<>();
           try {
               while (resultSet.next()) {
                   populationList.add(
                           new Population(
                                   resultSet.getString("Continent"),
                                   resultSet.getInt("total_population"),
                                   resultSet.getInt("population_in_cities"),
                                   resultSet.getInt("population_not_in_cities"
                                   )
                           )
                   );
               }
           } catch (Exception e) {
               System.out.println("Error: " + e.getMessage());
           }
           return populationList;
                }
        );

        return populationInCities.toString();

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
