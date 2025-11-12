package com.napier.sem.unitTests;

import com.napier.sem.db.DatabaseInterface;

import java.sql.ResultSet;
import java.util.function.Function;

public class CapitalCityDatabaseMock implements DatabaseInterface {

    public CapitalCityDatabaseMock() {}

    @Override
    public <T> T executeQuery(String selectQuery, Function<ResultSet, T> mapper) {
        return null;
    }
}
