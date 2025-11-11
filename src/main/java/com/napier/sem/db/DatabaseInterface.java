package com.napier.sem.db;

import java.sql.ResultSet;
import java.util.function.Function;

public interface DatabaseInterface {

    <T> T executeQuery(String selectQuery, Function<ResultSet, T> mapper);
}
