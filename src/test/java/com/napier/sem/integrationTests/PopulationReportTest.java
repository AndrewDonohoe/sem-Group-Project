package com.napier.sem.integrationTests;

import com.napier.sem.db.Database;
import com.napier.sem.db.DatabaseInterface;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class PopulationReportTest {

    static DatabaseInterface db;

    @BeforeAll
    static void init() {
        db = new Database(
                "jdbc:mysql://db:3306/world?useSSL=false&allowPublicKeyRetrieval=true",
                "root",
                "example"
        );
    }

    @Test
    public void testPopulationOfPeopleInAndOutOfCitiesInEachContinent() {
    }

    @Test
    public void testPopulationOfPeopleInAndOutOfCitiesInEachRegion() {
    }

    @Test
    public void testPopulationOfPeopleInAndOutOfCitiesInEachCountry() {
    }

    @Test
    public void testPopulationOfArea() {
//        if (area.equals("World")) {
//            System.out.println("Area is World");
//        } else if (area.equals("Continent")) {
//
//        } else if (area.equals("Region")) {
//
//        } else if (area.equals("Country")) {
//
//        } else if (area.equals("District")) {
//
//        } else if (area.equals("City")) {
//
//        }
    }

    @Test
    public void testPopulationOfPeopleWhoSpeakDifferentLanguages() {

    }
}
