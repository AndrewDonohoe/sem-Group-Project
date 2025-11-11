/*
Basic hello world program
 */

package com.napier.sem;

import com.napier.sem.db.Database;
import com.napier.sem.db.SqlQueries;
import com.napier.sem.models.City;
import com.napier.sem.reports.PopulationReport;

import java.sql.*;

public class App
{
    public static void main(String[] args)
    {
        try
        {
            // Load Database driver
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch (ClassNotFoundException e)
        {
            System.out.println("Could not load SQL driver");
            System.exit(-1);
        }

        // Connection to the database
        Connection con = null;
        int retries = 100;
        for (int i = 0; i < retries; ++i)
        {
            System.out.println("Connecting to database...");
            try
            {
                // Wait a bit for db to start
                Thread.sleep(1000);
                // Connect to database
                con = DriverManager.getConnection("jdbc:mysql://db:3306/world?useSSL=false&allowPublicKeyRetrieval=true", "root", "example");
                System.out.println("Successfully connected");
                // Wait a bit
                Thread.sleep(1000);
                // Exit for loop
                break;
            }
            catch (SQLException sqle)
            {
                System.out.println("Failed to connect to database attempt " );
                System.out.println(sqle.getMessage());
            }
            catch (InterruptedException ie)
            {
                System.out.println("Thread interrupted? Should not happen.");
            }
        }

        if (con != null)
        {
            try
            {
                // Close connection
                con.close();
            }
            catch (Exception e)
            {
                System.out.println("Error closing connection to database");
            }
        }

        Database db = new Database(
                "jdbc:mysql://db:3306/world?useSSL=false&allowPublicKeyRetrieval=true",
                "root",
                "example"
        );

        City resultCity = db.executeQuery(
                SqlQueries.exampleQuery,
                res -> {
                    try {
                        if (!res.next()) return null; // move to first row
                        return new City(
                                res.getString("Name"),
                                res.getString("CountryCode"),
                                res.getString("District"),
                                res.getInt("Population")
                        );
                    } catch (SQLException e) {
                        throw new RuntimeException(e);
                    }
                });

        System.out.println("Example Query Output: ");
        System.out.println(resultCity);

        PopulationReport populationReport = new PopulationReport(db);
        String result = populationReport.populationOfPeopleInAndOutOfCitiesInEachContinent();
        System.out.println("Population in and out of cities per continent output: ");
        System.out.println(result);

    }
}