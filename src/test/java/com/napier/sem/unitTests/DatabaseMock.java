package com.napier.sem.unitTests;

import com.napier.sem.db.DatabaseInterface;
import com.napier.sem.reports.CapitalCityReport;

import java.sql.ResultSet;
import java.util.function.Function;

public class DatabaseMock implements DatabaseInterface {


    @Override
    public <T> T executeQuery(String selectQuery, Function<ResultSet, T> mapper) {
        return null;
    }
}
