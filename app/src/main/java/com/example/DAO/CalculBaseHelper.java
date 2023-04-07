package com.example.DAO;

import android.content.Context;

public class CalculBaseHelper extends DataBaseHelper {
    public CalculBaseHelper(Context context, String dataBaseName, int dataBaseVersion) {
        super(context, dataBaseName, dataBaseVersion);
    }

    @Override
    protected String getCreationSql() {
        return "CREATE TABLE IF NOT EXISTS " + CalculDAO.TABLE_NAME + " (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                CalculDAO.Score + " INTEGER NOT NULL" + ")";
    }

    @Override
    protected String getDeleteSql() {
        return "DROP TABLE IF EXISTS "+ CalculDAO.TABLE_NAME;    }
}