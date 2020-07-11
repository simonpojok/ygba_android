package org.ygba.youthgobudget.data;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import org.ygba.youthgobudget.data.agriculture.AgricultureDao;
import org.ygba.youthgobudget.data.agriculture.AgricultureQuestion;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Database(entities = {AgricultureQuestion.class}, version = 1, exportSchema = false)
public abstract class YGBDatabase extends RoomDatabase {
    private static YGBDatabase INSTANCE;
    public abstract AgricultureDao agricultureDao();
    public static final int NUMBER_OF_THREADS = 5;
    public static final ExecutorService db_executor = Executors.newFixedThreadPool(NUMBER_OF_THREADS);


    public static YGBDatabase getInstance(Context context) {
        if (INSTANCE == null ) {
           synchronized (YGBDatabase.class) {
               if (INSTANCE == null) {
                   INSTANCE = Room.databaseBuilder(context.getApplicationContext(), YGBDatabase.class, "ygba-db").build();
               }
           }
        }
        return INSTANCE;
    }
}
