package com.napier.sem.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.function.Function;

public class Database {

    private final String url;
    private final String username;
    private final String password;

    public Database(String url, String username, String password) {
        this.url = url;
        this.username = username;
        this.password = password;

        try {
            // Load Database driver
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Could not load SQL driver");
            System.exit(-1);
        }
    }

    public <T> T executeQuery(String selectQuery, Function<ResultSet, T> mapper) {
        try (Connection con = DriverManager.getConnection(url, username, password);
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(selectQuery)) {

            return mapper.apply(rs);

        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
            return null;
        }
    }
}
