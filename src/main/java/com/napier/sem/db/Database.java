package com.napier.sem.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.function.Function;

/**
 * The Database class handles connecting to a MySQL database
 * and running queries on it. It hides away all the complicated
 * database setup details so other parts of the program can just
 * call this class to run SQL commands
 */
public class Database implements DatabaseInterface {

    // These are the details we need to connect to the database.
    // 'url' is where the database lives, 'username' and 'password'
    // are the login credentials
    private final String url;
    private final String username;
    private final String password;

    /**
     * Constructor – runs when we create a new Database object.
     * It stores the connection details and makes sure the MySQL
     * driver is loaded
     */
    public Database(String url, String username, String password) {
        this.url = url;
        this.username = username;
        this.password = password;

        try {
            // This line loads the MySQL database driver so Java knows
            // how to talk to the database. It must be done before connecting
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            // If the driver can’t be loaded, we print an error and stop the program
            System.out.println("Could not load SQL driver");
            System.exit(-1);
        }
    }

    /**
     * Runs a SQL SELECT query and lets the caller decide how to process
     * the results.
     * <p>Note: We pass in a "mapper" function because inside this method we
     * create a Connection, a Statement, and a ResultSet. These are resources
     * that must be closed after use to avoid memory leaks or connection issues.
     *
     * <p> If this method returned the raw ResultSet directly, we would have to
     * close all those resources manually outside of this method, which is risky
     * and can easily lead to forgotten or incorrect cleanup.
     *
     * <p> By passing in a mapper function instead, we can process the ResultSet
     * while it’s still open inside the try-with-resources block, and then
     * automatically close everything afterward. This keeps resource management
     * safe and hidden from the caller.
     *
     *
     * @param selectQuery The SQL query string (e.g. "SELECT * FROM city").
     * @param mapper A function that takes the ResultSet (the data returned
     *               by the query) and turns it into whatever type the caller wants.
     *               For example, it could turn the results into a list of City objects.
     * @param <T> The type of object that the mapper returns.
     *            (This is a Java feature called “generics”, which lets us
     *            make the method work with different data types)
     *
     * @return The processed result (for example, a list of cities, or a single value),
     *         or null if something went wrong.
     */
    public <T> T executeQuery(String selectQuery, Function<ResultSet, T> mapper) {
        /*
         * The "try (...)" syntax below is called a "try-with-resources" block.
         * It’s used when working with things like database connections or files
         * that need to be closed when you’re done with them.
         *
         * Any object you open inside the parentheses (Connection, Statement, ResultSet)
         * will automatically be closed at the end of the try block,
         * even if there’s an error. This helps prevent memory leaks
         * or leaving the database connection open accidentally.
         */
        try (Connection con = DriverManager.getConnection(url, username, password);
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(selectQuery)) {

            /*
             * The 'mapper' here is a function that someone else passes in.
             * We give it the ResultSet (the table of data returned from the SQL query),
             * and it decides what to do with it — for example, loop through it
             * and create objects from each row.
             *
             * This design makes the Database class flexible — it doesn’t need to know
             * what kind of data we’re fetching or how to process it.
             * The caller provides that logic through the 'mapper' function.
             */
            return mapper.apply(rs);

        } catch (Exception e) {
            // If anything goes wrong (like a bad query or lost connection),
            // print the error message and return null.
            System.out.println("Exception: " + e.getMessage());
            return null;
        }
    }
}
