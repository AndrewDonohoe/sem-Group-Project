package com.napier.sem.unitTests;

import com.napier.sem.db.DatabaseInterface;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetMetaDataImpl;
import javax.sql.rowset.RowSetProvider;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.function.Function;

public class CountryDatabaseMock implements DatabaseInterface {

    public CountryDatabaseMock() {}

    @Override
    public <T> T executeQuery(String selectQuery, Function<ResultSet, T> mapper) {
        try(
                CachedRowSet rowSet = RowSetProvider.newFactory().createCachedRowSet();
        ) {
            RowSetMetaDataImpl meta = new RowSetMetaDataImpl();
            meta.setColumnCount(6);
            meta.setColumnName(1, "code");
            meta.setColumnType(1, Types.VARCHAR);

            meta.setColumnName(2, "name");
            meta.setColumnType(2, Types.VARCHAR);

            meta.setColumnName(3, "continent");
            meta.setColumnType(3, Types.VARCHAR);

            meta.setColumnName(4, "region");
            meta.setColumnType(4, Types.VARCHAR);

            meta.setColumnName(5, "population");
            meta.setColumnType(5, Types.INTEGER);

            meta.setColumnName(6, "capital");
            meta.setColumnType(6, Types.INTEGER);

            rowSet.setMetaData(meta);

            rowSet.moveToInsertRow();
            rowSet.updateString("code", "CHN");
            rowSet.updateString("name", "China");
            rowSet.updateString("continent", "Asia");
            rowSet.updateString("region", "Eastern Asia");
            rowSet.updateInt("population", 1277558000);
            rowSet.updateInt("capital", 1891);
            rowSet.insertRow();
            rowSet.moveToCurrentRow();
            rowSet.beforeFirst();
            return mapper.apply(rowSet);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
