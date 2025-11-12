package com.napier.sem.db;

import java.sql.ResultSet;
import java.util.function.Function;

/**
 * The DatabaseInterface defines what a database class should be able to do.
 *
 * <p>Right now, it only includes one method: executeQuery(). This method
 * runs a SQL SELECT query and allows the caller to decide how to process
 * the results using a mapper function.
 *
 * <p>We use this interface so that our code can depend on a general "DatabaseInterface"
 * instead of a specific "Database" class. This is very helpful for **unit testing**.
 *
 * <p>For example:
 * <ul>
 *   <li>In real code, we use the actual Database class that connects to MySQL.</li>
 *   <li>In unit tests, we can create a "mock" or "fake" version of this interface
 *       that pretends to be a database but doesn’t really connect to one.</li>
 * </ul>
 *
 * <p>This means we can test our application logic without needing a real database
 * running. It makes our unit tests faster, more reliable, and easier to set up.
 *
 * <p>In short: this interface is here to separate the database code from the rest
 * of the program, so we can replace it with a mock version when testing.
 */
public interface DatabaseInterface {

    /**
     * Runs a SQL SELECT query and lets the caller decide how to process
     * the results.
     *
     * @param selectQuery The SQL query string (e.g. "SELECT * FROM city").
     * @param mapper A function that takes the ResultSet (the data returned
     *               by the query) and turns it into whatever type the caller wants.
     * @param <T> The type of object that the mapper returns.
     * @return The processed result, or null if something went wrong.
     */
    <T> T executeQuery(String selectQuery, Function<ResultSet, T> mapper);
}
