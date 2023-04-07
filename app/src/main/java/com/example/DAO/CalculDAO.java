package com.example.DAO;

import android.content.ContentValues;
import android.database.Cursor;

import com.example.mini_jeucalcul.model.entities.Score;

public class CalculDAO extends BaseDao<Score> {
    public CalculDAO(DataBaseHelper helper) {
        super(helper);
    }

    public static String TABLE_NAME = "ListeScore";
    public static String Score = "Score";
    @Override
    protected String getTableName() {
        return TABLE_NAME;
    }

    @Override
    protected void putValues(ContentValues values, Score entity) {
        values.put(Score,entity.getScore());
    }

    @Override
    protected Score getEntity(Cursor cursor) {
        Integer indexScore = cursor.getColumnIndex(Score);
        Score monScore = new Score();
        monScore.setScore(cursor.getInt(indexScore));
        return monScore;
    }
}
