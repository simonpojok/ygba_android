package org.ygba.youthgobudget.data;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import org.ygba.youthgobudget.data.agriculture.AgricultureDao;
import org.ygba.youthgobudget.data.agriculture.AgricultureQuestion;

@Database(entities = {AgricultureQuestion.class}, version = 1)
public abstract class YGBDatabase extends RoomDatabase {
    private static YGBDatabase INSTANCE;
    public abstract AgricultureDao agricultureDao();

    public static YGBDatabase getInstance(Context context) {
        if (INSTANCE == null ) {
            INSTANCE = Room.databaseBuilder(context, YGBDatabase.class, "ygba-db").build();
        }
        return INSTANCE;
    }
}
